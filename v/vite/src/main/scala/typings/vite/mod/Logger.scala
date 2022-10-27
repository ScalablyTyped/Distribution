package typings.vite.mod

import typings.rollup.mod.RollupError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  def clearScreen(`type`: LogType): Unit = js.native
  
  def error(msg: String): Unit = js.native
  def error(msg: String, options: LogErrorOptions): Unit = js.native
  
  def hasErrorLogged(error: js.Error): Boolean = js.native
  def hasErrorLogged(error: RollupError): Boolean = js.native
  
  var hasWarned: Boolean = js.native
  
  def info(msg: String): Unit = js.native
  def info(msg: String, options: LogOptions): Unit = js.native
  
  def warn(msg: String): Unit = js.native
  def warn(msg: String, options: LogOptions): Unit = js.native
  
  def warnOnce(msg: String): Unit = js.native
  def warnOnce(msg: String, options: LogOptions): Unit = js.native
}
