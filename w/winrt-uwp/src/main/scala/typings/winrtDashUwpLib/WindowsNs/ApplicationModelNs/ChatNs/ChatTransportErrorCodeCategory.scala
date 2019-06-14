package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

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
  sealed trait http
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory
  
  /** An MMS server error */
  @js.native
  sealed trait mmsServer
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory
  
  /** Can't connect to the network */
  @js.native
  sealed trait network
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory
  
  /** No specific category for the error code */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory
  
  /* 1 */ val http: http with scala.Double = js.native
  /* 3 */ val mmsServer: mmsServer with scala.Double = js.native
  /* 2 */ val network: network with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatTransportErrorCodeCategory with scala.Double
  ] = js.native
}

