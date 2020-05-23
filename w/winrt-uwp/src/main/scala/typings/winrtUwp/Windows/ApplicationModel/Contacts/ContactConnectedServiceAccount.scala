package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connected service account for a contact. */
trait ContactConnectedServiceAccount extends js.Object {
  /** Gets and sets the identifier of a connected service account for a contact. The maximum string length for the identifier is 321 characters. */
  var id: String
  /** Gets and sets the service name of a connected service account for a contact. The maximum string length for the service name is 256 characters. */
  var serviceName: String
}

object ContactConnectedServiceAccount {
  @scala.inline
  def apply(id: String, serviceName: String): ContactConnectedServiceAccount = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactConnectedServiceAccount]
  }
}

