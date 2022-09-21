package typings.three.anon

import typings.three.eventDispatcherMod.Event
import typings.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  var distance: Double
  
  var `object`: Object3D[Event]
}
object Distance {
  
  inline def apply(distance: Double, `object`: Object3D[Event]): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  extension [Self <: Distance](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Object3D[Event]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
