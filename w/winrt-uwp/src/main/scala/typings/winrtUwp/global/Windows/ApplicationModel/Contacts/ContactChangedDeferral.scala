package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The deferral object to use while asynchronously processing ContactChanged events. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.ContactChangedDeferral")
@js.native
open class ContactChangedDeferral ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangedDeferral {
  
  /** Call this method in order to release the deferral object when all asynchronous processing has finished. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}
