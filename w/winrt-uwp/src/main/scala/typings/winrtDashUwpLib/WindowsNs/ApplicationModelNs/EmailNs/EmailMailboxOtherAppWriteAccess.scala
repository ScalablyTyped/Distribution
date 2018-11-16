package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxOtherAppWriteAccess extends js.Object

/** Defines whether an application can write to a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxOtherAppWriteAccess")
@js.native
object EmailMailboxOtherAppWriteAccess extends js.Object {
  /** Specific applications may write to this mailbox. */
  @js.native
  sealed trait limited
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxOtherAppWriteAccess
  
  /** No external applications may write to this mailbox. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxOtherAppWriteAccess
  
  val limited: limited with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxOtherAppWriteAccess with java.lang.String
  ] = js.native
}

