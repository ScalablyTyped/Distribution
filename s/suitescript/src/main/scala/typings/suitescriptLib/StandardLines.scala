package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLines extends js.Object {
  def getCount(): scala.Double
  def getLine(index: scala.Double): StandardLine
}

object StandardLines {
  @scala.inline
  def apply(getCount: js.Function0[scala.Double], getLine: js.Function1[scala.Double, StandardLine]): StandardLines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getLine")(getLine)
    __obj.asInstanceOf[StandardLines]
  }
}

