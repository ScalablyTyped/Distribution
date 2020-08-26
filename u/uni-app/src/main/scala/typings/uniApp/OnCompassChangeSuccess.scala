package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCompassChangeSuccess extends js.Object {
  /**
    * 面对的方向度数
    */
  var direction: js.UndefOr[Double] = js.native
}

object OnCompassChangeSuccess {
  @scala.inline
  def apply(): OnCompassChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnCompassChangeSuccess]
  }
  @scala.inline
  implicit class OnCompassChangeSuccessOps[Self <: OnCompassChangeSuccess] (val x: Self) extends AnyVal {
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
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
  
}

