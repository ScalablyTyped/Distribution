package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait child
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactRelationship
  
  /** Other */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactRelationship
  
  /** Parent */
  @js.native
  sealed trait parent
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactRelationship
  
  /** Partner */
  @js.native
  sealed trait partner
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactRelationship
  
  /** Sibling */
  @js.native
  sealed trait sibling
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactRelationship
  
  /** Spouse */
  @js.native
  sealed trait spouse
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactRelationship
  
  /* 5 */ val child: child with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  /* 4 */ val parent: parent with scala.Double = js.native
  /* 2 */ val partner: partner with scala.Double = js.native
  /* 3 */ val sibling: sibling with scala.Double = js.native
  /* 1 */ val spouse: spouse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactRelationship with scala.Double
  ] = js.native
}

