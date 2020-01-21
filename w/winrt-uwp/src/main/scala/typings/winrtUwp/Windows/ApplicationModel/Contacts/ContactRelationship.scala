package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactRelationship with Double] = js.native
  /* 5 */ @js.native
  object child extends TopLevel[child with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 4 */ @js.native
  object parent extends TopLevel[parent with Double]
  
  /* 2 */ @js.native
  object partner extends TopLevel[partner with Double]
  
  /* 3 */ @js.native
  object sibling extends TopLevel[sibling with Double]
  
  /* 1 */ @js.native
  object spouse extends TopLevel[spouse with Double]
  
}

