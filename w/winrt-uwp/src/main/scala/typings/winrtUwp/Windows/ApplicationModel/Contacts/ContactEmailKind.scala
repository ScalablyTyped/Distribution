package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactEmailKind extends js.Object

/** Specifies the kinds of email addresses for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactEmailKind")
@js.native
object ContactEmailKind extends js.Object {
  /** An email address of the contact other than personal or work. */
  @js.native
  sealed trait other extends ContactEmailKind
  
  /** The personal email address of the contact. */
  @js.native
  sealed trait personal extends ContactEmailKind
  
  /** The work email address of the contact. */
  @js.native
  sealed trait work extends ContactEmailKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactEmailKind with Double] = js.native
  /* 2 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 0 */ @js.native
  object personal extends TopLevel[personal with Double]
  
  /* 1 */ @js.native
  object work extends TopLevel[work with Double]
  
}

