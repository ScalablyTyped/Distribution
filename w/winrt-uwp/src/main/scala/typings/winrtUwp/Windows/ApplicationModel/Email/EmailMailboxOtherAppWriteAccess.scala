package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  sealed trait limited extends EmailMailboxOtherAppWriteAccess
  
  /** No external applications may write to this mailbox. */
  @js.native
  sealed trait none extends EmailMailboxOtherAppWriteAccess
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxOtherAppWriteAccess with Double] = js.native
  /* 1 */ @js.native
  object limited extends TopLevel[limited with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

