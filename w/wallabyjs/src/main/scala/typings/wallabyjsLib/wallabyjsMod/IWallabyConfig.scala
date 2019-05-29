package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyConfig extends js.Object {
  var compilers: js.UndefOr[IWallabyCompilers] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[IWallabyEnvironment] = js.undefined
  var files: js.Array[IWallabyFilePattern | java.lang.String]
  var postprocessor: js.UndefOr[IWallabyProcessor] = js.undefined
  var preprocessors: js.UndefOr[IWallabyProcessor] = js.undefined
  var testFramework: js.UndefOr[java.lang.String] = js.undefined
  var tests: js.Array[IWallabyFilePattern | java.lang.String]
  var workers: js.UndefOr[IWallabyWorkers] = js.undefined
}

object IWallabyConfig {
  @scala.inline
  def apply(
    files: js.Array[IWallabyFilePattern | java.lang.String],
    tests: js.Array[IWallabyFilePattern | java.lang.String],
    compilers: IWallabyCompilers = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    env: IWallabyEnvironment = null,
    postprocessor: IWallabyProcessor = null,
    preprocessors: IWallabyProcessor = null,
    testFramework: java.lang.String = null,
    workers: IWallabyWorkers = null
  ): IWallabyConfig = {
    val __obj = js.Dynamic.literal(files = files, tests = tests)
    if (compilers != null) __obj.updateDynamic("compilers")(compilers)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (env != null) __obj.updateDynamic("env")(env)
    if (postprocessor != null) __obj.updateDynamic("postprocessor")(postprocessor)
    if (preprocessors != null) __obj.updateDynamic("preprocessors")(preprocessors)
    if (testFramework != null) __obj.updateDynamic("testFramework")(testFramework)
    if (workers != null) __obj.updateDynamic("workers")(workers)
    __obj.asInstanceOf[IWallabyConfig]
  }
}

