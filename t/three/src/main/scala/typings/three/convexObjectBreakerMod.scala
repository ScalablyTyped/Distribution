package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Object3D
import typings.three.threeMod.Plane
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convexObjectBreakerMod {
  
  @JSImport("three/examples/jsm/misc/ConvexObjectBreaker", "ConvexObjectBreaker")
  @js.native
  open class ConvexObjectBreaker () extends StObject {
    def this(minSizeForBreak: Double) = this()
    def this(minSizeForBreak: Double, smallDelta: Double) = this()
    def this(minSizeForBreak: Unit, smallDelta: Double) = this()
    
    def cutByPlane(`object`: Object3D[Event], plane: Plane, output: CutByPlaneOutput): Double = js.native
    
    def prepareBreakableObject(
      `object`: Object3D[Event],
      mass: Double,
      velocity: Vector3,
      angularVelocity: Vector3,
      breakable: Boolean
    ): Unit = js.native
    
    def subdivideByImpact(
      `object`: Object3D[Event],
      pointOfImpact: Vector3,
      normal: Vector3,
      maxRadialIterations: Double,
      maxRandomIterations: Double
    ): js.Array[Object3D[Event]] = js.native
  }
  
  trait CutByPlaneOutput extends StObject {
    
    var object1: Object3D[Event]
    
    var object2: Object3D[Event]
  }
  object CutByPlaneOutput {
    
    inline def apply(object1: Object3D[Event], object2: Object3D[Event]): CutByPlaneOutput = {
      val __obj = js.Dynamic.literal(object1 = object1.asInstanceOf[js.Any], object2 = object2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CutByPlaneOutput]
    }
    
    extension [Self <: CutByPlaneOutput](x: Self) {
      
      inline def setObject1(value: Object3D[Event]): Self = StObject.set(x, "object1", value.asInstanceOf[js.Any])
      
      inline def setObject2(value: Object3D[Event]): Self = StObject.set(x, "object2", value.asInstanceOf[js.Any])
    }
  }
}
