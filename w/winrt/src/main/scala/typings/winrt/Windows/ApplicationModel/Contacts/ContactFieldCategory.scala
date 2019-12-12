package typings.winrt.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.home
import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.mobile
import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.none
import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.other
import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.work
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldCategory with Double] = js.native
  /* 1 */ @js.native
  object home extends TopLevel[home with Double]
  
  /* 3 */ @js.native
  object mobile extends TopLevel[mobile with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 2 */ @js.native
  object work extends TopLevel[work with Double]
  
}

