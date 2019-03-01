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
    charCodeAt: js.Function1[scala.Double, scala.Double],
    copyTo: js.Function4[scala.Double, js.Array[scala.Double], scala.Double, scala.Double, scala.Unit],
    length: js.Function0[scala.Double],
    lineMap: js.Function0[LineMap],
    subText: js.Function1[TextSpan, ISimpleText],
    substr: js.Function3[scala.Double, scala.Double, scala.Boolean, java.lang.String]
  ): ISimpleText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charCodeAt")(charCodeAt)
    __obj.updateDynamic("copyTo")(copyTo)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("lineMap")(lineMap)
    __obj.updateDynamic("subText")(subText)
    __obj.updateDynamic("substr")(substr)
    __obj.asInstanceOf[ISimpleText]
  }
}

