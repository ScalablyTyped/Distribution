package typings.typedoc.distLibUtilsLoggersMod

import typings.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/loggers", "Logger")
@js.native
class Logger () extends js.Object {
  var errorCount: Double = js.native
  def diagnostic(diagnostic: Diagnostic): Unit = js.native
  def diagnostics(diagnostics: js.Array[Diagnostic]): Unit = js.native
  def error(text: String, args: String*): Unit = js.native
  def hasErrors(): Boolean = js.native
  def log(message: String): Unit = js.native
  def log(message: String, level: LogLevel): Unit = js.native
  def log(message: String, level: LogLevel, newLine: Boolean): Unit = js.native
  def resetErrors(): Unit = js.native
  def success(text: String, args: String*): Unit = js.native
  def verbose(text: String, args: String*): Unit = js.native
  def warn(text: String, args: String*): Unit = js.native
  def write(text: String, args: String*): Unit = js.native
  def writeln(text: String, args: String*): Unit = js.native
}

