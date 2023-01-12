package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmPluginMod.PluginSettingsItem
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'text',   defaultValue :string} & {  label :string,   description :string | undefined} */
trait typetextdefaultValuestrin
  extends StObject
     with PluginSettingsItem {
  
  var defaultValue: String
  
  var description: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var `type`: text
}
object typetextdefaultValuestrin {
  
  inline def apply(defaultValue: String, label: String): typetextdefaultValuestrin = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typetextdefaultValuestrin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typetextdefaultValuestrin] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
