package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See [TextView.setLineSpacing](https://developer.android.com/reference/android/widget/TextView#setLineSpacing(float,%20float))
  */
trait LabelLineSpacing extends js.Object {
  /**
  	 * The value in pixels that should be added to each line other than the last line. This will be applied after the multiplier
  	 */
  var add: js.UndefOr[Double] = js.undefined
  /**
  	 * The value by which each line height other than the last line will be multiplied by
  	 */
  var multiply: js.UndefOr[Double] = js.undefined
}

object LabelLineSpacing {
  @scala.inline
  def apply(add: Int | Double = null, multiply: Int | Double = null): LabelLineSpacing = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (multiply != null) __obj.updateDynamic("multiply")(multiply.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLineSpacing]
  }
}

