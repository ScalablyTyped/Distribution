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
    end: js.Function0[scala.Double],
    endIncludingLineBreak: js.Function0[scala.Double],
    extent: js.Function0[TextSpan],
    extentIncludingLineBreak: js.Function0[TextSpan],
    lineNumber: js.Function0[scala.Double],
    start: js.Function0[scala.Double],
    toString: js.Function0[java.lang.String]
  ): ITextLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("endIncludingLineBreak")(endIncludingLineBreak)
    __obj.updateDynamic("extent")(extent)
    __obj.updateDynamic("extentIncludingLineBreak")(extentIncludingLineBreak)
    __obj.updateDynamic("lineNumber")(lineNumber)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[ITextLine]
  }
}

