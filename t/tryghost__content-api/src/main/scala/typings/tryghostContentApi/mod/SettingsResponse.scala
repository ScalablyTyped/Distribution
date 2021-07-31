package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsResponse
  extends StObject
     with Settings {
  
  var meta: js.Any
}
object SettingsResponse {
  
  @scala.inline
  def apply(meta: js.Any): SettingsResponse = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsResponse]
  }
  
  @scala.inline
  implicit class SettingsResponseMutableBuilder[Self <: SettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
