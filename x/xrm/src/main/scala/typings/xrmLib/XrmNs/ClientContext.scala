package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for the client context.
     */

trait ClientContext extends js.Object {
  /**
           * Returns a value to indicate which client the script is executing in.
           * @returns The client, as either "Web", "Outlook", or "Mobile"
           */
  def getClient(): Client
  /**
           * Gets client's current state.
           * @returns The client state, as either "Online" or "Offline"
           */
  def getClientState(): ClientState
  /**
           * Use this method to get information about the kind of device the user is using.
           */
  def getFormFactor(): xrmLib.XrmEnumNs.ClientFormFactor
  /**
           * Returns information whether the server is online or offline.
           */
  def isOffline(): scala.Boolean
}

