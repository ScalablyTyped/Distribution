package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactDateKind extends StObject
/** Specifies the kinds of important dates for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactDateKind")
@js.native
object ContactDateKind extends StObject {
  
  /** The anniversary of the contact. */
  @js.native
  sealed trait anniversary
    extends StObject
       with ContactDateKind
  
  /** The birthday of the contact. */
  @js.native
  sealed trait birthday
    extends StObject
       with ContactDateKind
  
  /** An important date of the contact other than birthday or anniversary. */
  @js.native
  sealed trait other
    extends StObject
       with ContactDateKind
}
