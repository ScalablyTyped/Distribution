package typings.winrt.Windows.ApplicationModel.Contacts.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactRemovedEventArgs extends IContactRemovedEventArgs
object ContactRemovedEventArgs {
  
  @scala.inline
  def apply(id: String): ContactRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactRemovedEventArgs]
  }
}
