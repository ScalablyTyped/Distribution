package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactInstantMessageField extends IContactField {
  var displayText: java.lang.String
  var launchUri: winrtLib.WindowsNs.FoundationNs.Uri
  var service: java.lang.String
  var userName: java.lang.String
}

object IContactInstantMessageField {
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    displayText: java.lang.String,
    launchUri: winrtLib.WindowsNs.FoundationNs.Uri,
    name: java.lang.String,
    service: java.lang.String,
    `type`: ContactFieldType,
    userName: java.lang.String,
    value: java.lang.String
  ): IContactInstantMessageField = {
    val __obj = js.Dynamic.literal(category = category, displayText = displayText, launchUri = launchUri, name = name, service = service, userName = userName, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IContactInstantMessageField]
  }
}

