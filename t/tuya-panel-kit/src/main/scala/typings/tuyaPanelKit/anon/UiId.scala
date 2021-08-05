package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiId extends StObject {
  
  var uiId: String
}
object UiId {
  
  inline def apply(uiId: String): UiId = {
    val __obj = js.Dynamic.literal(uiId = uiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiId]
  }
  
  extension [Self <: UiId](x: Self) {
    
    inline def setUiId(value: String): Self = StObject.set(x, "uiId", value.asInstanceOf[js.Any])
  }
}
