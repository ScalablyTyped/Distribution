package typings.xrm.Xrm.Events

import typings.xrm.Xrm.Attributes.Attribute
import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.FormContext
import typings.xrm.Xrm.GlobalContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a save event context
  */
trait SaveEventContext extends EventContext {
  /**
    * Gets save-event arguments.
    * @returns The event arguments.  Returns null for all but the "save" event.
    */
  def getEventArgs(): SaveEventArguments
}

object SaveEventContext {
  @scala.inline
  def apply(
    getContext: () => GlobalContext,
    getDepth: () => Double,
    getEventArgs: () => SaveEventArguments,
    getEventSource: () => Attribute | Control | Entity,
    getFormContext: () => FormContext,
    getSharedVariable: String => js.Any,
    setSharedVariable: (String, js.Any) => Unit
  ): SaveEventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
  
    __obj.asInstanceOf[SaveEventContext]
  }
}

