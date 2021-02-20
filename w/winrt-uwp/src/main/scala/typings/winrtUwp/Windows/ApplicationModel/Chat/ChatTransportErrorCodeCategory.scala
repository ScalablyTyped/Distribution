package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatTransportErrorCodeCategory extends StObject
/** Specifies the category of a transport error. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatTransportErrorCodeCategory")
@js.native
object ChatTransportErrorCodeCategory extends StObject {
  
  /** An HTTP error */
  @js.native
  sealed trait http extends ChatTransportErrorCodeCategory
  
  /** An MMS server error */
  @js.native
  sealed trait mmsServer extends ChatTransportErrorCodeCategory
  
  /** Can't connect to the network */
  @js.native
  sealed trait network extends ChatTransportErrorCodeCategory
  
  /** No specific category for the error code */
  @js.native
  sealed trait none extends ChatTransportErrorCodeCategory
}
