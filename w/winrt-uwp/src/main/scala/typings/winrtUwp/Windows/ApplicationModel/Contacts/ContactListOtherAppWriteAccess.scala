package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactListOtherAppWriteAccess extends js.Object

/** Specifies the level of contact write access granted to other apps. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListOtherAppWriteAccess")
@js.native
object ContactListOtherAppWriteAccess extends js.Object {
  /** No write access is granted. */
  @js.native
  sealed trait none extends ContactListOtherAppWriteAccess
  
  /** Other apps can only write system contacts. */
  @js.native
  sealed trait systemOnly extends ContactListOtherAppWriteAccess
  
}

