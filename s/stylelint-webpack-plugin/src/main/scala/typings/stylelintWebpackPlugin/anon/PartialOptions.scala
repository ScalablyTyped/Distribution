package typings.stylelintWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<stylelint-webpack-plugin.stylelint-webpack-plugin/declarations/getOptions.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var context: js.UndefOr[String] = js.native
  
  var emitError: js.UndefOr[Boolean] = js.native
  
  var emitWarning: js.UndefOr[Boolean] = js.native
  
  var failOnError: js.UndefOr[Boolean] = js.native
  
  var failOnWarning: js.UndefOr[Boolean] = js.native
  
  var files: js.UndefOr[js.Array[String] | String] = js.native
  
  var formatter: js.UndefOr[js.Function | String] = js.native
  
  var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.native
  
  var quiet: js.UndefOr[Boolean] = js.native
  
  var stylelintPath: js.UndefOr[String] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEmitError(value: Boolean): Self = this.set("emitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitError: Self = this.set("emitError", js.undefined)
    
    @scala.inline
    def setEmitWarning(value: Boolean): Self = this.set("emitWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitWarning: Self = this.set("emitWarning", js.undefined)
    
    @scala.inline
    def setFailOnError(value: Boolean): Self = this.set("failOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnError: Self = this.set("failOnError", js.undefined)
    
    @scala.inline
    def setFailOnWarning(value: Boolean): Self = this.set("failOnWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnWarning: Self = this.set("failOnWarning", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String] | String): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setFormatter(value: js.Function | String): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setLintDirtyModulesOnly(value: Boolean): Self = this.set("lintDirtyModulesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLintDirtyModulesOnly: Self = this.set("lintDirtyModulesOnly", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setStylelintPath(value: String): Self = this.set("stylelintPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylelintPath: Self = this.set("stylelintPath", js.undefined)
  }
}
