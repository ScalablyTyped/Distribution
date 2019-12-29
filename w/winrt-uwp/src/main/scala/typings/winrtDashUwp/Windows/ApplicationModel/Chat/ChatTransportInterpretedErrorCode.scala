package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatTransportInterpretedErrorCode with Double] = js.native
  /* 2 */ @js.native
  object invalidRecipientAddress extends TopLevel[invalidRecipientAddress with Double]
  
  /* 3 */ @js.native
  object networkConnectivity extends TopLevel[networkConnectivity with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object serviceDenied extends TopLevel[serviceDenied with Double]
  
  /* 5 */ @js.native
  object timeout extends TopLevel[timeout with Double]
  
  /* 1 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

