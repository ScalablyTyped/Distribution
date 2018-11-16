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
  
  val home: home with java.lang.String = js.native
  val mobile: mobile with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val work: work with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory with java.lang.String
  ] = js.native
}

