package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideByCloseClick extends StObject {
  
  var height: Double
  
  var hideByCloseClick: Boolean
  
  var hideByTimer: Boolean
  
  var showChildren: Boolean
}
object HideByCloseClick {
  
  inline def apply(height: Double, hideByCloseClick: Boolean, hideByTimer: Boolean, showChildren: Boolean): HideByCloseClick = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], hideByCloseClick = hideByCloseClick.asInstanceOf[js.Any], hideByTimer = hideByTimer.asInstanceOf[js.Any], showChildren = showChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideByCloseClick]
  }
  
  extension [Self <: HideByCloseClick](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHideByCloseClick(value: Boolean): Self = StObject.set(x, "hideByCloseClick", value.asInstanceOf[js.Any])
    
    inline def setHideByTimer(value: Boolean): Self = StObject.set(x, "hideByTimer", value.asInstanceOf[js.Any])
    
    inline def setShowChildren(value: Boolean): Self = StObject.set(x, "showChildren", value.asInstanceOf[js.Any])
  }
}
