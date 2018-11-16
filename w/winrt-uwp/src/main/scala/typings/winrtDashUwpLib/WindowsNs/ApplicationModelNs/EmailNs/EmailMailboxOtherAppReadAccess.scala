package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxOtherAppReadAccess extends js.Object

/** Defines whether an application can read from a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxOtherAppReadAccess")
@js.native
object EmailMailboxOtherAppReadAccess extends js.Object {
  /** All applications can read from this mailbox. */
  @js.native
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxOtherAppReadAccess
  
  /** Only system level applications can read from this mailbox. */
  @js.native
  sealed trait systemOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxOtherAppReadAccess
  
  val full: full with java.lang.String = js.native
  val systemOnly: systemOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxOtherAppReadAccess with java.lang.String
  ] = js.native
}

