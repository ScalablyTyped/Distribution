package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a session of the USSD network protocol. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
abstract class UssdSession ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.UssdSession {
  
  /** Closes the USSD session with the network. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Sends a message to a USSD session and returns a handler to retrieve the reply asynchronously.
    * @param message The message to send to the USSD session.
    * @return An asynchronous handler to retrieve the USSD response to the sent message.
    */
  /* CompleteClass */
  override def sendMessageAndGetReplyAsync(message: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdMessage): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.NetworkOperators.UssdReply] = js.native
}
object UssdSession {
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a USSD session for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the USSD session.
    * @return The USSD session for the mobile device associated with the supplied network account ID.
    */
  /* static member */
  inline def createFromNetworkAccountId(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.UssdSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.NetworkOperators.UssdSession]
  
  /**
    * Creates a USSD session for the mobile device associated with the supplied network interface ID.
    * @param networkInterfaceId The network interface ID to use to select the corresponding mobile broadband device to use for the USSD session.
    * @return The USSD session for the mobile device associated with the supplied network interface ID.
    */
  /* static member */
  inline def createFromNetworkInterfaceId(networkInterfaceId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.UssdSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.NetworkOperators.UssdSession]
}
