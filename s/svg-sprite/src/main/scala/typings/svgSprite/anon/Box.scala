package typings.svgSprite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  /**
    * Padding strategy (similar to CSS `box-sizing`)
    */
  var box: js.UndefOr[String] = js.undefined
  /**
    * Padding around all shapes
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object Box {
  @scala.inline
  def apply(box: String = null, padding: Double | js.Array[Double] = null): Box = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
}

