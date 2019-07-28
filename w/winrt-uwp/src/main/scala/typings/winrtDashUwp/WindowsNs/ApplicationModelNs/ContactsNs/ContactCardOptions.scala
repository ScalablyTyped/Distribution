package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about how to display a mini contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardOptions")
@js.native
/** Initializes a new instance of the ContactCardOptions class. */
class ContactCardOptions () extends js.Object {
  /** Gets or sets a value that specifies the type of header to display on the contact card. */
  var headerKind: ContactCardHeaderKind = js.native
  /** Gets or sets a value that indicates which tab to display first on a mini contact card. */
  var initialTabKind: ContactCardTabKind = js.native
  /** Gets a list to which you can add ContactList.Id values to search for on the server. */
  var serverSearchContactListIds: IVector[String] = js.native
}

