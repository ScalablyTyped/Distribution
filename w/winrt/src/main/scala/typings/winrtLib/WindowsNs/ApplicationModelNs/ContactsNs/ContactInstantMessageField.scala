package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactInstantMessageField")
@js.native
class ContactInstantMessageField protected () extends IContactInstantMessageField {
  def this(userName: java.lang.String) = this()
  def this(userName: java.lang.String, category: ContactFieldCategory) = this()
  def this(userName: java.lang.String, category: ContactFieldCategory, service: java.lang.String, displayText: java.lang.String, verb: winrtLib.WindowsNs.FoundationNs.Uri) = this()
  /* CompleteClass */
  override var category: ContactFieldCategory = js.native
  /* CompleteClass */
  override var displayText: java.lang.String = js.native
  /* CompleteClass */
  override var launchUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var service: java.lang.String = js.native
  /* CompleteClass */
  override var `type`: ContactFieldType = js.native
  /* CompleteClass */
  override var userName: java.lang.String = js.native
  /* CompleteClass */
  override var value: java.lang.String = js.native
}

