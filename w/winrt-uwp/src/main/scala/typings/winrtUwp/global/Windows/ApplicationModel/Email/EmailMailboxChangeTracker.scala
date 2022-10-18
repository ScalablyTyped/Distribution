package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangeTracker")
@js.native
open class EmailMailboxChangeTracker ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangeTracker {
  
  /** Enables change tracking on a mailbox. */
  /* CompleteClass */
  override def enable(): Unit = js.native
  
  /**
    * Gets a reader that will read a batch of changes.
    * @return A reader that will read a batch of changes.
    */
  /* CompleteClass */
  override def getChangeReader(): typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangeReader = js.native
  
  /** Gets a Boolean value indicating whether change tracking is active. */
  /* CompleteClass */
  var isTracking: Boolean = js.native
  
  /** Moves the change tracking cursor to now. */
  /* CompleteClass */
  override def reset(): Unit = js.native
}
