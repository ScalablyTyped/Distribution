package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChange")
@js.native
open class EmailMailboxChange ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChange {
  
  /** Gets the type of change that was made to the mailbox. This includes whether it was a folder or message that was changed and whether the item was created, deleted, or modified, or if change tracking was lost for this change. */
  /* CompleteClass */
  var changeType: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangeType = js.native
  
  /** Gets the folder to which the change applies. */
  /* CompleteClass */
  var folder: typings.winrtUwp.Windows.ApplicationModel.Email.EmailFolder = js.native
  
  /** Gets the flags that indicate what actions have been affected on the mailbox. */
  /* CompleteClass */
  var mailboxActions: IVector[typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAction] = js.native
  
  /** Gets the message to which the change applies. */
  /* CompleteClass */
  var message: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessage = js.native
}
