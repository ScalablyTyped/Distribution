package typings
package weappDashApiLib.weappDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weapp-api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var App: weappDashApiLib.weappDashApiMod.AppConstructor = js.native
  var Page: weappDashApiLib.weappDashApiMod.PageConstructor = js.native
  /**
    * 取消由 setInterval 设置的定时器。
    * @param timeoutID 要取消的定时器的ID
    */
  def clearInterval(timeoutID: scala.Double): scala.Double = js.native
  /**
    * 取消由 setTimeout 设置的定时器。
    * @param timeoutID 要取消的定时器的ID
    */
  def clearTimeout(timeoutID: scala.Double): scala.Double = js.native
  /**
    * 我们提供了全局的 getApp() 函数，可以获取到小程序实例。
    */
  def getApp(): weappDashApiLib.weappDashApiMod.App = js.native
  /**
    * 设定一个定时器。按照指定的周期（以毫秒计）来执行注册的回调函数
    * @param callback
    * @param delay 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。
    * @param rest  param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。
    */
  def setInterval(callback: js.Any, delay: scala.Double, rest: js.Any): scala.Double = js.native
  // 定时器
  /**
    * 设定一个定时器。在定时到期以后执行注册的回调函数
    * @param callback
    * @param delay 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。
    * @param rest  param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。
    */
  def setTimeout(callback: js.Any, delay: scala.Double): scala.Double = js.native
  def setTimeout(callback: js.Any, delay: scala.Double, rest: js.Any): scala.Double = js.native
}

