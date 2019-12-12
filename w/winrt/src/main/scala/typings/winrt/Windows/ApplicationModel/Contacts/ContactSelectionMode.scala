package typings.winrt.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.contacts
import typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactSelectionMode extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.ContactSelectionMode")
@js.native
object ContactSelectionMode extends js.Object {
  @js.native
  sealed trait contacts extends ContactSelectionMode
  
  @js.native
  sealed trait fields extends ContactSelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactSelectionMode with Double] = js.native
  /* 0 */ @js.native
  object contacts extends TopLevel[contacts with Double]
  
  /* 1 */ @js.native
  object fields extends TopLevel[fields with Double]
  
}

