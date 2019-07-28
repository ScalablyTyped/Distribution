package typings.three.srcGeometriesSphereGeometryMod

import typings.three.Anon_HeightSegments
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/SphereGeometry", "SphereBufferGeometry")
@js.native
class SphereBufferGeometry protected () extends BufferGeometry {
  def this(
    radius: js.UndefOr[Double],
    widthSegments: js.UndefOr[Double],
    heightSegments: js.UndefOr[Double],
    phiStart: js.UndefOr[Double],
    phiLength: js.UndefOr[Double],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
  var parameters: Anon_HeightSegments = js.native
}

