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
  
  val child: child with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val parent: parent with java.lang.String = js.native
  val partner: partner with java.lang.String = js.native
  val sibling: sibling with java.lang.String = js.native
  val spouse: spouse with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactRelationship with java.lang.String
  ] = js.native
}

