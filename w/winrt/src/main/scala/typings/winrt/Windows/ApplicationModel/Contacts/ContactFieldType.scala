package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactFieldType extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldType")
@js.native
object ContactFieldType extends js.Object {
  @js.native
  sealed trait custom extends ContactFieldType
  
  @js.native
  sealed trait email extends ContactFieldType
  
  @js.native
  sealed trait instantMessage extends ContactFieldType
  
  @js.native
  sealed trait location extends ContactFieldType
  
  @js.native
  sealed trait phoneNumber extends ContactFieldType
  
}

