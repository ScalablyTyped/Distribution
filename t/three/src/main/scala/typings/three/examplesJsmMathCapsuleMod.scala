package typings.three

import typings.three.srcThreeMod.Box3
import typings.three.srcThreeMod.Line3
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMathCapsuleMod {
  
  @JSImport("three/examples/jsm/math/Capsule", "Capsule")
  @js.native
  open class Capsule () extends StObject {
    def this(start: Vector3) = this()
    def this(start: Unit, end: Vector3) = this()
    def this(start: Vector3, end: Vector3) = this()
    def this(start: Unit, end: Unit, radius: Double) = this()
    def this(start: Unit, end: Vector3, radius: Double) = this()
    def this(start: Vector3, end: Unit, radius: Double) = this()
    def this(start: Vector3, end: Vector3, radius: Double) = this()
    
    def checkAABBAxis(
      p1x: Double,
      p1y: Double,
      p2x: Double,
      p2y: Double,
      minx: Double,
      maxx: Double,
      miny: Double,
      maxy: Double,
      radius: Double
    ): Boolean = js.native
    
    def copy(capsule: Capsule): this.type = js.native
    
    var end: Vector3 = js.native
    
    def getCenter(target: Double): Vector3 = js.native
    
    def intersectsBox(box: Box3): Boolean = js.native
    
    def lineLineMinimumPoints(line1: Line3, line2: Line3): js.Array[Vector3] = js.native
    
    var radius: Double = js.native
    
    def set(start: Vector3, end: Vector3, radius: Double): this.type = js.native
    
    var start: Vector3 = js.native
    
    def translate(v: Vector3): this.type = js.native
  }
}
