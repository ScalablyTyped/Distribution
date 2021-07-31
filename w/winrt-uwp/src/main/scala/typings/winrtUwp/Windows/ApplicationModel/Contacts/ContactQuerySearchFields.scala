package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactQuerySearchFields extends StObject
/** Defines which contact fields to search for a text match. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQuerySearchFields")
@js.native
object ContactQuerySearchFields extends StObject {
  
  /** All */
  @js.native
  sealed trait all
    extends StObject
       with ContactQuerySearchFields
  
  /** Email address */
  @js.native
  sealed trait email
    extends StObject
       with ContactQuerySearchFields
  
  /** Name */
  @js.native
  sealed trait name
    extends StObject
       with ContactQuerySearchFields
  
  /** None */
  @js.native
  sealed trait none
    extends StObject
       with ContactQuerySearchFields
  
  /** Phone number */
  @js.native
  sealed trait phone
    extends StObject
       with ContactQuerySearchFields
}
