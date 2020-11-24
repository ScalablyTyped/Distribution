package typings.three.geometriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/Geometries", "BoxGeometry")
@js.native
class BoxGeometry protected ()
  extends typings.three.boxGeometryMod.BoxGeometry {
  /**
  	 * @param [width=1] — Width of the sides on the X axis.
  	 * @param [height=1] — Height of the sides on the Y axis.
  	 * @param [depth=1] — Depth of the sides on the Z axis.
  	 * @param [widthSegments=1] — Number of segmented faces along the width of the sides.
  	 * @param [heightSegments=1] — Number of segmented faces along the height of the sides.
  	 * @param [depthSegments=1] — Number of segmented faces along the depth of the sides.
  	 */
  def this(
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    depth: js.UndefOr[Double],
    widthSegments: js.UndefOr[Double],
    heightSegments: js.UndefOr[Double],
    depthSegments: js.UndefOr[Double]
  ) = this()
}
