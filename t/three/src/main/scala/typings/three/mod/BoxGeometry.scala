package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "BoxGeometry")
@js.native
class BoxGeometry protected ()
  extends typings.three.geometriesMod.BoxGeometry {
  /**
  	 * @param width — Width of the sides on the X axis.
  	 * @param height — Height of the sides on the Y axis.
  	 * @param depth — Depth of the sides on the Z axis.
  	 * @param widthSegments — Number of segmented faces along the width of the sides.
  	 * @param heightSegments — Number of segmented faces along the height of the sides.
  	 * @param depthSegments — Number of segmented faces along the depth of the sides.
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

