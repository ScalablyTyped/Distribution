package typings.vscodeLanguageserverProtocol.protocolConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationParams extends js.Object {
  
  var items: js.Array[ConfigurationItem] = js.native
}
object ConfigurationParams {
  
  @scala.inline
  def apply(items: js.Array[ConfigurationItem]): ConfigurationParams = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationParams]
  }
  
  @scala.inline
  implicit class ConfigurationParamsOps[Self <: ConfigurationParams] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ConfigurationItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ConfigurationItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
