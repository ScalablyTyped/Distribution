package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactStoreAccessType extends js.Object

/** Defines the type of access the app has to the ContactStore . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactStoreAccessType")
@js.native
object ContactStoreAccessType extends js.Object {
  /** Read access to all app and system contacts. This value requires the contacts capability. See App capability declarations for more information. */
  @js.native
  sealed trait allContactsReadOnly extends ContactStoreAccessType
  
  /** Read and write access to all app and system contacts. This value is not available to all apps. Your developer account must be specially provisioned by Microsoft in order to request this level of access. */
  @js.native
  sealed trait allContactsReadWrite extends ContactStoreAccessType
  
  /** Read and write contacts that belong to the app only. */
  @js.native
  sealed trait appContactsReadWrite extends ContactStoreAccessType
  
  /* 1 */ val allContactsReadOnly: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactStoreAccessType.allContactsReadOnly with Double = js.native
  /* 2 */ val allContactsReadWrite: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactStoreAccessType.allContactsReadWrite with Double = js.native
  /* 0 */ val appContactsReadWrite: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactStoreAccessType.appContactsReadWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactStoreAccessType with Double] = js.native
}

