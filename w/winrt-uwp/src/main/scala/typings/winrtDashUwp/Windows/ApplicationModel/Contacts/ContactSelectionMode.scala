package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactSelectionMode extends js.Object

/** Specifies whether you want to request an entire contact, or only specific fields. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactSelectionMode")
@js.native
object ContactSelectionMode extends js.Object {
  /** Specifies that you want to select the entire contact. */
  @js.native
  sealed trait contacts extends ContactSelectionMode
  
  /** Specifies that you want to select only certain fields. */
  @js.native
  sealed trait fields extends ContactSelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactSelectionMode with Double] = js.native
  /* 0 */ @js.native
  object contacts extends TopLevel[contacts with Double]
  
  /* 1 */ @js.native
  object fields extends TopLevel[fields with Double]
  
}

