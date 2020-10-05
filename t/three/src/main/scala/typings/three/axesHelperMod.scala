package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/helpers/AxesHelper", JSImport.Namespace)
@js.native
object axesHelperMod extends js.Object {
  @js.native
  class AxesHelper ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(size: Double) = this()
  }
  
}

