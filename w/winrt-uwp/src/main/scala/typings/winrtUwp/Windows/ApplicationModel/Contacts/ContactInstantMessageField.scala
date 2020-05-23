package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a field that is an instant messaging (IM) address. */
trait ContactInstantMessageField extends js.Object {
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory
  /** Gets the display text for the Uniform Resource Identifier (URI) that starts an instant message. */
  var displayText: String
  /** Gets the Uniform Resource Identifier (URI) that can start an instant message. */
  var launchUri: Uri
  /** Gets the name of the field. */
  var name: String
  /** Gets the name of the service used for sending instant messages. */
  var service: String
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType
  /** Gets the user's name. */
  var userName: String
  /** Gets the value of the contact data. */
  var value: String
}

object ContactInstantMessageField {
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
  ): ContactInstantMessageField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], displayText = displayText.asInstanceOf[js.Any], launchUri = launchUri.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInstantMessageField]
  }
}

