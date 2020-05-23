package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextHelper extends js.Object {
  def attachTo(view: js.Any): Unit
  def getContext(): js.Any
  def setContext(context: js.Any): Unit
}

object ContextHelper {
  @scala.inline
  def apply(attachTo: js.Any => Unit, getContext: () => js.Any, setContext: js.Any => Unit): ContextHelper = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), getContext = js.Any.fromFunction0(getContext), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[ContextHelper]
  }
}

