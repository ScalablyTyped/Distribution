package typings.winrtUwp.Windows.ApplicationModel.Contacts

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
  
}

