package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatDiagnosticsHost extends js.Object {
  def getCanonicalFileName(fileName: java.lang.String): java.lang.String = js.native
  def getCurrentDirectory(): java.lang.String = js.native
  def getNewLine(): java.lang.String = js.native
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
  @scala.inline
  implicit class FormatDiagnosticsHostOps[Self <: FormatDiagnosticsHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCanonicalFileName(value: java.lang.String => java.lang.String): Self = this.set("getCanonicalFileName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = this.set("getCurrentDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNewLine(value: () => java.lang.String): Self = this.set("getNewLine", js.Any.fromFunction0(value))
  }
  
}

