package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of Contact objects and server search status. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactBatch")
@js.native
abstract class ContactBatch ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatch {
  /** Gets the list of Contact objects returned by a search operation. */
  /* CompleteClass */
  override var contacts: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact] = js.native
  /** Gets a ContactBatchStatus value that indicates if a search was successful or if there was a server error. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus = js.native
}

