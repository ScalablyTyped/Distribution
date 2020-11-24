package typings.typeFest.packageJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeScriptConfiguration extends js.Object {
  
  /**
  		Location of the bundled TypeScript declaration file.
  		*/
  var types: js.UndefOr[String] = js.native
  
  /**
  		Location of the bundled TypeScript declaration file. Alias of `types`.
  		*/
  @JSName("typings")
  var typings_ : js.UndefOr[String] = js.native
}
object TypeScriptConfiguration {
  
  @scala.inline
  def apply(): TypeScriptConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeScriptConfiguration]
  }
  
  @scala.inline
  implicit class TypeScriptConfigurationOps[Self <: TypeScriptConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setTypings_(value: String): Self = this.set("typings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypings_ : Self = this.set("typings", js.undefined)
  }
}
