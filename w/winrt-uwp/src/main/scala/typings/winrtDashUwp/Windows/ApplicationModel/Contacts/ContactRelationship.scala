package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

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
  
  /* 5 */ val child: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactRelationship.child with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactRelationship.other with Double = js.native
  /* 4 */ val parent: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactRelationship.parent with Double = js.native
  /* 2 */ val partner: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactRelationship.partner with Double = js.native
  /* 3 */ val sibling: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactRelationship.sibling with Double = js.native
  /* 1 */ val spouse: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactRelationship.spouse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactRelationship with Double] = js.native
}

