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
  def apply(
    addNewLine: js.Function0[CustomLine],
    getCount: js.Function0[scala.Double],
    getLine: js.Function1[scala.Double, CustomLine]
  ): CustomLines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNewLine")(addNewLine)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getLine")(getLine)
    __obj.asInstanceOf[CustomLines]
  }
}

