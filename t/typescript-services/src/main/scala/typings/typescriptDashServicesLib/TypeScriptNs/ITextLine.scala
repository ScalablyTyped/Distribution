package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextLine extends js.Object {
  def end(): scala.Double
  def endIncludingLineBreak(): scala.Double
  def extent(): TextSpan
  def extentIncludingLineBreak(): TextSpan
  def lineNumber(): scala.Double
  def start(): scala.Double
}

object ITextLine {
  @scala.inline
  def apply(
    end: () => scala.Double,
    endIncludingLineBreak: () => scala.Double,
    extent: () => TextSpan,
    extentIncludingLineBreak: () => TextSpan,
    lineNumber: () => scala.Double,
    start: () => scala.Double,
    toString: () => java.lang.String
  ): ITextLine = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), extent = js.Any.fromFunction0(extent), extentIncludingLineBreak = js.Any.fromFunction0(extentIncludingLineBreak), lineNumber = js.Any.fromFunction0(lineNumber), start = js.Any.fromFunction0(start), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ITextLine]
  }
}

