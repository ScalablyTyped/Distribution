package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatDiagnosticsHost extends js.Object {
  def getCanonicalFileName(fileName: String): String
  def getCurrentDirectory(): String
  def getNewLine(): String
}

object FormatDiagnosticsHost {
  @scala.inline
  def apply(
    getCanonicalFileName: String => String,
    getCurrentDirectory: () => String,
    getNewLine: () => String
  ): FormatDiagnosticsHost = {
    val __obj = js.Dynamic.literal(getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getNewLine = js.Any.fromFunction0(getNewLine))
  
    __obj.asInstanceOf[FormatDiagnosticsHost]
  }
}

