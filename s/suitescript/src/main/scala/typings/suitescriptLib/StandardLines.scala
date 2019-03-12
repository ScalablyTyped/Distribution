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
  def apply(getCount: () => scala.Double, getLine: scala.Double => StandardLine): StandardLines = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
  
    __obj.asInstanceOf[StandardLines]
  }
}

