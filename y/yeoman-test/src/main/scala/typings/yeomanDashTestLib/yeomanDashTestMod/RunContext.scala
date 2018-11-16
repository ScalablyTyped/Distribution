package typings
package yeomanDashTestLib.yeomanDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunContext
  extends nodeLib.eventsMod.EventEmitter {
  /**
  	 * Promise `.catch()` duck typing
  	 */
  var `catch`: (js.Function0[stdLib.Promise[java.lang.String | _]]) | (js.Function1[
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[java.lang.String | _]
  ]) = js.native
  /**
  	 * Promise `.then()` duck typing
  	 */
  var `then`: js.Function0[stdLib.Promise[_]] | (js.Function1[
    /* onfulfilled */ js.Function1[/* value */ java.lang.String, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.Function1[/* value */ java.lang.String, _ | stdLib.PromiseLike[_]], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.UndefOr[scala.Nothing], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ scala.Null, 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) = js.native
  /**
  	 * Hold the execution until the returned callback is triggered
  	 * @return Callback to notify the normal execution can resume
  	 */
  def async(): js.Function0[scala.Unit] = js.native
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
  /**
  	 * Clean the provided directory, then change directory into it
  	 * @param  dirPath - Directory path (relative to CWD). Prefer passing an absolute
  	 *                            file path for predictable results
  	 * @param [cb] - callback who'll receive the folder path as argument
  	 * @return run context instance
  	 */
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
  /**
  	 * Return a promise representing the generator run process
  	 * @return Promise resolved on end or rejected on error
  	 */
  def toPromise(): stdLib.Promise[java.lang.String] = js.native
  /**
  	 * Provide arguments to the run context
  	 * @param  args - command line arguments as Array or space separated string
  	 */
  def withArguments(args: java.lang.String): this.type = js.native
  /**
  	 * Provide arguments to the run context
  	 * @param  args - command line arguments as Array or space separated string
  	 */
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
  def withPrompts(answers: Dictionary[_]): this.type = js.native
}

