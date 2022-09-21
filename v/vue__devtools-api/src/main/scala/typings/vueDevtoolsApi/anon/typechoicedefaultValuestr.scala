package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.pluginMod.PluginSettingsItem
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.`button-group`
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.choice
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'choice',   defaultValue :string | number,   options :std.Array<{  value :string | number,   label :string}>,   component :'select' | 'button-group' | undefined} & {  label :string,   description :string | undefined} */
trait typechoicedefaultValuestr
  extends StObject
     with PluginSettingsItem {
  
  var component: js.UndefOr[select | `button-group`] = js.undefined
  
  var defaultValue: String | Double
  
  var description: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var options: js.Array[Label]
  
  var `type`: choice
}
object typechoicedefaultValuestr {
  
  inline def apply(defaultValue: String | Double, label: String, options: js.Array[Label]): typechoicedefaultValuestr = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("choice")
    __obj.asInstanceOf[typechoicedefaultValuestr]
  }
  
  extension [Self <: typechoicedefaultValuestr](x: Self) {
    
    inline def setComponent(value: select | `button-group`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDefaultValue(value: String | Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[Label]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Label*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setType(value: choice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
