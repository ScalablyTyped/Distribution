package typings.yeomanTest.mod

import typings.node.eventsMod.EventEmitter
import typings.yeomanGenerator.mod.Answers
import typings.yeomanTest.FnOnfulfilled
import typings.yeomanTest.FnOnrejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunContext
  extends EventEmitter
     with RunContextConstructor {
  var answers: Answers = js.native
  var args: js.Array[String] = js.native
  /**
  	 * Promise `.catch()` duck typing
  	 */
  @JSName("catch")
  var catch_Original: FnOnrejected = js.native
  var dependencies: js.Array[Dependency] = js.native
  var inDirSet: Boolean = js.native
  var ran: Boolean = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  @JSName("then")
  var then_Original: FnOnfulfilled = js.native
  /**
  	 * Hold the execution until the returned callback is triggered
  	 * @return Callback to notify the normal execution can resume
  	 */
  def async(): js.Function0[Unit] = js.native
  /**
  	 * Promise `.catch()` duck typing
  	 */
  def `catch`[TResult](): js.Promise[String | TResult] = js.native
  /**
  	 * Promise `.catch()` duck typing
  	 */
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[String | TResult] = js.native
  /**
  	 * Change directory without deleting directory content.
  	 * @param  dirPath - Directory path (relative to CWD). Prefer passing an absolute
  	 *                            file path for predictable results
  	 * @return run context instance
  	 */
  def cd(dirPath: String): this.type = js.native
  /**
  	 * Clean the directory used for tests inside inDir/inTmpDir
  	 */
  def cleanTestDirectory(): Unit = js.native
  /**
  	 * Clean the provided directory, then change directory into it
  	 * @param  dirPath - Directory path (relative to CWD). Prefer passing an absolute
  	 *                            file path for predictable results
  	 * @param [cb] - callback who'll receive the folder path as argument
  	 * @return run context instance
  	 */
  def inDir(dirPath: String): this.type = js.native
  def inDir(dirPath: String, cb: js.Function1[/* folderPath */ String, Unit]): this.type = js.native
  /**
  	 * Cleanup a temporary directy and change the CWD into it
  	 *
  	 * This method is called automatically when creating a RunContext. Only use it if you need
  	 * to use the callback.
  	 *
  	 * @param [cb] - callback who'll receive the folder path as argument
  	 * @return run context instance
  	 */
  def inTmpDir(cb: js.Function1[/* folderPath */ String, Unit]): this.type = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ String, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ String, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  /**
  	 * Return a promise representing the generator run process
  	 * @return Promise resolved on end or rejected on error
  	 */
  def toPromise(): js.Promise[String] = js.native
  /**
  	 * Provide arguments to the run context
  	 * @param  args - command line arguments as Array or space separated string
  	 */
  def withArguments(args: String): this.type = js.native
  def withArguments(args: js.Array[String]): this.type = js.native
  /**
  	 * Provide dependent generators
  	 * @param dependencies - paths to the generators dependencies
  	 * @example
  	 * var angular = new RunContext('../../app');
  	 * angular.withGenerators([
  	 *   '../../common',
  	 *   '../../controller',
  	 *   '../../main',
  	 *   [helpers.createDummyGenerator(), 'testacular:app']
  	 * ]);
  	 * angular.on('end', function () {
  	 *   // assert something
  	 * });
  	 */
  def withGenerators(dependencies: js.Array[Dependency]): this.type = js.native
  /**
  	 * Mock the local configuration with the provided config
  	 * @param  localConfig - should look just like if called config.getAll()
  	 */
  def withLocalConfig(localConfig: Dictionary[_]): this.type = js.native
  /**
  	 * Provide options to the run context
  	 * @param  options - command line options (e.g. `--opt-one=foo`)
  	 */
  def withOptions(options: Dictionary[_]): this.type = js.native
  /**
  	 * Mock the prompt with dummy answers
  	 * @param  answers - Answers to the prompt questions
  	 */
  def withPrompts(answers: Answers): this.type = js.native
}

