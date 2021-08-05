package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
trait EmailMailboxChangeTracker extends StObject {
  
  /** Enables change tracking on a mailbox. */
  def enable(): Unit
  
  /**
    * Gets a reader that will read a batch of changes.
    * @return A reader that will read a batch of changes.
    */
  def getChangeReader(): EmailMailboxChangeReader
  
  /** Gets a Boolean value indicating whether change tracking is active. */
  var isTracking: Boolean
  
  /** Moves the change tracking cursor to now. */
  def reset(): Unit
}
object EmailMailboxChangeTracker {
  
  inline def apply(
    enable: () => Unit,
    getChangeReader: () => EmailMailboxChangeReader,
    isTracking: Boolean,
    reset: () => Unit
  ): EmailMailboxChangeTracker = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), getChangeReader = js.Any.fromFunction0(getChangeReader), isTracking = isTracking.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[EmailMailboxChangeTracker]
  }
  
  extension [Self <: EmailMailboxChangeTracker](x: Self) {
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetChangeReader(value: () => EmailMailboxChangeReader): Self = StObject.set(x, "getChangeReader", js.Any.fromFunction0(value))
    
    inline def setIsTracking(value: Boolean): Self = StObject.set(x, "isTracking", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
