package typings.winrt.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldType with Double] = js.native
  /* 4 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 0 */ @js.native
  object email extends TopLevel[email with Double]
  
  /* 3 */ @js.native
  object instantMessage extends TopLevel[instantMessage with Double]
  
  /* 2 */ @js.native
  object location extends TopLevel[location with Double]
  
  /* 1 */ @js.native
  object phoneNumber extends TopLevel[phoneNumber with Double]
  
}

