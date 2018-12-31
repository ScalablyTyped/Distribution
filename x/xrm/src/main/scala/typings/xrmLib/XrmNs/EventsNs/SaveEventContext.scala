package typings
package xrmLib.XrmNs.EventsNs

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

