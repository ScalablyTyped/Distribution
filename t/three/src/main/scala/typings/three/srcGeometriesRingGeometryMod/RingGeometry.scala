package typings.three.srcGeometriesRingGeometryMod

import typings.three.Anon_InnerRadius
import typings.three.srcCoreGeometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/RingGeometry", "RingGeometry")
@js.native
class RingGeometry protected () extends Geometry {
  def this(
    innerRadius: js.UndefOr[Double],
    outerRadius: js.UndefOr[Double],
    thetaSegments: js.UndefOr[Double],
    phiSegments: js.UndefOr[Double],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
  var parameters: Anon_InnerRadius = js.native
}

