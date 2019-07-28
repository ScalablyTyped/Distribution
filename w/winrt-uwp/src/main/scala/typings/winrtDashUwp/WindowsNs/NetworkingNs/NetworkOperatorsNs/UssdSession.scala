package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a session of the USSD network protocol. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
abstract class UssdSession () extends js.Object {
  /** Closes the USSD session with the network. */
  def close(): Unit = js.native
  /**
    * Sends a message to a USSD session and returns a handler to retrieve the reply asynchronously.
    * @param message The message to send to the USSD session.
    * @return An asynchronous handler to retrieve the USSD response to the sent message.
    */
  def sendMessageAndGetReplyAsync(message: UssdMessage): IPromiseWithIAsyncOperation[UssdReply] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
object UssdSession extends js.Object {
  /**
    * Creates a USSD session for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the USSD session.
    * @return The USSD session for the mobile device associated with the supplied network account ID.
    */
  def createFromNetworkAccountId(networkAccountId: String): UssdSession = js.native
  /**
    * Creates a USSD session for the mobile device associated with the supplied network interface ID.
    * @param networkInterfaceId The network interface ID to use to select the corresponding mobile broadband device to use for the USSD session.
    * @return The USSD session for the mobile device associated with the supplied network interface ID.
    */
  def createFromNetworkInterfaceId(networkInterfaceId: String): UssdSession = js.native
}

