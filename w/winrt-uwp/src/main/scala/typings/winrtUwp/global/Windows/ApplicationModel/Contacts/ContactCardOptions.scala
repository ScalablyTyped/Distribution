package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data about how to display a mini contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardOptions")
@js.native
/** Initializes a new instance of the ContactCardOptions class. */
class ContactCardOptions ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardOptions {
  
  /** Gets or sets a value that specifies the type of header to display on the contact card. */
  /* CompleteClass */
  var headerKind: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardHeaderKind = js.native
  
  /** Gets or sets a value that indicates which tab to display first on a mini contact card. */
  /* CompleteClass */
  var initialTabKind: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardTabKind = js.native
  
  /** Gets a list to which you can add ContactList.Id values to search for on the server. */
  /* CompleteClass */
  var serverSearchContactListIds: IVector[String] = js.native
}
