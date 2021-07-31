package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines which fields must exist on a contact in order to match a search operation. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryDesiredFields")
@js.native
object ContactQueryDesiredFields extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields & Double
  ] = js.native
  
  /* 2 */ val emailAddress: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.emailAddress & Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.none & Double = js.native
  
  /* 1 */ val phoneNumber: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.phoneNumber & Double = js.native
  
  /* 3 */ val postalAddress: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.postalAddress & Double = js.native
}
