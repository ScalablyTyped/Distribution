package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a Web site for a contact. */
trait ContactWebsite extends js.Object {
  /** Gets and sets the description of a Web site for a contact. The maximum string length for the description is 512 characters. */
  var description: String
  var rawValue: js.Any
   /* unmapped type */ /** Gets and sets the Uniform Resource Identifier (URI) of a Web site for a contact. */
  var uri: Uri
}

object ContactWebsite {
  @scala.inline
  def apply(description: String, rawValue: js.Any, uri: Uri): ContactWebsite = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactWebsite]
  }
}

