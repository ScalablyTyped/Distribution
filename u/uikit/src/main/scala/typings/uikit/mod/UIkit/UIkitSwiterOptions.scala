package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitSwiterOptions extends StObject {
  
  var active: js.UndefOr[Double] = js.undefined
  
  var animation: js.UndefOr[String] = js.undefined
  
  var connect: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var swiping: js.UndefOr[Boolean] = js.undefined
  
  var toggle: js.UndefOr[String] = js.undefined
}
object UIkitSwiterOptions {
  
  inline def apply(): UIkitSwiterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSwiterOptions]
  }
  
  extension [Self <: UIkitSwiterOptions](x: Self) {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
    
    inline def setSwipingUndefined: Self = StObject.set(x, "swiping", js.undefined)
    
    inline def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
