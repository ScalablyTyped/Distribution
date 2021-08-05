package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandSize extends StObject {
  
  var expandSize: String
  
  var hideDelay: Double
  
  var isForceOpened: Boolean
  
  var showDelay: Double
}
object ExpandSize {
  
  inline def apply(expandSize: String, hideDelay: Double, isForceOpened: Boolean, showDelay: Double): ExpandSize = {
    val __obj = js.Dynamic.literal(expandSize = expandSize.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], isForceOpened = isForceOpened.asInstanceOf[js.Any], showDelay = showDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandSize]
  }
  
  extension [Self <: ExpandSize](x: Self) {
    
    inline def setExpandSize(value: String): Self = StObject.set(x, "expandSize", value.asInstanceOf[js.Any])
    
    inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setIsForceOpened(value: Boolean): Self = StObject.set(x, "isForceOpened", value.asInstanceOf[js.Any])
    
    inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
  }
}
