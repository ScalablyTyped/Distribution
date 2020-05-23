package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the type of access the app has to the ContactStore . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactStoreAccessType")
@js.native
object ContactStoreAccessType extends js.Object {
  /* 1 */ val allContactsReadOnly: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType.allContactsReadOnly with Double = js.native
  /* 2 */ val allContactsReadWrite: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType.allContactsReadWrite with Double = js.native
  /* 0 */ val appContactsReadWrite: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType.appContactsReadWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType with Double
  ] = js.native
}

