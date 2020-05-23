package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a template that can be used to create new EmailIrmInfo objects. */
trait EmailIrmTemplate extends js.Object {
  /** Gets or sets the description of the template. */
  var description: String
  /** Gets or sets the ID for the template. */
  var id: String
  /** Gets or sets the name for the template. */
  var name: String
}

object EmailIrmTemplate {
  @scala.inline
  def apply(description: String, id: String, name: String): EmailIrmTemplate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIrmTemplate]
  }
}

