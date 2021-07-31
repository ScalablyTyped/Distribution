package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxOtherAppWriteAccess extends StObject
/** Defines whether an application can write to a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxOtherAppWriteAccess")
@js.native
object EmailMailboxOtherAppWriteAccess extends StObject {
  
  /** Specific applications may write to this mailbox. */
  @js.native
  sealed trait limited
    extends StObject
       with EmailMailboxOtherAppWriteAccess
  
  /** No external applications may write to this mailbox. */
  @js.native
  sealed trait none
    extends StObject
       with EmailMailboxOtherAppWriteAccess
}
