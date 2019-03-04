package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyConfig extends js.Object {
  var compilers: js.UndefOr[IWallabyCompilers] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[IWallabyEnvironment] = js.undefined
  var files: js.Array[java.lang.String] | js.Array[IWallabyFilePattern]
  var postprocessor: js.UndefOr[IWallabyProcessor] = js.undefined
  var preprocessors: js.UndefOr[IWallabyProcessor] = js.undefined
  var testFramework: js.UndefOr[java.lang.String] = js.undefined
  var tests: js.Array[java.lang.String] | js.Array[IWallabyFilePattern]
  var workers: js.UndefOr[IWallabyWorkers] = js.undefined
}

object IWallabyConfig {
  @scala.inline
  def apply(
    files: js.Array[java.lang.String] | js.Array[IWallabyFilePattern],
    tests: js.Array[java.lang.String] | js.Array[IWallabyFilePattern],
    compilers: IWallabyCompilers = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    env: IWallabyEnvironment = null,
    postprocessor: IWallabyProcessor = null,
    preprocessors: IWallabyProcessor = null,
    testFramework: java.lang.String = null,
    workers: IWallabyWorkers = null
  ): IWallabyConfig = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
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

