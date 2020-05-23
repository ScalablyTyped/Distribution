package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The deferral object to use while asynchronously processing ContactChanged events. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangedDeferral")
@js.native
abstract class ContactChangedDeferral ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangedDeferral {
  /** Call this method in order to release the deferral object when all asynchronous processing has finished. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

