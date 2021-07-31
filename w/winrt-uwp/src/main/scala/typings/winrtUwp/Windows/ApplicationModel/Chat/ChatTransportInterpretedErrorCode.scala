package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatTransportInterpretedErrorCode extends StObject
/** Specifies an interpretation for the error code. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatTransportInterpretedErrorCode")
@js.native
object ChatTransportInterpretedErrorCode extends StObject {
  
  /** An invalid recipient address */
  @js.native
  sealed trait invalidRecipientAddress
    extends StObject
       with ChatTransportInterpretedErrorCode
  
  /** A network connectivity error */
  @js.native
  sealed trait networkConnectivity
    extends StObject
       with ChatTransportInterpretedErrorCode
  
  /** There was no error. */
  @js.native
  sealed trait none
    extends StObject
       with ChatTransportInterpretedErrorCode
  
  /** A service denied error */
  @js.native
  sealed trait serviceDenied
    extends StObject
       with ChatTransportInterpretedErrorCode
  
  /** A timeout error */
  @js.native
  sealed trait timeout
    extends StObject
       with ChatTransportInterpretedErrorCode
  
  /** There is no interpretation for the error code. */
  @js.native
  sealed trait unknown
    extends StObject
       with ChatTransportInterpretedErrorCode
}
