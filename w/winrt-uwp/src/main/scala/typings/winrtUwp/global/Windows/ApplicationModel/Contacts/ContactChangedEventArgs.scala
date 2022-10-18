package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ContactChanged event. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.ContactChangedEventArgs")
@js.native
open class ContactChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangedEventArgs {
  
  /**
    * Gets the ContactChangedDeferral object to use for asynchronous operations.
    * @return The deferral object to use for asynchronous operations.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangedDeferral = js.native
}
