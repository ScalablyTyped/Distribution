package typings.vueRouter.mod

import typings.std.ScrollBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Scroll position similar to
  * {@link https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions | `ScrollToOptions`}.
  * Note that not all browsers support `behavior`.
  */
trait ScrollPositionCoordinates
  extends StObject
     with ScrollPosition {
  
  var behavior: js.UndefOr[ScrollBehavior] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object ScrollPositionCoordinates {
  
  inline def apply(): ScrollPositionCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollPositionCoordinates]
  }
  
  extension [Self <: ScrollPositionCoordinates](x: Self) {
    
    inline def setBehavior(value: ScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
