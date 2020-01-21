package typings.three.geometriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "RingGeometry")
@js.native
class RingGeometry protected ()
  extends typings.three.ringGeometryMod.RingGeometry {
  def this(
    innerRadius: js.UndefOr[Double],
    outerRadius: js.UndefOr[Double],
    thetaSegments: js.UndefOr[Double],
    phiSegments: js.UndefOr[Double],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
}

