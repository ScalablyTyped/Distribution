package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFrom extends StObject {
  
  var configFrom: js.UndefOr[String] = js.undefined
  
  var configValue: js.UndefOr[js.Any] = js.undefined
}
object ConfigFrom {
  
  @scala.inline
  def apply(): ConfigFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFrom]
  }
  
  @scala.inline
  implicit class ConfigFromMutableBuilder[Self <: ConfigFrom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigFrom(value: String): Self = StObject.set(x, "configFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFromUndefined: Self = StObject.set(x, "configFrom", js.undefined)
    
    @scala.inline
    def setConfigValue(value: js.Any): Self = StObject.set(x, "configValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigValueUndefined: Self = StObject.set(x, "configValue", js.undefined)
  }
}
