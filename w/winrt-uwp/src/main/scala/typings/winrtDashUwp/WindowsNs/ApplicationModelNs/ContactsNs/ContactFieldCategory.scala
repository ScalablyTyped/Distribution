package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait home extends ContactFieldCategory
  
  /** The Mobile category. */
  @js.native
  sealed trait mobile extends ContactFieldCategory
  
  /** The data doesn't belong to a category */
  @js.native
  sealed trait none extends ContactFieldCategory
  
  /** The Other category. */
  @js.native
  sealed trait other extends ContactFieldCategory
  
  /** The Work category. */
  @js.native
  sealed trait work extends ContactFieldCategory
  
  /* 1 */ val home: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory.home with Double = js.native
  /* 3 */ val mobile: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory.mobile with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory.none with Double = js.native
  /* 4 */ val other: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory.other with Double = js.native
  /* 2 */ val work: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldCategory.work with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldCategory with Double] = js.native
}

