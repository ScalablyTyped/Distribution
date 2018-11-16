package typings
package xrmLib.XrmNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for a process stage change event context
         */

trait StageChangeEventContext extends EventContext {
  /**
               * Gets process stage change event arguments.
               * @returns The event arguments.
               */
  def getEventArgs(): StageChangeEventArguments
}

