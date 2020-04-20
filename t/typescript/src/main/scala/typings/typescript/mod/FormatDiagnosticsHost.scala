package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatDiagnosticsHost extends js.Object {
  def getCanonicalFileName(fileName: java.lang.String): java.lang.String
  def getCurrentDirectory(): java.lang.String
  def getNewLine(): java.lang.String
}

object FormatDiagnosticsHost {
  @scala.inline
  def apply(
    getCanonicalFileName: java.lang.String => java.lang.String,
    getCurrentDirectory: () => java.lang.String,
    getNewLine: () => java.lang.String
  ): FormatDiagnosticsHost = {
    val __obj = js.Dynamic.literal(getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getNewLine = js.Any.fromFunction0(getNewLine))
    __obj.asInstanceOf[FormatDiagnosticsHost]
  }
}

