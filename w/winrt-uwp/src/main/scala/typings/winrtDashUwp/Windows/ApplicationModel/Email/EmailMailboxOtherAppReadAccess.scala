package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxOtherAppReadAccess.full
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxOtherAppReadAccess.systemOnly
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
  sealed trait full extends EmailMailboxOtherAppReadAccess
  
  /** Only system level applications can read from this mailbox. */
  @js.native
  sealed trait systemOnly extends EmailMailboxOtherAppReadAccess
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxOtherAppReadAccess with Double] = js.native
  /* 1 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 0 */ @js.native
  object systemOnly extends TopLevel[systemOnly with Double]
  
}

