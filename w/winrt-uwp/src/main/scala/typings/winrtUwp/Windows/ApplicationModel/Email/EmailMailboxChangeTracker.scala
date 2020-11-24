package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@js.native
trait EmailMailboxChangeTracker extends js.Object {
  
  /** Enables change tracking on a mailbox. */
  def enable(): Unit = js.native
  
  /**
    * Gets a reader that will read a batch of changes.
    * @return A reader that will read a batch of changes.
    */
  def getChangeReader(): EmailMailboxChangeReader = js.native
  
  /** Gets a Boolean value indicating whether change tracking is active. */
  var isTracking: Boolean = js.native
  
  /** Moves the change tracking cursor to now. */
  def reset(): Unit = js.native
}
object EmailMailboxChangeTracker {
  
  @scala.inline
  def apply(
    enable: () => Unit,
    getChangeReader: () => EmailMailboxChangeReader,
    isTracking: Boolean,
    reset: () => Unit
  ): EmailMailboxChangeTracker = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), getChangeReader = js.Any.fromFunction0(getChangeReader), isTracking = isTracking.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[EmailMailboxChangeTracker]
  }
  
  @scala.inline
  implicit class EmailMailboxChangeTrackerOps[Self <: EmailMailboxChangeTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChangeReader(value: () => EmailMailboxChangeReader): Self = this.set("getChangeReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTracking(value: Boolean): Self = this.set("isTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
}
