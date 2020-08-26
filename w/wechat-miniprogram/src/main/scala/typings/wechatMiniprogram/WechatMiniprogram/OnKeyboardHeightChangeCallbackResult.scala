package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnKeyboardHeightChangeCallbackResult extends js.Object {
  /** 键盘高度 */
  var height: Double = js.native
}

object OnKeyboardHeightChangeCallbackResult {
  @scala.inline
  def apply(height: Double): OnKeyboardHeightChangeCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyboardHeightChangeCallbackResult]
  }
  @scala.inline
  implicit class OnKeyboardHeightChangeCallbackResultOps[Self <: OnKeyboardHeightChangeCallbackResult] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
  }
  
}

