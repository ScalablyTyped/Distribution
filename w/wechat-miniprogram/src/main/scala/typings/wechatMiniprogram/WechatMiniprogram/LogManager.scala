package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogManager extends StObject {
  
  /** [LogManager.debug()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/LogManager.debug.html)
    *
    * 写 debug 日志 */
  def debug(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: Any*): Unit
  
  /** [LogManager.info()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/LogManager.info.html)
    *
    * 写 info 日志 */
  def info(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: Any*): Unit
  
  /** [LogManager.log()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/LogManager.log.html)
    *
    * 写 log 日志 */
  def log(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: Any*): Unit
  
  /** [LogManager.warn()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/LogManager.warn.html)
    *
    * 写 warn 日志 */
  def warn(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: Any*): Unit
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
  
  extension [Self <: LogManager](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
