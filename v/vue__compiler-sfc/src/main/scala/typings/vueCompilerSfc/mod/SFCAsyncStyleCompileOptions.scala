package typings.vueCompilerSfc.mod

import typings.vueCompilerSfc.anon.GenerateScopedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCAsyncStyleCompileOptions extends SFCStyleCompileOptions {
  
  var isAsync: js.UndefOr[Boolean] = js.native
  
  var modules: js.UndefOr[Boolean] = js.native
  
  var modulesOptions: js.UndefOr[GenerateScopedName] = js.native
}
object SFCAsyncStyleCompileOptions {
  
  @scala.inline
  def apply(filename: String, id: String, source: String): SFCAsyncStyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCAsyncStyleCompileOptions]
  }
  
  @scala.inline
  implicit class SFCAsyncStyleCompileOptionsOps[Self <: SFCAsyncStyleCompileOptions] (val x: Self) extends AnyVal {
    
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
    def setIsAsync(value: Boolean): Self = this.set("isAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAsync: Self = this.set("isAsync", js.undefined)
    
    @scala.inline
    def setModules(value: Boolean): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setModulesOptions(value: GenerateScopedName): Self = this.set("modulesOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulesOptions: Self = this.set("modulesOptions", js.undefined)
  }
}
