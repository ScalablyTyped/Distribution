package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
