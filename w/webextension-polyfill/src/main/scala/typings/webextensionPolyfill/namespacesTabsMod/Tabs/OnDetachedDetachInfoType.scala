package typings.webextensionPolyfill.namespacesTabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDetachedDetachInfoType extends StObject {
  
  var oldPosition: Double
  
  var oldWindowId: Double
}
object OnDetachedDetachInfoType {
  
  inline def apply(oldPosition: Double, oldWindowId: Double): OnDetachedDetachInfoType = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition.asInstanceOf[js.Any], oldWindowId = oldWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDetachedDetachInfoType]
  }
  
  extension [Self <: OnDetachedDetachInfoType](x: Self) {
    
    inline def setOldPosition(value: Double): Self = StObject.set(x, "oldPosition", value.asInstanceOf[js.Any])
    
    inline def setOldWindowId(value: Double): Self = StObject.set(x, "oldWindowId", value.asInstanceOf[js.Any])
  }
}
