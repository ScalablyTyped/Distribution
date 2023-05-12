package typings.three.anon

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  /** The distance at which to display this level of detail. Expects a `Float`. */
  var distance: Double
  
  /** Threshold used to avoid flickering at LOD boundaries, as a fraction of distance. Expects a `Float`. */
  var hysteresis: Double
  
  /** The Object3D to display at this level. */
  var `object`: Object3D[Event]
}
object Distance {
  
  inline def apply(distance: Double, hysteresis: Double, `object`: Object3D[Event]): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hysteresis = hysteresis.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setHysteresis(value: Double): Self = StObject.set(x, "hysteresis", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Object3D[Event]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
