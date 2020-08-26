package typings.viewabilityHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var callbackParams: js.UndefOr[js.Array[_]] = js.native
  var intersectionPercentage: js.UndefOr[Double] = js.native
  var rootMargin: js.UndefOr[String] = js.native
  var scrollDimmer: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[js.Array[Double]] = js.native
  var unobserve: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallbackParamsVarargs(value: js.Any*): Self = this.set("callbackParams", js.Array(value :_*))
    @scala.inline
    def setCallbackParams(value: js.Array[_]): Self = this.set("callbackParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackParams: Self = this.set("callbackParams", js.undefined)
    @scala.inline
    def setIntersectionPercentage(value: Double): Self = this.set("intersectionPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectionPercentage: Self = this.set("intersectionPercentage", js.undefined)
    @scala.inline
    def setRootMargin(value: String): Self = this.set("rootMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootMargin: Self = this.set("rootMargin", js.undefined)
    @scala.inline
    def setScrollDimmer(value: Double): Self = this.set("scrollDimmer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollDimmer: Self = this.set("scrollDimmer", js.undefined)
    @scala.inline
    def setThresholdVarargs(value: Double*): Self = this.set("threshold", js.Array(value :_*))
    @scala.inline
    def setThreshold(value: js.Array[Double]): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setUnobserve(value: Boolean): Self = this.set("unobserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnobserve: Self = this.set("unobserve", js.undefined)
  }
  
}

