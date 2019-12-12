package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactDateKind.anniversary
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactDateKind.birthday
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactDateKind.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactDateKind extends js.Object

/** Specifies the kinds of important dates for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactDateKind")
@js.native
object ContactDateKind extends js.Object {
  /** The anniversary of the contact. */
  @js.native
  sealed trait anniversary extends ContactDateKind
  
  /** The birthday of the contact. */
  @js.native
  sealed trait birthday extends ContactDateKind
  
  /** An important date of the contact other than birthday or anniversary. */
  @js.native
  sealed trait other extends ContactDateKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactDateKind with Double] = js.native
  /* 1 */ @js.native
  object anniversary extends TopLevel[anniversary with Double]
  
  /* 0 */ @js.native
  object birthday extends TopLevel[birthday with Double]
  
  /* 2 */ @js.native
  object other extends TopLevel[other with Double]
  
}

