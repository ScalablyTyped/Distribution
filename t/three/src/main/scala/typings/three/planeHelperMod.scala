package typings.three

import typings.three.lineSegmentsMod.LineSegments
import typings.three.planeMod.Plane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/PlaneHelper", JSImport.Namespace)
@js.native
object planeHelperMod extends js.Object {
  @js.native
  class PlaneHelper protected () extends LineSegments {
    def this(plane: Plane) = this()
    def this(plane: Plane, size: Double) = this()
    def this(plane: Plane, size: Double, hex: Double) = this()
    var plane: Plane = js.native
    var size: Double = js.native
  }
  
}

