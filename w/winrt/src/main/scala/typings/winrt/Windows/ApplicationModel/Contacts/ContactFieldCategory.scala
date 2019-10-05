package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactFieldCategory extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
@js.native
object ContactFieldCategory extends js.Object {
  @js.native
  sealed trait home extends ContactFieldCategory
  
  @js.native
  sealed trait mobile extends ContactFieldCategory
  
  @js.native
  sealed trait none extends ContactFieldCategory
  
  @js.native
  sealed trait other extends ContactFieldCategory
  
  @js.native
  sealed trait work extends ContactFieldCategory
  
  /* 1 */ val home: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.home with Double = js.native
  /* 3 */ val mobile: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.mobile with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.none with Double = js.native
  /* 4 */ val other: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.other with Double = js.native
  /* 2 */ val work: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.work with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldCategory with Double] = js.native
}

