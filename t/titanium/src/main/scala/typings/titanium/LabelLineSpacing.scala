package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See [TextView.setLineSpacing](https://developer.android.com/reference/android/widget/TextView#setLineSpacing(float,%20float))
  */
@js.native
trait LabelLineSpacing extends js.Object {
  /**
    * The value in pixels that should be added to each line other than the last line. This will be applied after the multiplier
    */
  var add: js.UndefOr[Double] = js.native
  /**
    * The value by which each line height other than the last line will be multiplied by
    */
  var multiply: js.UndefOr[Double] = js.native
}

object LabelLineSpacing {
  @scala.inline
  def apply(): LabelLineSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLineSpacing]
  }
  @scala.inline
  implicit class LabelLineSpacingOps[Self <: LabelLineSpacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: Double): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setMultiply(value: Double): Self = this.set("multiply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiply: Self = this.set("multiply", js.undefined)
  }
  
}

