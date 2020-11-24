package typings.stylableModuleUtils.anon

import typings.stylableModuleUtils.stylableModuleUtilsStrings.module
import typings.stylableModuleUtils.stylableModuleUtilsStrings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/module-utils.@stylable/module-utils/cjs/module-factory.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var injectCSS: js.UndefOr[Boolean] = js.native
  
  var renderableOnly: js.UndefOr[Boolean] = js.native
  
  var runtimePath: js.UndefOr[String] = js.native
  
  var runtimeStylesheetId: js.UndefOr[module | namespace] = js.native
  
  var staticImports: js.UndefOr[js.Array[String]] = js.native
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
    def setInjectCSS(value: Boolean): Self = this.set("injectCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectCSS: Self = this.set("injectCSS", js.undefined)
    
    @scala.inline
    def setRenderableOnly(value: Boolean): Self = this.set("renderableOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderableOnly: Self = this.set("renderableOnly", js.undefined)
    
    @scala.inline
    def setRuntimePath(value: String): Self = this.set("runtimePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimePath: Self = this.set("runtimePath", js.undefined)
    
    @scala.inline
    def setRuntimeStylesheetId(value: module | namespace): Self = this.set("runtimeStylesheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeStylesheetId: Self = this.set("runtimeStylesheetId", js.undefined)
    
    @scala.inline
    def setStaticImportsVarargs(value: String*): Self = this.set("staticImports", js.Array(value :_*))
    
    @scala.inline
    def setStaticImports(value: js.Array[String]): Self = this.set("staticImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticImports: Self = this.set("staticImports", js.undefined)
  }
}
