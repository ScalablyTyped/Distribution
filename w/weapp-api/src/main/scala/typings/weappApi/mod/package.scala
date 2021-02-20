package typings.weappApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AppConstructor = js.Function1[/* options */ typings.weappApi.mod.wx.AppOptions, scala.Unit]
  
  type PageConstructor = js.Function1[/* options */ typings.weappApi.mod.wx.PageOptions, scala.Unit]
  
  /**
    * 取消由 setInterval 设置的定时器。
    * @param timeoutID 要取消的定时器的ID
    */
  @scala.inline
  def clearInterval(timeoutID: scala.Double): scala.Double = typings.weappApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(timeoutID.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  /**
    * 取消由 setTimeout 设置的定时器。
    * @param timeoutID 要取消的定时器的ID
    */
  @scala.inline
  def clearTimeout(timeoutID: scala.Double): scala.Double = typings.weappApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timeoutID.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  /**
    * 我们提供了全局的 getApp() 函数，可以获取到小程序实例。
    */
  @scala.inline
  def getApp(): typings.weappApi.mod.App = typings.weappApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getApp")().asInstanceOf[typings.weappApi.mod.App]
  
  /**
    * 设定一个定时器。按照指定的周期（以毫秒计）来执行注册的回调函数
    * @param callback
    * @param delay 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。
    * @param rest  param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。
    */
  @scala.inline
  def setInterval(callback: js.Any, delay: scala.Double, rest: js.Any): scala.Double = (typings.weappApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  // 定时器
  /**
    * 设定一个定时器。在定时到期以后执行注册的回调函数
    * @param callback
    * @param delay 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。
    * @param rest  param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。
    */
  @scala.inline
  def setTimeout(callback: js.Any, delay: scala.Double): scala.Double = (typings.weappApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def setTimeout(callback: js.Any, delay: scala.Double, rest: js.Any): scala.Double = (typings.weappApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
}
