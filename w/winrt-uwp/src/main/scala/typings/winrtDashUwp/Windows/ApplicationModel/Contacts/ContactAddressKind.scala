package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAddressKind.home
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAddressKind.other
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAddressKind.work
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactAddressKind extends js.Object

/** Specifies the kinds of contact addresses. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAddressKind")
@js.native
object ContactAddressKind extends js.Object {
  /** The home address of the contact. */
  @js.native
  sealed trait home extends ContactAddressKind
  
  /** An address of the contact other than home or work. */
  @js.native
  sealed trait other extends ContactAddressKind
  
  /** The work address of the contact. */
  @js.native
  sealed trait work extends ContactAddressKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactAddressKind with Double] = js.native
  /* 0 */ @js.native
  object home extends TopLevel[home with Double]
  
  /* 2 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 1 */ @js.native
  object work extends TopLevel[work with Double]
  
}

