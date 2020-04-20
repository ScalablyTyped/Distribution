package typings.xrm.Xrm

import typings.xrm.XrmEnum.ClientFormFactor
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
  def getFormFactor(): ClientFormFactor
  /**
    * Returns information whether the server is online or offline.
    */
  def isOffline(): Boolean
}

object ClientContext {
  @scala.inline
  def apply(
    getClient: () => Client,
    getClientState: () => ClientState,
    getFormFactor: () => ClientFormFactor,
    isOffline: () => Boolean
  ): ClientContext = {
    val __obj = js.Dynamic.literal(getClient = js.Any.fromFunction0(getClient), getClientState = js.Any.fromFunction0(getClientState), getFormFactor = js.Any.fromFunction0(getFormFactor), isOffline = js.Any.fromFunction0(isOffline))
    __obj.asInstanceOf[ClientContext]
  }
}

