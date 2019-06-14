package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatMessageOperatorKind extends js.Object

/** Specifies the message operator type. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageOperatorKind")
@js.native
object ChatMessageOperatorKind extends js.Object {
  /** MMS message */
  @js.native
  sealed trait mms
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageOperatorKind
  
  /** RCS message */
  @js.native
  sealed trait rcs
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageOperatorKind
  
  /** SMS message */
  @js.native
  sealed trait sms
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageOperatorKind
  
  /** The value hasn't been set. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageOperatorKind
  
  /* 2 */ val mms: mms with scala.Double = js.native
  /* 3 */ val rcs: rcs with scala.Double = js.native
  /* 1 */ val sms: sms with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageOperatorKind with scala.Double
  ] = js.native
}

