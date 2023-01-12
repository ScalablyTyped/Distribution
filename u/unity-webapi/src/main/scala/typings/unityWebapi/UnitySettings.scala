package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitySettings extends StObject {
  
  var iconUrl: String
  
  var name: String
  
  var onInit: js.Function
}
object UnitySettings {
  
  inline def apply(iconUrl: String, name: String, onInit: js.Function): UnitySettings = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onInit = onInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitySettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnitySettings] (val x: Self) extends AnyVal {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnInit(value: js.Function): Self = StObject.set(x, "onInit", value.asInstanceOf[js.Any])
  }
}
