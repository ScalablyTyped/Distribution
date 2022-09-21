package typings.weappApi.mod

import typings.weappApi.mod.^
import typings.weappApi.mod.wx.AppOptions
import typings.weappApi.mod.wx.PageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * 取消由 setInterval 设置的定时器。
  * @param timeoutID 要取消的定时器的ID
  */
inline def clearInterval(timeoutID: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(timeoutID.asInstanceOf[js.Any]).asInstanceOf[Double]

/**
  * 取消由 setTimeout 设置的定时器。
  * @param timeoutID 要取消的定时器的ID
  */
inline def clearTimeout(timeoutID: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timeoutID.asInstanceOf[js.Any]).asInstanceOf[Double]

/**
  * 我们提供了全局的 getApp() 函数，可以获取到小程序实例。
  */
inline def getApp(): App = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")().asInstanceOf[App]

/**
  * 设定一个定时器。按照指定的周期（以毫秒计）来执行注册的回调函数
  * @param callback
  * @param delay 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。
  * @param rest  param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。
  */
inline def setInterval(callback: Any, delay: Double, rest: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]

// 定时器
/**
  * 设定一个定时器。在定时到期以后执行注册的回调函数
  * @param callback
  * @param delay 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。
  * @param rest  param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。
  */
inline def setTimeout(callback: Any, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def setTimeout(callback: Any, delay: Double, rest: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]

type AppConstructor = js.Function1[/* options */ AppOptions, Unit]

type PageConstructor = js.Function1[/* options */ PageOptions, Unit]
