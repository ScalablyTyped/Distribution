package typings.three

import typings.three.box3Mod.Box3
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/Box3Helper", JSImport.Namespace)
@js.native
object box3HelperMod extends js.Object {
  @js.native
  class Box3Helper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(box: Box3) = this()
    def this(box: Box3, color: Color) = this()
    var box: Box3 = js.native
  }
  
}

