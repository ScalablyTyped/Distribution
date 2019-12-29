package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatTransportErrorCodeCategory extends js.Object

/** Specifies the category of a transport error. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatTransportErrorCodeCategory")
@js.native
object ChatTransportErrorCodeCategory extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatTransportErrorCodeCategory with Double] = js.native
  /* 1 */ @js.native
  object http extends TopLevel[http with Double]
  
  /* 3 */ @js.native
  object mmsServer extends TopLevel[mmsServer with Double]
  
  /* 2 */ @js.native
  object network extends TopLevel[network with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

