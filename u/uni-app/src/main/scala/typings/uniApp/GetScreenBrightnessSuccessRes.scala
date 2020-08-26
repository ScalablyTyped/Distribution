package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScreenBrightnessSuccessRes extends js.Object {
  /**
    * 屏幕亮度值，范围 0~1，0 最暗，1 最亮。
    */
  var value: js.UndefOr[Double] = js.native
}

object GetScreenBrightnessSuccessRes {
  @scala.inline
  def apply(): GetScreenBrightnessSuccessRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetScreenBrightnessSuccessRes]
  }
  @scala.inline
  implicit class GetScreenBrightnessSuccessResOps[Self <: GetScreenBrightnessSuccessRes] (val x: Self) extends AnyVal {
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

