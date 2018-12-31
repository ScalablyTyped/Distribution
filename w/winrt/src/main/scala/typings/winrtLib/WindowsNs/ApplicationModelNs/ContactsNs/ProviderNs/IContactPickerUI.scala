package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPickerUI extends js.Object {
  var desiredFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var oncontactremoved: js.Any
  var selectionMode: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
  def addContact(id: java.lang.String, contact: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact): AddContactResult
  def containsContact(id: java.lang.String): scala.Boolean
  def removeContact(id: java.lang.String): scala.Unit
}

