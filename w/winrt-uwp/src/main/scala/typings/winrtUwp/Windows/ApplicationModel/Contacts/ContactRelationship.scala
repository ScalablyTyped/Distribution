package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactRelationship extends StObject
/** Defines a value that indicates the nature of a contact relationship, such as spouse, partner, sibling, parent and so on. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactRelationship")
@js.native
object ContactRelationship extends StObject {
  
  /** Child */
  @js.native
  sealed trait child
    extends StObject
       with ContactRelationship
  
  /** Other */
  @js.native
  sealed trait other
    extends StObject
       with ContactRelationship
  
  /** Parent */
  @js.native
  sealed trait parent
    extends StObject
       with ContactRelationship
  
  /** Partner */
  @js.native
  sealed trait partner
    extends StObject
       with ContactRelationship
  
  /** Sibling */
  @js.native
  sealed trait sibling
    extends StObject
       with ContactRelationship
  
  /** Spouse */
  @js.native
  sealed trait spouse
    extends StObject
       with ContactRelationship
}
