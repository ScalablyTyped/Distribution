package typings.winrt.Windows.ApplicationModel.Contacts.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactRemovedEventArgs extends js.Object {
  var id: String
}

object IContactRemovedEventArgs {
  @scala.inline
  def apply(id: String): IContactRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactRemovedEventArgs]
  }
}

