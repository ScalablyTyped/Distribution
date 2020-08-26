package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowResizeResult extends js.Object {
  /**
    * 变化后的窗口高度，单位 px
    */
  var windowHeight: js.UndefOr[Double] = js.native
  /**
    * 变化后的窗口宽度，单位 px
    */
  var windowWidth: js.UndefOr[Double] = js.native
}

object WindowResizeResult {
  @scala.inline
  def apply(): WindowResizeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowResizeResult]
  }
  @scala.inline
  implicit class WindowResizeResultOps[Self <: WindowResizeResult] (val x: Self) extends AnyVal {
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
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowHeight: Self = this.set("windowHeight", js.undefined)
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowWidth: Self = this.set("windowWidth", js.undefined)
  }
  
}

