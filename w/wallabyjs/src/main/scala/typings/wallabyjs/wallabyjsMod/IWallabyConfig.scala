package typings.wallabyjs.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyConfig extends js.Object {
  var compilers: js.UndefOr[IWallabyCompilers] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[IWallabyEnvironment] = js.undefined
  var files: js.Array[IWallabyFilePattern | String]
  var postprocessor: js.UndefOr[IWallabyProcessor] = js.undefined
  var preprocessors: js.UndefOr[IWallabyProcessor] = js.undefined
  var testFramework: js.UndefOr[String] = js.undefined
  var tests: js.Array[IWallabyFilePattern | String]
  var workers: js.UndefOr[IWallabyWorkers] = js.undefined
}

object IWallabyConfig {
  @scala.inline
  def apply(
    files: js.Array[IWallabyFilePattern | String],
    tests: js.Array[IWallabyFilePattern | String],
    compilers: IWallabyCompilers = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    env: IWallabyEnvironment = null,
    postprocessor: IWallabyProcessor = null,
    preprocessors: IWallabyProcessor = null,
    testFramework: String = null,
    workers: IWallabyWorkers = null
  ): IWallabyConfig = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    if (compilers != null) __obj.updateDynamic("compilers")(compilers.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (postprocessor != null) __obj.updateDynamic("postprocessor")(postprocessor.asInstanceOf[js.Any])
    if (preprocessors != null) __obj.updateDynamic("preprocessors")(preprocessors.asInstanceOf[js.Any])
    if (testFramework != null) __obj.updateDynamic("testFramework")(testFramework.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyConfig]
  }
}

