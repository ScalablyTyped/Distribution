package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackLogger extends StObject {
  
  def assert(assertion: Any, args: Any*): Unit = js.native
  
  def clear(): Unit = js.native
  
  def debug(args: Any*): Unit = js.native
  
  def error(args: Any*): Unit = js.native
  
  def getChildLogger(arg0: String): WebpackLogger = js.native
  def getChildLogger(arg0: js.Function0[String]): WebpackLogger = js.native
  
  def group(args: Any*): Unit = js.native
  
  def groupCollapsed(args: Any*): Unit = js.native
  
  def groupEnd(args: Any*): Unit = js.native
  
  def info(args: Any*): Unit = js.native
  
  def log(args: Any*): Unit = js.native
  
  def profile(): Unit = js.native
  def profile(label: Any): Unit = js.native
  
  def profileEnd(): Unit = js.native
  def profileEnd(label: Any): Unit = js.native
  
  def status(args: Any*): Unit = js.native
  
  def time(): Unit = js.native
  def time(label: Any): Unit = js.native
  
  def timeAggregate(): Unit = js.native
  def timeAggregate(label: Any): Unit = js.native
  
  def timeAggregateEnd(): Unit = js.native
  def timeAggregateEnd(label: Any): Unit = js.native
  
  def timeEnd(): Unit = js.native
  def timeEnd(label: Any): Unit = js.native
  
  def timeLog(): Unit = js.native
  def timeLog(label: Any): Unit = js.native
  
  def trace(): Unit = js.native
  
  def warn(args: Any*): Unit = js.native
}
