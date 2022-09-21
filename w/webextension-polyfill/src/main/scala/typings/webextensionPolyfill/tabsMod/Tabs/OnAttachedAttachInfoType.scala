package typings.webextensionPolyfill.tabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAttachedAttachInfoType extends StObject {
  
  var newPosition: Double
  
  var newWindowId: Double
}
object OnAttachedAttachInfoType {
  
  inline def apply(newPosition: Double, newWindowId: Double): OnAttachedAttachInfoType = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAttachedAttachInfoType]
  }
  
  extension [Self <: OnAttachedAttachInfoType](x: Self) {
    
    inline def setNewPosition(value: Double): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    inline def setNewWindowId(value: Double): Self = StObject.set(x, "newWindowId", value.asInstanceOf[js.Any])
  }
}
