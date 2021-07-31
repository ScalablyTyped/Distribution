package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UssdResultCode extends StObject
/** Describes the USSD response codes for messages sent to the network. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
@js.native
object UssdResultCode extends StObject {
  
  /** The USSD message that was received is either a USSD request from the network or a response to a message sent to the network. Additional information is needed. The USSD session is open. */
  @js.native
  sealed trait actionRequired
    extends StObject
       with UssdResultCode
  
  /** The USSD session has been closed because there was no response from the network. */
  @js.native
  sealed trait networkTimeout
    extends StObject
       with UssdResultCode
  
  /** The USSD message that was received is either a USSD notification from the network or a response to an earlier request. No further information is necessary. The USSD session is closed. */
  @js.native
  sealed trait noActionRequired
    extends StObject
       with UssdResultCode
  
  /** The previous USSD request failed because the request was invalid or cannot be handled by the driver, device, or network. */
  @js.native
  sealed trait operationNotSupported
    extends StObject
       with UssdResultCode
  
  /** The previous USSD request failed because another local client has an active USSD session. */
  @js.native
  sealed trait otherLocalClient
    extends StObject
       with UssdResultCode
  
  /** The USSD session has been terminated by the network or a local client. */
  @js.native
  sealed trait terminated
    extends StObject
       with UssdResultCode
}
