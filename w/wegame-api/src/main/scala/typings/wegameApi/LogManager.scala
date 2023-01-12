package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 日志管理类，最多保存5M的日志内容，超过5M后，旧的日志内容会被删除。
  * 对于小程序，用户可以通过使用 button 组件的 open-type="feedback" 来上传打印的日志。
  * 对于小游戏，用户可以通过使用 wx.createFeedbackButton 来创建上传打印的日志的按钮。
  * 开发者可以通过小程序管理后台左侧菜单“反馈管理”页面查看相关打印日志。
  * 基础库默认会把 App、Page 的生命周期函数和 wx 命名空间下的函数调用写入日志。
  */
trait LogManager extends StObject {
  
  /**
    * 写debug日志
    * @param args 要记录的日志内容
    */
  def debug(args: Any*): Unit
  
  /**
    * 写info日志
    * @param args 要记录的日志内容
    */
  def info(args: Any*): Unit
  
  /**
    * 写log日志
    * @param args 要记录的日志内容
    */
  def log(args: Any*): Unit
  
  /**
    * 写warn日志
    * @param args 要记录的日志内容
    */
  def warn(args: Any*): Unit
}
object LogManager {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    info: /* repeated */ Any => Unit,
    log: /* repeated */ Any => Unit,
    warn: /* repeated */ Any => Unit
  ): LogManager = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LogManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogManager] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
