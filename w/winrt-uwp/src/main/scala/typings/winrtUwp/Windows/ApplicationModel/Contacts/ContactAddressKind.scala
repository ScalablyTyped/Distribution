package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactAddressKind extends StObject
/** Specifies the kinds of contact addresses. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAddressKind")
@js.native
object ContactAddressKind extends StObject {
  
  /** The home address of the contact. */
  @js.native
  sealed trait home
    extends StObject
       with ContactAddressKind
  
  /** An address of the contact other than home or work. */
  @js.native
  sealed trait other
    extends StObject
       with ContactAddressKind
  
  /** The work address of the contact. */
  @js.native
  sealed trait work
    extends StObject
       with ContactAddressKind
}
