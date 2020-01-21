package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for monitoring changes to Contact objects in the ContactStore . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangeTracker")
@js.native
abstract class ContactChangeTracker () extends js.Object {
  /** Call this method to enable change tracking. */
  def enable(): Unit = js.native
  /**
    * Gets a ContactChangeReader that can be used to process changes.
    * @return A ContactChangeReader that can be used to process changes.
    */
  def getChangeReader(): ContactChangeReader = js.native
  /** Call this method to reset the change tracker if your app receives ContactChangeType.ChangeTrackingLost . */
  def reset(): Unit = js.native
}

