package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var app: typings.vueDevtoolsApi.appMod.App
  
  var key: String
  
  var newValue: Any
  
  var oldValue: Any
  
  var pluginId: String
  
  var settings: Any
}
object Key {
  
  inline def apply(
    app: typings.vueDevtoolsApi.appMod.App,
    key: String,
    newValue: Any,
    oldValue: Any,
    pluginId: String,
    settings: Any
  ): Key = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], pluginId = pluginId.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setApp(value: typings.vueDevtoolsApi.appMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setPluginId(value: String): Self = StObject.set(x, "pluginId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Any): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
