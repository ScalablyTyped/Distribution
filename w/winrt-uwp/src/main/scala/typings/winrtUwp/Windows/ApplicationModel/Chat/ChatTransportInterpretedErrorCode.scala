package typings.winrtUwp.Windows.ApplicationModel.Chat

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
  
}

