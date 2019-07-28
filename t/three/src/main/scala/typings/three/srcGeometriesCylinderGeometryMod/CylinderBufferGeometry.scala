package typings.three.srcGeometriesCylinderGeometryMod

import typings.three.Anon_Height
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/CylinderGeometry", "CylinderBufferGeometry")
@js.native
class CylinderBufferGeometry protected () extends BufferGeometry {
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
  var parameters: Anon_Height = js.native
}

