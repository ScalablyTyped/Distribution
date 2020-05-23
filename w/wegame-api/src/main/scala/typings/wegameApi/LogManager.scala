package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 日志管理类，最多保存5M的日志内容，超过5M后，旧的日志内容会被删除。
  * 对于小程序，用户可以通过使用 button 组件的 open-type="feedback" 来上传打印的日志。
  * 对于小游戏，用户可以通过使用 wx.createFeedbackButton 来创建上传打印的日志的按钮。
  * 开发者可以通过小程序管理后台左侧菜单“反馈管理”页面查看相关打印日志。
  * 基础库默认会把 App、Page 的生命周期函数和 wx 命名空间下的函数调用写入日志。
  */
trait LogManager extends js.Object {
  /**
    * 写debug日志
    * @param args 要记录的日志内容
    */
  def debug(args: js.Any*): Unit
  /**
    * 写info日志
    * @param args 要记录的日志内容
    */
  def info(args: js.Any*): Unit
  /**
    * 写log日志
    * @param args 要记录的日志内容
    */
  def log(args: js.Any*): Unit
  /**
    * 写warn日志
    * @param args 要记录的日志内容
    */
  def warn(args: js.Any*): Unit
}

object LogManager {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): LogManager = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LogManager]
  }
}

