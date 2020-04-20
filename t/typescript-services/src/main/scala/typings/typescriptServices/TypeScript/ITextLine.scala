package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextLine extends js.Object {
  def end(): Double
  def endIncludingLineBreak(): Double
  def extent(): TextSpan
  def extentIncludingLineBreak(): TextSpan
  def lineNumber(): Double
  def start(): Double
}

object ITextLine {
  @scala.inline
  def apply(
    end: () => Double,
    endIncludingLineBreak: () => Double,
    extent: () => TextSpan,
    extentIncludingLineBreak: () => TextSpan,
    lineNumber: () => Double,
    start: () => Double
  ): ITextLine = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), extent = js.Any.fromFunction0(extent), extentIncludingLineBreak = js.Any.fromFunction0(extentIncludingLineBreak), lineNumber = js.Any.fromFunction0(lineNumber), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ITextLine]
  }
}

