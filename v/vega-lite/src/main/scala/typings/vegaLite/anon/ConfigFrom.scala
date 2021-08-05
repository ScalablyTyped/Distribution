package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFrom extends StObject {
  
  var configFrom: js.UndefOr[String] = js.undefined
  
  var configValue: js.UndefOr[js.Any] = js.undefined
}
object ConfigFrom {
  
  inline def apply(): ConfigFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFrom]
  }
  
  extension [Self <: ConfigFrom](x: Self) {
    
    inline def setConfigFrom(value: String): Self = StObject.set(x, "configFrom", value.asInstanceOf[js.Any])
    
    inline def setConfigFromUndefined: Self = StObject.set(x, "configFrom", js.undefined)
    
    inline def setConfigValue(value: js.Any): Self = StObject.set(x, "configValue", value.asInstanceOf[js.Any])
    
    inline def setConfigValueUndefined: Self = StObject.set(x, "configValue", js.undefined)
  }
}
