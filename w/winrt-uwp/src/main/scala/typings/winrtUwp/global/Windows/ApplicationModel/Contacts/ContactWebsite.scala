package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the info about a Web site for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactWebsite")
@js.native
/** Initializes a new instance of a ContactWebsite class. */
open class ContactWebsite ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactWebsite {
  
  /** Gets and sets the description of a Web site for a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  var description: String = js.native
  
  /* CompleteClass */
  var rawValue: Any = js.native
  
  /* unmapped type */
  /** Gets and sets the Uniform Resource Identifier (URI) of a Web site for a contact. */
  /* CompleteClass */
  var uri: Uri = js.native
}
