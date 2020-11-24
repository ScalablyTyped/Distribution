package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactAddressKind extends js.Object
/** Specifies the kinds of contact addresses. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAddressKind")
@js.native
object ContactAddressKind extends js.Object {
  
  /** The home address of the contact. */
  @js.native
  sealed trait home extends ContactAddressKind
  
  /** An address of the contact other than home or work. */
  @js.native
  sealed trait other extends ContactAddressKind
  
  /** The work address of the contact. */
  @js.native
  sealed trait work extends ContactAddressKind
}
