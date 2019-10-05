package typings.three

import typings.three.srcGeometriesCylinderGeometryMod.CylinderBufferGeometry
import typings.three.srcGeometriesCylinderGeometryMod.CylinderGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ConeGeometry", JSImport.Namespace)
@js.native
object srcGeometriesConeGeometryMod extends js.Object {
  @js.native
  class ConeBufferGeometry protected () extends CylinderBufferGeometry {
    def this(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegment: js.UndefOr[Double],
      heightSegment: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class ConeGeometry protected () extends CylinderGeometry {
    def this(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegment: js.UndefOr[Double],
      heightSegment: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
}

