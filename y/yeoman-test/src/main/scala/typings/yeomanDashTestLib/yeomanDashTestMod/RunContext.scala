package typings
package yeomanDashTestLib.yeomanDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunContext
  extends nodeLib.eventsMod.EventEmitter
     with RunContextConstructor {
  var answers: yeomanDashGeneratorLib.yeomanDashGeneratorMod.Answers = js.native
  var args: js.Array[java.lang.String] = js.native
  /**
  	 * Promise `.catch()` duck typing
  	 */
  @JSName("catch")
  var catch_Original: yeomanDashTestLib.Anon_Onrejected = js.native
  var dependencies: js.Array[Dependency] = js.native
  var inDirSet: scala.Boolean = js.native
  var ran: scala.Boolean = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  @JSName("then")
  var then_Original: yeomanDashTestLib.Anon_Onfulfilled = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
  	 * Hold the execution until the returned callback is triggered
  	 * @return Callback to notify the normal execution can resume
  	 */
  def async(): js.Function0[scala.Unit] = js.native
  /**
  	 * Promise `.catch()` duck typing
  	 */
  def `catch`[TResult](): js.Promise[java.lang.String | TResult] = js.native
  /**
  	 * Promise `.catch()` duck typing
  	 */
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[java.lang.String | TResult] = js.native
  /**
  	 * Change directory without deleting directory content.
  	 * @param  dirPath - Directory path (relative to CWD). Prefer passing an absolute
  	 *                            file path for predictable results
  	 * @return run context instance
  	 */
  def cd(dirPath: java.lang.String): this.type = js.native
  /**
  	 * Clean the directory used for tests inside inDir/inTmpDir
  	 */
  def cleanTestDirectory(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /**
  	 * Clean the provided directory, then change directory into it
  	 * @param  dirPath - Directory path (relative to CWD). Prefer passing an absolute
  	 *                            file path for predictable results
  	 * @param [cb] - callback who'll receive the folder path as argument
  	 * @return run context instance
  	 */
  def inDir(dirPath: java.lang.String): this.type = js.native
  def inDir(dirPath: java.lang.String, cb: js.Function1[/* folderPath */ java.lang.String, scala.Unit]): this.type = js.native
  /**
  	 * Cleanup a temporary directy and change the CWD into it
  	 *
  	 * This method is called automatically when creating a RunContext. Only use it if you need
  	 * to use the callback.
  	 *
  	 * @param [cb] - callback who'll receive the folder path as argument
  	 * @return run context instance
  	 */
  def inTmpDir(cb: js.Function1[/* folderPath */ java.lang.String, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ java.lang.String, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ java.lang.String, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
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
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  /**
  	 * Return a promise representing the generator run process
  	 * @return Promise resolved on end or rejected on error
  	 */
  def toPromise(): js.Promise[java.lang.String] = js.native
  /**
  	 * Provide arguments to the run context
  	 * @param  args - command line arguments as Array or space separated string
  	 */
  def withArguments(args: java.lang.String): this.type = js.native
  def withArguments(args: js.Array[java.lang.String]): this.type = js.native
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
  def withPrompts(answers: yeomanDashGeneratorLib.yeomanDashGeneratorMod.Answers): this.type = js.native
}

