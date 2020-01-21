package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/EdgesGeometry", JSImport.Namespace)
@js.native
object edgesGeometryMod extends js.Object {
  @js.native
  class EdgesGeometry protected () extends BufferGeometry {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, thresholdAngle: Double) = this()
    def this(geometry: Geometry, thresholdAngle: Double) = this()
  }
  
}

