package typings.winrt.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactFieldType extends StObject
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldType")
@js.native
object ContactFieldType extends StObject {
  
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
