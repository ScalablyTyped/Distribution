package typings
package svgDashSpriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Box extends js.Object {
  /**
    * Padding strategy (similar to CSS `box-sizing`)
    */
  var box: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Padding around all shapes
    */
  var padding: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object Anon_Box {
  @scala.inline
  def apply(box: java.lang.String = null, padding: scala.Double | js.Array[scala.Double] = null): Anon_Box = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Box]
  }
}

