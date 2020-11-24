package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactRelationship extends js.Object
/** Defines a value that indicates the nature of a contact relationship, such as spouse, partner, sibling, parent and so on. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactRelationship")
@js.native
object ContactRelationship extends js.Object {
  
  /** Child */
  @js.native
  sealed trait child extends ContactRelationship
  
  /** Other */
  @js.native
  sealed trait other extends ContactRelationship
  
  /** Parent */
  @js.native
  sealed trait parent extends ContactRelationship
  
  /** Partner */
  @js.native
  sealed trait partner extends ContactRelationship
  
  /** Sibling */
  @js.native
  sealed trait sibling extends ContactRelationship
  
  /** Spouse */
  @js.native
  sealed trait spouse extends ContactRelationship
}
