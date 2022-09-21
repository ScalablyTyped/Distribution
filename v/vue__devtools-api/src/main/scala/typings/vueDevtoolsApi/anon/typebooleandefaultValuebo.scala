package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.pluginMod.PluginSettingsItem
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'boolean',   defaultValue :boolean} & {  label :string,   description :string | undefined} */
trait typebooleandefaultValuebo
  extends StObject
     with PluginSettingsItem {
  
  var defaultValue: Boolean
  
  var description: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var `type`: boolean
}
object typebooleandefaultValuebo {
  
  inline def apply(defaultValue: Boolean, label: String): typebooleandefaultValuebo = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typebooleandefaultValuebo]
  }
  
  extension [Self <: typebooleandefaultValuebo](x: Self) {
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
