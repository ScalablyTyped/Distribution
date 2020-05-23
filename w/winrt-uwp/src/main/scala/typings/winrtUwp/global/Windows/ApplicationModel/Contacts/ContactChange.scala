package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a change to a Contact . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChange")
@js.native
abstract class ContactChange ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChange {
  /** Gets a value that indicates the type of change that occurred. */
  /* CompleteClass */
  override var changeType: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangeType = js.native
  /** Gets the Contact object that changed. */
  /* CompleteClass */
  override var contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact = js.native
}

