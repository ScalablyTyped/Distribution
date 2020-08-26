package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnKeyboardHeightChangeResult extends js.Object {
  /**
    * 键盘高度
    */
  var height: js.UndefOr[Double] = js.native
}

object OnKeyboardHeightChangeResult {
  @scala.inline
  def apply(): OnKeyboardHeightChangeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnKeyboardHeightChangeResult]
  }
  @scala.inline
  implicit class OnKeyboardHeightChangeResultOps[Self <: OnKeyboardHeightChangeResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
  
}

