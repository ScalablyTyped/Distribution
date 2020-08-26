package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWallabyConfig extends js.Object {
  var compilers: js.UndefOr[IWallabyCompilers] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[IWallabyEnvironment] = js.native
  var files: js.Array[IWallabyFilePattern | String] = js.native
  var postprocessor: js.UndefOr[IWallabyProcessor] = js.native
  var preprocessors: js.UndefOr[IWallabyProcessor] = js.native
  var testFramework: js.UndefOr[String] = js.native
  var tests: js.Array[IWallabyFilePattern | String] = js.native
  var workers: js.UndefOr[IWallabyWorkers] = js.native
}

object IWallabyConfig {
  @scala.inline
  def apply(files: js.Array[IWallabyFilePattern | String], tests: js.Array[IWallabyFilePattern | String]): IWallabyConfig = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyConfig]
  }
  @scala.inline
  implicit class IWallabyConfigOps[Self <: IWallabyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilesVarargs(value: (IWallabyFilePattern | String)*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[IWallabyFilePattern | String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestsVarargs(value: (IWallabyFilePattern | String)*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: js.Array[IWallabyFilePattern | String]): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompilers(value: IWallabyCompilers): Self = this.set("compilers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilers: Self = this.set("compilers", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEnv(value: IWallabyEnvironment): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setPostprocessor(value: IWallabyProcessor): Self = this.set("postprocessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostprocessor: Self = this.set("postprocessor", js.undefined)
    @scala.inline
    def setPreprocessors(value: IWallabyProcessor): Self = this.set("preprocessors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreprocessors: Self = this.set("preprocessors", js.undefined)
    @scala.inline
    def setTestFramework(value: String): Self = this.set("testFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestFramework: Self = this.set("testFramework", js.undefined)
    @scala.inline
    def setWorkers(value: IWallabyWorkers): Self = this.set("workers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
  }
  
}

