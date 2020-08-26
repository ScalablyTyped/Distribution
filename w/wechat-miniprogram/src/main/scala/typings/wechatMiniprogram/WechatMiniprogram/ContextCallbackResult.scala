package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextCallbackResult extends js.Object {
  /** 节点对应的 Context 对象 */
  var context: IAnyObject = js.native
}

object ContextCallbackResult {
  @scala.inline
  def apply(context: IAnyObject): ContextCallbackResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextCallbackResult]
  }
  @scala.inline
  implicit class ContextCallbackResultOps[Self <: ContextCallbackResult] (val x: Self) extends AnyVal {
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
    def setContext(value: IAnyObject): Self = this.set("context", value.asInstanceOf[js.Any])
  }
  
}

