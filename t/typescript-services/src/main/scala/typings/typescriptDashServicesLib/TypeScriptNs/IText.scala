package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IText extends ISimpleText {
  def getLineFromLineNumber(lineNumber: scala.Double): ITextLine = js.native
  def getLineFromPosition(position: scala.Double): ITextLine = js.native
  def getLineNumberFromPosition(position: scala.Double): scala.Double = js.native
  def getLinePosition(position: scala.Double): LineAndCharacter = js.native
  def lineCount(): scala.Double = js.native
  def lines(): js.Array[ITextLine] = js.native
  def toString(span: TextSpan): java.lang.String = js.native
}

