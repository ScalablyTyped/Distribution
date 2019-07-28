package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of Contact objects and server search status. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactBatch")
@js.native
abstract class ContactBatch () extends js.Object {
  /** Gets the list of Contact objects returned by a search operation. */
  var contacts: IVectorView[Contact] = js.native
  /** Gets a ContactBatchStatus value that indicates if a search was successful or if there was a server error. */
  var status: ContactBatchStatus = js.native
}

