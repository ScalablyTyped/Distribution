package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactEmailKind extends StObject
/** Specifies the kinds of email addresses for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactEmailKind")
@js.native
object ContactEmailKind extends StObject {
  
  /** An email address of the contact other than personal or work. */
  @js.native
  sealed trait other extends ContactEmailKind
  
  /** The personal email address of the contact. */
  @js.native
  sealed trait personal extends ContactEmailKind
  
  /** The work email address of the contact. */
  @js.native
  sealed trait work extends ContactEmailKind
}
