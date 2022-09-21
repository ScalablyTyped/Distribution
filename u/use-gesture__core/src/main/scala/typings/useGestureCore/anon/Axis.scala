package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis extends StObject {
  
  var axis: Unit
  
  var filterTaps: js.UndefOr[Boolean] = js.undefined
  
  var tapsThreshold: js.UndefOr[Double] = js.undefined
}
object Axis {
  
  inline def apply(axis: Unit): Axis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  extension [Self <: Axis](x: Self) {
    
    inline def setAxis(value: Unit): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setFilterTaps(value: Boolean): Self = StObject.set(x, "filterTaps", value.asInstanceOf[js.Any])
    
    inline def setFilterTapsUndefined: Self = StObject.set(x, "filterTaps", js.undefined)
    
    inline def setTapsThreshold(value: Double): Self = StObject.set(x, "tapsThreshold", value.asInstanceOf[js.Any])
    
    inline def setTapsThresholdUndefined: Self = StObject.set(x, "tapsThreshold", js.undefined)
  }
}
