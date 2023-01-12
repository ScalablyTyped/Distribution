package typings.vueRouter.mod

import typings.std.ScrollBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal normalized version of {@link ScrollPositionCoordinates} that always
  * has `left` and `top` coordinates.
  *
  * @internal
  */
trait ScrollPositionNormalized extends StObject {
  
  var behavior: js.UndefOr[ScrollBehavior] = js.undefined
  
  var left: Double
  
  var top: Double
}
object ScrollPositionNormalized {
  
  inline def apply(left: Double, top: Double): ScrollPositionNormalized = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollPositionNormalized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollPositionNormalized] (val x: Self) extends AnyVal {
    
    inline def setBehavior(value: ScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
