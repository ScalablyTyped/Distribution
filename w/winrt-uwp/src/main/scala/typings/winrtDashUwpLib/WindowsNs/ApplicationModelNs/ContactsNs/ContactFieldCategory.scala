package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactFieldCategory extends js.Object

/** Defines the categories that contact data can belong to. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
@js.native
object ContactFieldCategory extends js.Object {
  /** The Home category. */
  @js.native
  sealed trait home
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  /** The Mobile category. */
  @js.native
  sealed trait mobile
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  /** The data doesn't belong to a category */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  /** The Other category. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  /** The Work category. */
  @js.native
  sealed trait work
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  /* 1 */ val home: home with scala.Double = js.native
  /* 3 */ val mobile: mobile with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val other: other with scala.Double = js.native
  /* 2 */ val work: work with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory with scala.Double
  ] = js.native
}

