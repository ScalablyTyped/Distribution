package typings.three.geometriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/Geometries", "ConeBufferGeometry")
@js.native
class ConeBufferGeometry protected ()
  extends typings.three.coneBufferGeometryMod.ConeBufferGeometry {
  /**
  	 * @param [radius=1] — Radius of the cone base.
  	 * @param [height=1] — Height of the cone.
  	 * @param [radialSegments=8] — Number of segmented faces around the circumference of the cone.
  	 * @param [heightSegments=1] — Number of rows of faces along the height of the cone.
  	 * @param [openEnded=false] — A Boolean indicating whether the base of the cone is open or capped.
  	 * @param [thetaStart=0]
  	 * @param [thetaLength=Math.PI * 2]
  	 */
  def this(
    radius: js.UndefOr[Double],
    height: js.UndefOr[Double],
    radialSegments: js.UndefOr[Double],
    heightSegments: js.UndefOr[Double],
    openEnded: js.UndefOr[Boolean],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
}
