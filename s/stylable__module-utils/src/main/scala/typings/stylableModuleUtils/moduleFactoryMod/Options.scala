package typings.stylableModuleUtils.moduleFactoryMod

import typings.stylableModuleUtils.stylableModuleUtilsStrings.module
import typings.stylableModuleUtils.stylableModuleUtilsStrings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var injectCSS: Boolean = js.native
  
  var renderableOnly: Boolean = js.native
  
  var runtimePath: String = js.native
  
  var runtimeStylesheetId: module | namespace = js.native
  
  var staticImports: js.Array[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    injectCSS: Boolean,
    renderableOnly: Boolean,
    runtimePath: String,
    runtimeStylesheetId: module | namespace,
    staticImports: js.Array[String]
  ): Options = {
    val __obj = js.Dynamic.literal(injectCSS = injectCSS.asInstanceOf[js.Any], renderableOnly = renderableOnly.asInstanceOf[js.Any], runtimePath = runtimePath.asInstanceOf[js.Any], runtimeStylesheetId = runtimeStylesheetId.asInstanceOf[js.Any], staticImports = staticImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setRenderableOnly(value: Boolean): Self = this.set("renderableOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimePath(value: String): Self = this.set("runtimePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeStylesheetId(value: module | namespace): Self = this.set("runtimeStylesheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticImportsVarargs(value: String*): Self = this.set("staticImports", js.Array(value :_*))
    
    @scala.inline
    def setStaticImports(value: js.Array[String]): Self = this.set("staticImports", value.asInstanceOf[js.Any])
  }
}
