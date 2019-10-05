package typings.weappDashApi.weappDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weapp-api", "setTimeout")
@js.native
object setTimeout extends js.Object {
  // 定时器
  /**
    * 设定一个定时器。在定时到期以后执行注册的回调函数
    * @param callback
    * @param delay 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。
    * @param rest  param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。
    */
  def apply(callback: js.Any, delay: Double): Double = js.native
  def apply(callback: js.Any, delay: Double, rest: js.Any): Double = js.native
}

