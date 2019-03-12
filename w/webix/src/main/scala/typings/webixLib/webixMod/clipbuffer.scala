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
    destructor: () => scala.Unit,
    focus: () => scala.Unit,
    init: () => scala.Unit,
    set: java.lang.String => scala.Unit
  ): clipbuffer = {
    val __obj = js.Dynamic.literal(destructor = js.Any.fromFunction0(destructor), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[clipbuffer]
  }
}

