package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of Contact objects and server search status. */
trait ContactBatch extends js.Object {
  /** Gets the list of Contact objects returned by a search operation. */
  var contacts: IVectorView[Contact]
  /** Gets a ContactBatchStatus value that indicates if a search was successful or if there was a server error. */
  var status: ContactBatchStatus
}

object ContactBatch {
  @scala.inline
  def apply(contacts: IVectorView[Contact], status: ContactBatchStatus): ContactBatch = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactBatch]
  }
}

