package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactCardHeaderKind extends js.Object

/** Specifies the type of header information to show on a contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardHeaderKind")
@js.native
object ContactCardHeaderKind extends js.Object {
  /** Display a basic header. */
  @js.native
  sealed trait basic extends ContactCardHeaderKind
  
  /** Display the default header. */
  @js.native
  sealed trait default extends ContactCardHeaderKind
  
  /** Display an enterprise header. */
  @js.native
  sealed trait enterprise extends ContactCardHeaderKind
  
}

