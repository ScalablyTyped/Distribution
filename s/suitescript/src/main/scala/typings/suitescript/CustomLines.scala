package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLines extends js.Object {
  def addNewLine(): CustomLine
  def getCount(): Double
  def getLine(index: Double): CustomLine
}

object CustomLines {
  @scala.inline
  def apply(addNewLine: () => CustomLine, getCount: () => Double, getLine: Double => CustomLine): CustomLines = {
    val __obj = js.Dynamic.literal(addNewLine = js.Any.fromFunction0(addNewLine), getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
  
    __obj.asInstanceOf[CustomLines]
  }
}

