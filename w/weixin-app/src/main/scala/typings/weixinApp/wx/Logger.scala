package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 接口
trait Logger extends StObject {
  
  /**
    * 写debug日志，参数同log方法
    */
  def debug(args: Any*): Unit
  
  /**
    * 写info日志，参数同log方法
    */
  def info(args: Any*): Unit
  
  /**
    * 写log日志，可以提供任意个参数，每个参数的类型为Object/Array/Number/String，参数p1到pN的内容会写入日志
    */
  def log(args: Any*): Unit
  
  /**
    * 写warn日志，参数同log方法
    */
  def warn(args: Any*): Unit
}
object Logger {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    info: /* repeated */ Any => Unit,
    log: /* repeated */ Any => Unit,
    warn: /* repeated */ Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
