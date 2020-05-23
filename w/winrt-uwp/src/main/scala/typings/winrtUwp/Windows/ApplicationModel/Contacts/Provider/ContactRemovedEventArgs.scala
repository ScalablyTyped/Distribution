package typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info about a removed contact. Returned when a ContactRemoved event occurs. */
trait ContactRemovedEventArgs extends js.Object {
  /** Contains a unique identifier for the contact. */
  var id: String
}

object ContactRemovedEventArgs {
  @scala.inline
  def apply(id: String): ContactRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactRemovedEventArgs]
  }
}

