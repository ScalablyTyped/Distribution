package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactAnnotationOperations extends js.Object
/** Specifies the types of operations you can perform with a Contact . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationOperations")
@js.native
object ContactAnnotationOperations extends js.Object {
  
  /** Make and audio call. */
  @js.native
  sealed trait audioCall extends ContactAnnotationOperations
  
  /** Get the contact profile. */
  @js.native
  sealed trait contactProfile extends ContactAnnotationOperations
  
  /** Send an SMS/MMS message. */
  @js.native
  sealed trait message extends ContactAnnotationOperations
  
  /** None */
  @js.native
  sealed trait none extends ContactAnnotationOperations
  
  /** Access social media feeds. */
  @js.native
  sealed trait socialFeeds extends ContactAnnotationOperations
  
  /** Make a video call. */
  @js.native
  sealed trait videoCall extends ContactAnnotationOperations
}
