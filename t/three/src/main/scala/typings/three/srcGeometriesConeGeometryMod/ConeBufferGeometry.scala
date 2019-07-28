package typings.three.srcGeometriesConeGeometryMod

import typings.three.srcGeometriesCylinderGeometryMod.CylinderBufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ConeGeometry", "ConeBufferGeometry")
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

