package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createContext")
@js.native
object createContext extends js.Object {
  /**
  	 * 创建并返回绘图上下文context对象。
  	 * context只是一个记录方法调用的容器，
  	 * 用于生成记录绘制行为的actions数组。c
  	 * ontext跟<canvas/>不存在对应关系，
  	 * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
  	 */
  def apply(): CanvasContext = js.native
}

