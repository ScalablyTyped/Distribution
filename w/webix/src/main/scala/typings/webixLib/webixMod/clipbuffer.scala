package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait clipbuffer extends js.Object {
  def destructor(): scala.Unit
  def focus(): scala.Unit
  def init(): scala.Unit
  def set(text: java.lang.String): scala.Unit
}

object clipbuffer {
  @scala.inline
  def apply(
    destructor: js.Function0[scala.Unit],
    focus: js.Function0[scala.Unit],
    init: js.Function0[scala.Unit],
    set: js.Function1[java.lang.String, scala.Unit]
  ): clipbuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destructor")(destructor)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[clipbuffer]
  }
}

