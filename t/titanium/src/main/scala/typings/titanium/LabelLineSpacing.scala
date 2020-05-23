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
  def apply(add: js.UndefOr[Double] = js.undefined, multiply: js.UndefOr[Double] = js.undefined): LabelLineSpacing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiply)) __obj.updateDynamic("multiply")(multiply.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLineSpacing]
  }
}

