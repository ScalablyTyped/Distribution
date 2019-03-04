package typings
package typescriptLib.typescriptMod.tsNs

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
    getCanonicalFileName: js.Function1[java.lang.String, java.lang.String],
    getCurrentDirectory: js.Function0[java.lang.String],
    getNewLine: js.Function0[java.lang.String]
  ): FormatDiagnosticsHost = {
    val __obj = js.Dynamic.literal(getCanonicalFileName = getCanonicalFileName, getCurrentDirectory = getCurrentDirectory, getNewLine = getNewLine)
  
    __obj.asInstanceOf[FormatDiagnosticsHost]
  }
}

