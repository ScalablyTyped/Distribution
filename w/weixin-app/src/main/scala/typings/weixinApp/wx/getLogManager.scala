package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getLogManager")
@js.native
object getLogManager extends js.Object {
  // #region LogManager
  /**
  	 * 获取日志管理器 logManager 对象。logManager提供log、info、warn、debug四个方法写日志到文件，
  	 * 这四个方法接受任意个类型为Object/Array/Number/String的参数，
  	 * 每次调用的参数的总大小不超过100Kb。最多保存5M的日志内容，超过5M后，旧的日志内容会被删除。
  	 * 用户可以通过设置Button组件的open-type为feedback来上传打印的日志。
  	 * 用户上传的日志可以通过登录小程序管理后台后进入左侧菜单“客服反馈”页面获取到。
  	 */
  def apply(): Logger = js.native
}

