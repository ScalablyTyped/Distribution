package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiId extends StObject {
  
  var uiId: String
}
object UiId {
  
  @scala.inline
  def apply(uiId: String): UiId = {
    val __obj = js.Dynamic.literal(uiId = uiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiId]
  }
  
  @scala.inline
  implicit class UiIdMutableBuilder[Self <: UiId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUiId(value: String): Self = StObject.set(x, "uiId", value.asInstanceOf[js.Any])
  }
}
