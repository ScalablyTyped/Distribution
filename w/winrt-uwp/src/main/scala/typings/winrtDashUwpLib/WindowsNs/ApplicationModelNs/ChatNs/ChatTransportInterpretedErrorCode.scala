package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

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
  sealed trait invalidRecipientAddress
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode
  
  /** A network connectivity error */
  @js.native
  sealed trait networkConnectivity
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode
  
  /** There was no error. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode
  
  /** A service denied error */
  @js.native
  sealed trait serviceDenied
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode
  
  /** A timeout error */
  @js.native
  sealed trait timeout
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode
  
  /** There is no interpretation for the error code. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode
  
  val invalidRecipientAddress: invalidRecipientAddress with java.lang.String = js.native
  val networkConnectivity: networkConnectivity with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val serviceDenied: serviceDenied with java.lang.String = js.native
  val timeout: timeout with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportInterpretedErrorCode with java.lang.String
  ] = js.native
}

