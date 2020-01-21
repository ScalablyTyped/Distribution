package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createLivePlayerContext")
@js.native
object createLivePlayerContext extends js.Object {
  /**
  	 * 操作对应的 <live-player/> 组件。
  	 * 创建并返回 live-player 上下文 LivePlayerContext 对象。
  	 * 在自定义组件下，第二个参数传入组件实例this，以操作组件内 <live-player/> 组件
  	 * @version 1.7.0
  	 */
  def apply(id: String, instance: js.Any): LivePlayerContext = js.native
}

