package typings.winrt.Windows.ApplicationModel.Contacts.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.added
import typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.alreadyAdded
import typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddContactResult extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
@js.native
object AddContactResult extends js.Object {
  @js.native
  sealed trait added extends AddContactResult
  
  @js.native
  sealed trait alreadyAdded extends AddContactResult
  
  @js.native
  sealed trait unavailable extends AddContactResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddContactResult with Double] = js.native
  /* 0 */ @js.native
  object added extends TopLevel[added with Double]
  
  /* 1 */ @js.native
  object alreadyAdded extends TopLevel[alreadyAdded with Double]
  
  /* 2 */ @js.native
  object unavailable extends TopLevel[unavailable with Double]
  
}

