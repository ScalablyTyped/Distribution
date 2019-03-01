package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var ch: scala.Double
  var line: scala.Double
}

object Position {
  @scala.inline
  def apply(ch: scala.Double, line: scala.Double): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ch")(ch)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[Position]
  }
}

