package typings.three.geometriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "CylinderBufferGeometry")
@js.native
class CylinderBufferGeometry protected ()
  extends typings.three.cylinderGeometryMod.CylinderBufferGeometry {
  def this(
    radiusTop: js.UndefOr[Double],
    radiusBottom: js.UndefOr[Double],
    height: js.UndefOr[Double],
    radialSegments: js.UndefOr[Double],
    heightSegments: js.UndefOr[Double],
    openEnded: js.UndefOr[Boolean],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
}

