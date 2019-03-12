package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextHelper extends js.Object {
  def attachTo(view: js.Any): scala.Unit
  def getContext(): js.Any
  def setContext(context: js.Any): scala.Unit
}

object ContextHelper {
  @scala.inline
  def apply(attachTo: js.Any => scala.Unit, getContext: () => js.Any, setContext: js.Any => scala.Unit): ContextHelper = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), getContext = js.Any.fromFunction0(getContext), setContext = js.Any.fromFunction1(setContext))
  
    __obj.asInstanceOf[ContextHelper]
  }
}

