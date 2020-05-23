package typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddContactResult extends js.Object

/** Indicates whether a contact was added successfully. */
@JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
@js.native
object AddContactResult extends js.Object {
  /** The contact was added. */
  @js.native
  sealed trait added extends AddContactResult
  
  /** The contact was already selected by the user. */
  @js.native
  sealed trait alreadyAdded extends AddContactResult
  
  /** The contact was unavailable and was not added. */
  @js.native
  sealed trait unavailable extends AddContactResult
  
}

