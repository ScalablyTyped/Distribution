package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLines extends js.Object {
  def getCount(): Double
  def getLine(index: Double): StandardLine
}

object StandardLines {
  @scala.inline
  def apply(getCount: () => Double, getLine: Double => StandardLine): StandardLines = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[StandardLines]
  }
}

