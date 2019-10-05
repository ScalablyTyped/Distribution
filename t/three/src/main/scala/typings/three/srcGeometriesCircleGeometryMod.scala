package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreGeometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/CircleGeometry", JSImport.Namespace)
@js.native
object srcGeometriesCircleGeometryMod extends js.Object {
  @js.native
  class CircleBufferGeometry () extends BufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, segments: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    var parameters: Anon_Radius = js.native
  }
  
  @js.native
  class CircleGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: Double, segments: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    var parameters: Anon_Radius = js.native
  }
  
}

