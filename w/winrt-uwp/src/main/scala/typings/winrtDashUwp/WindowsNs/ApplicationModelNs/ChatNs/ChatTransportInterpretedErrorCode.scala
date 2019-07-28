package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatTransportInterpretedErrorCode extends js.Object

/** Specifies an interpretation for the error code. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatTransportInterpretedErrorCode")
@js.native
object ChatTransportInterpretedErrorCode extends js.Object {
  /** An invalid recipient address */
  @js.native
  sealed trait invalidRecipientAddress extends ChatTransportInterpretedErrorCode
  
  /** A network connectivity error */
  @js.native
  sealed trait networkConnectivity extends ChatTransportInterpretedErrorCode
  
  /** There was no error. */
  @js.native
  sealed trait none extends ChatTransportInterpretedErrorCode
  
  /** A service denied error */
  @js.native
  sealed trait serviceDenied extends ChatTransportInterpretedErrorCode
  
  /** A timeout error */
  @js.native
  sealed trait timeout extends ChatTransportInterpretedErrorCode
  
  /** There is no interpretation for the error code. */
  @js.native
  sealed trait unknown extends ChatTransportInterpretedErrorCode
  
  /* 2 */ val invalidRecipientAddress: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode.invalidRecipientAddress with Double = js.native
  /* 3 */ val networkConnectivity: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode.networkConnectivity with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode.none with Double = js.native
  /* 4 */ val serviceDenied: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode.serviceDenied with Double = js.native
  /* 5 */ val timeout: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode.timeout with Double = js.native
  /* 1 */ val unknown: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatTransportInterpretedErrorCode with Double] = js.native
}

