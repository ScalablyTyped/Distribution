package typings.wechatMiniprogram.WechatMiniprogram.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerEventOption extends js.Object {
  /** 事件是否冒泡
    *
    * 默认值： `false`
    */
  var bubbles: js.UndefOr[Boolean] = js.native
  /** 事件是否拥有捕获阶段
    *
    * 默认值： `false`
    */
  var capturePhase: js.UndefOr[Boolean] = js.native
  /** 事件是否可以穿越组件边界，为false时，事件将只能在引用组件的节点树上触发，不进入其他任何组件内部
    *
    * 默认值： `false`
    */
  var composed: js.UndefOr[Boolean] = js.native
}

object TriggerEventOption {
  @scala.inline
  def apply(): TriggerEventOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerEventOption]
  }
  @scala.inline
  implicit class TriggerEventOptionOps[Self <: TriggerEventOption] (val x: Self) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbles: Self = this.set("bubbles", js.undefined)
    @scala.inline
    def setCapturePhase(value: Boolean): Self = this.set("capturePhase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapturePhase: Self = this.set("capturePhase", js.undefined)
    @scala.inline
    def setComposed(value: Boolean): Self = this.set("composed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposed: Self = this.set("composed", js.undefined)
  }
  
}

