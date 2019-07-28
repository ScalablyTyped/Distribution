package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactRemovedEventArgs extends js.Object {
  var id: String
}

object IContactRemovedEventArgs {
  @scala.inline
  def apply(id: String): IContactRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[IContactRemovedEventArgs]
  }
}

