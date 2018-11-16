package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "BoxGeometry")
@js.native
class BoxGeometry protected () extends Geometry {
  /**
       * @param width — Width of the sides on the X axis.
       * @param height — Height of the sides on the Y axis.
       * @param depth — Depth of the sides on the Z axis.
       * @param widthSegments — Number of segmented faces along the width of the sides.
       * @param heightSegments — Number of segmented faces along the height of the sides.
       * @param depthSegments — Number of segmented faces along the depth of the sides.
       */
  def this(width: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], depth: js.UndefOr[scala.Double], widthSegments: js.UndefOr[scala.Double], heightSegments: js.UndefOr[scala.Double], depthSegments: js.UndefOr[scala.Double]) = this()
  var parameters: threeLib.Anon_HeightSegments = js.native
}

