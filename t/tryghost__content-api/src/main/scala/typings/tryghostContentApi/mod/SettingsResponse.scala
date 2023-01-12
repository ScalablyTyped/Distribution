package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsResponse
  extends StObject
     with Settings {
  
  var meta: Any
}
object SettingsResponse {
  
  inline def apply(meta: Any): SettingsResponse = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
