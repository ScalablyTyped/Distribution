package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleText extends js.Object {
  def charCodeAt(index: Double): Double
  def copyTo(sourceIndex: Double, destination: js.Array[Double], destinationIndex: Double, count: Double): Unit
  def length(): Double
  def lineMap(): LineMap
  def subText(span: TextSpan): ISimpleText
  def substr(start: Double, length: Double, intern: Boolean): String
}

object ISimpleText {
  @scala.inline
  def apply(
    charCodeAt: Double => Double,
    copyTo: (Double, js.Array[Double], Double, Double) => Unit,
    length: () => Double,
    lineMap: () => LineMap,
    subText: TextSpan => ISimpleText,
    substr: (Double, Double, Boolean) => String
  ): ISimpleText = {
    val __obj = js.Dynamic.literal(charCodeAt = js.Any.fromFunction1(charCodeAt), copyTo = js.Any.fromFunction4(copyTo), length = js.Any.fromFunction0(length), lineMap = js.Any.fromFunction0(lineMap), subText = js.Any.fromFunction1(subText), substr = js.Any.fromFunction3(substr))
  
    __obj.asInstanceOf[ISimpleText]
  }
}

