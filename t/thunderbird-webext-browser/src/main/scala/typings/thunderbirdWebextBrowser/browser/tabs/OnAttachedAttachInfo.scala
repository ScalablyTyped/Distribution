package typings.thunderbirdWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAttachedAttachInfo extends StObject {
  
  var newPosition: Double
  
  var newWindowId: Double
}
object OnAttachedAttachInfo {
  
  inline def apply(newPosition: Double, newWindowId: Double): OnAttachedAttachInfo = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAttachedAttachInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAttachedAttachInfo] (val x: Self) extends AnyVal {
    
    inline def setNewPosition(value: Double): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    inline def setNewWindowId(value: Double): Self = StObject.set(x, "newWindowId", value.asInstanceOf[js.Any])
  }
}
