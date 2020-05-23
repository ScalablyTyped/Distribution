package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email recipient. */
trait EmailRecipient extends js.Object {
  /** Gets or sets the address of the email recipient. */
  var address: String
  /** Gets or sets the name of the email recipient. */
  var name: String
}

object EmailRecipient {
  @scala.inline
  def apply(address: String, name: String): EmailRecipient = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipient]
  }
}

