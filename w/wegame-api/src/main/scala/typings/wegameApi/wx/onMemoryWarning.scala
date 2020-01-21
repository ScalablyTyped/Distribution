package typings.wegameApi.wx

import typings.wegameApi.AnonLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onMemoryWarning")
@js.native
object onMemoryWarning extends js.Object {
  /**
    * 监听内存不足告警
    * @param callback.res.level 内存告警等级，只有 Android 才有，对应系统宏定义:
    *                           10 TRIM_MEMORY_RUNNING_LOW
    *                           15 TRIM_MEMORY_RUNNING_CRITICAL
    */
  def apply(callback: js.Function1[/* res */ AnonLevel, Unit]): Unit = js.native
}

