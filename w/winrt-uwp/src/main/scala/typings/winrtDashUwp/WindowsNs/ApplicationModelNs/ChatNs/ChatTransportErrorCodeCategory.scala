package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

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
  
  /* 1 */ val http: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory.http with Double = js.native
  /* 3 */ val mmsServer: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory.mmsServer with Double = js.native
  /* 2 */ val network: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory.network with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatTransportErrorCodeCategory with Double] = js.native
}

