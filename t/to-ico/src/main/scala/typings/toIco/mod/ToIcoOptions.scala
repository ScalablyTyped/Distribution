package typings.toIco.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToIcoOptions extends js.Object {
  /**
    * Use the largest image and resize to sizes defined using the [sizes](#sizes) option.
    *
    * @default false
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of sizes to use when resizing.
    *
    * @default [16, 24, 32, 48, 64, 128, 256]
    */
  var sizes: js.UndefOr[js.Array[Double]] = js.undefined
}

object ToIcoOptions {
  @scala.inline
  def apply(resize: js.UndefOr[Boolean] = js.undefined, sizes: js.Array[Double] = null): ToIcoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToIcoOptions]
  }
}

