package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactInstantMessageField extends IContactField {
  var displayText: String
  var launchUri: Uri
  var service: String
  var userName: String
}

object IContactInstantMessageField {
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    displayText: String,
    launchUri: Uri,
    name: String,
    service: String,
    `type`: ContactFieldType,
    userName: String,
    value: String
  ): IContactInstantMessageField = {
    val __obj = js.Dynamic.literal(category = category, displayText = displayText, launchUri = launchUri, name = name, service = service, userName = userName, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IContactInstantMessageField]
  }
}

