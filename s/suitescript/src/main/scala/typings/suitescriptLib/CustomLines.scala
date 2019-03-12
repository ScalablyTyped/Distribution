package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLines extends js.Object {
  def addNewLine(): CustomLine
  def getCount(): scala.Double
  def getLine(index: scala.Double): CustomLine
}

object CustomLines {
  @scala.inline
  def apply(addNewLine: () => CustomLine, getCount: () => scala.Double, getLine: scala.Double => CustomLine): CustomLines = {
    val __obj = js.Dynamic.literal(addNewLine = js.Any.fromFunction0(addNewLine), getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
  
    __obj.asInstanceOf[CustomLines]
  }
}

