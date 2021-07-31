package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailQuerySearchFields extends StObject
/** Defines the field(s) by which to search a collection of email messages. Use the OR operator to combine these values together into a single bit field. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySearchFields")
@js.native
object EmailQuerySearchFields extends StObject {
  
  /** Search by all searchable fields. */
  @js.native
  sealed trait all
    extends StObject
       with EmailQuerySearchFields
  
  /** No search field defined. */
  @js.native
  sealed trait none
    extends StObject
       with EmailQuerySearchFields
  
  /** Search by preview text field. */
  @js.native
  sealed trait preview
    extends StObject
       with EmailQuerySearchFields
  
  /** Search by members of the recipient list. */
  @js.native
  sealed trait recipients
    extends StObject
       with EmailQuerySearchFields
  
  /** Search by sender field. */
  @js.native
  sealed trait sender
    extends StObject
       with EmailQuerySearchFields
  
  /** Search by subject field. */
  @js.native
  sealed trait subject
    extends StObject
       with EmailQuerySearchFields
}
