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
  def apply(
    attachTo: js.Function1[js.Any, scala.Unit],
    getContext: js.Function0[js.Any],
    setContext: js.Function1[js.Any, scala.Unit]
  ): ContextHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachTo")(attachTo)
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("setContext")(setContext)
    __obj.asInstanceOf[ContextHelper]
  }
}

