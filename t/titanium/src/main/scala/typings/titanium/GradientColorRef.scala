package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object consisting of a color and an offset.
  */
@js.native
trait GradientColorRef extends js.Object {
  /**
    * Color value at this point in the gradient, as a color name or hex triplet.
    */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
    * The color's normalized position within the gradient, ranging from 0 (start) to 1 (end).
    */
  var offset: js.UndefOr[Double] = js.native
}

object GradientColorRef {
  @scala.inline
  def apply(): GradientColorRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientColorRef]
  }
  @scala.inline
  implicit class GradientColorRefOps[Self <: GradientColorRef] (val x: Self) extends AnyVal {
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
    def setColor(value: java.lang.String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

