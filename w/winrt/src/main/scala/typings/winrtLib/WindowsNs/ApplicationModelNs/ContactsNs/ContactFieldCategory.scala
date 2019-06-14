package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactFieldCategory extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
@js.native
object ContactFieldCategory extends js.Object {
  @js.native
  sealed trait home
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  @js.native
  sealed trait mobile
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  @js.native
  sealed trait other
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  @js.native
  sealed trait work
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory
  
  /* 1 */ val home: home with scala.Double = js.native
  /* 3 */ val mobile: mobile with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val other: other with scala.Double = js.native
  /* 2 */ val work: work with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory with scala.Double
  ] = js.native
}

