package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactListOtherAppWriteAccess extends js.Object

/** Specifies the level of contact write access granted to other apps. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListOtherAppWriteAccess")
@js.native
object ContactListOtherAppWriteAccess extends js.Object {
  /** No write access is granted. */
  @js.native
  sealed trait none extends ContactListOtherAppWriteAccess
  
  /** Other apps can only write system contacts. */
  @js.native
  sealed trait systemOnly extends ContactListOtherAppWriteAccess
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactListOtherAppWriteAccess with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object systemOnly extends TopLevel[systemOnly with Double]
  
}

