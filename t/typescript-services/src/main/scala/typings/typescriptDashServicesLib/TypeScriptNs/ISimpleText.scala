package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleText extends js.Object {
  def charCodeAt(index: scala.Double): scala.Double
  def copyTo(
    sourceIndex: scala.Double,
    destination: js.Array[scala.Double],
    destinationIndex: scala.Double,
    count: scala.Double
  ): scala.Unit
  def length(): scala.Double
  def lineMap(): LineMap
  def subText(span: TextSpan): ISimpleText
  def substr(start: scala.Double, length: scala.Double, intern: scala.Boolean): java.lang.String
}

object ISimpleText {
  @scala.inline
  def apply(
    charCodeAt: scala.Double => scala.Double,
    copyTo: (scala.Double, js.Array[scala.Double], scala.Double, scala.Double) => scala.Unit,
    length: () => scala.Double,
    lineMap: () => LineMap,
    subText: TextSpan => ISimpleText,
    substr: (scala.Double, scala.Double, scala.Boolean) => java.lang.String
  ): ISimpleText = {
    val __obj = js.Dynamic.literal(charCodeAt = js.Any.fromFunction1(charCodeAt), copyTo = js.Any.fromFunction4(copyTo), length = js.Any.fromFunction0(length), lineMap = js.Any.fromFunction0(lineMap), subText = js.Any.fromFunction1(subText), substr = js.Any.fromFunction3(substr))
  
    __obj.asInstanceOf[ISimpleText]
  }
}

