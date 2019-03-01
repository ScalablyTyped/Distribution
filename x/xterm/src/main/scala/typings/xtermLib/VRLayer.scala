package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRLayer extends js.Object {
  var leftBounds: js.UndefOr[js.Array[scala.Double] | stdLib.Float32Array | scala.Null] = js.undefined
  var rightBounds: js.UndefOr[js.Array[scala.Double] | stdLib.Float32Array | scala.Null] = js.undefined
  var source: js.UndefOr[HTMLCanvasElement | scala.Null] = js.undefined
}

object VRLayer {
  @scala.inline
  def apply(
    leftBounds: js.Array[scala.Double] | stdLib.Float32Array = null,
    rightBounds: js.Array[scala.Double] | stdLib.Float32Array = null,
    source: HTMLCanvasElement = null
  ): VRLayer = {
    val __obj = js.Dynamic.literal()
    if (leftBounds != null) __obj.updateDynamic("leftBounds")(leftBounds.asInstanceOf[js.Any])
    if (rightBounds != null) __obj.updateDynamic("rightBounds")(rightBounds.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[VRLayer]
  }
}

