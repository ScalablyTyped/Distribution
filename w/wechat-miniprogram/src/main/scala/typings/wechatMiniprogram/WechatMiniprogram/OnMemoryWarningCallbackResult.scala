package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramNumbers.`10`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`15`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMemoryWarningCallbackResult extends js.Object {
  /** 内存告警等级，只有 Android 才有，对应系统宏定义
    *
    * 可选值：
    * - 5: TRIM_MEMORY_RUNNING_MODERATE;
    * - 10: TRIM_MEMORY_RUNNING_LOW;
    * - 15: TRIM_MEMORY_RUNNING_CRITICAL; */
  var level: `5` | `10` | `15` = js.native
}

object OnMemoryWarningCallbackResult {
  @scala.inline
  def apply(level: `5` | `10` | `15`): OnMemoryWarningCallbackResult = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMemoryWarningCallbackResult]
  }
  @scala.inline
  implicit class OnMemoryWarningCallbackResultOps[Self <: OnMemoryWarningCallbackResult] (val x: Self) extends AnyVal {
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
    def setLevel(value: `5` | `10` | `15`): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

