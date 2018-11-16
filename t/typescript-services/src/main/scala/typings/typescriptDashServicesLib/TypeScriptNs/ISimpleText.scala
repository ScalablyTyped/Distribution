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

