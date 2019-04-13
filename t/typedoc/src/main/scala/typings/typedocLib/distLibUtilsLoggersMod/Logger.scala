package typings
package typedocLib.distLibUtilsLoggersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/loggers", "Logger")
@js.native
class Logger () extends js.Object {
  var errorCount: scala.Double = js.native
  def diagnostic(diagnostic: typescriptLib.typescriptMod.Diagnostic): scala.Unit = js.native
  def diagnostics(diagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic]): scala.Unit = js.native
  def error(text: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  def hasErrors(): scala.Boolean = js.native
  def log(message: java.lang.String): scala.Unit = js.native
  def log(message: java.lang.String, level: LogLevel): scala.Unit = js.native
  def log(message: java.lang.String, level: LogLevel, newLine: scala.Boolean): scala.Unit = js.native
  def resetErrors(): scala.Unit = js.native
  def success(text: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  def verbose(text: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  def warn(text: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  def write(text: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  def writeln(text: java.lang.String, args: java.lang.String*): scala.Unit = js.native
}

