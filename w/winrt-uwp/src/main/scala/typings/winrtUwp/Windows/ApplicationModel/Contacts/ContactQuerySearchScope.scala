package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactQuerySearchScope extends js.Object

/** Defines whether to search the local ContactStore or a server. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQuerySearchScope")
@js.native
object ContactQuerySearchScope extends js.Object {
  /** Local */
  @js.native
  sealed trait local extends ContactQuerySearchScope
  
  /** Server */
  @js.native
  sealed trait server extends ContactQuerySearchScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactQuerySearchScope with Double] = js.native
  /* 0 */ @js.native
  object local extends TopLevel[local with Double]
  
  /* 1 */ @js.native
  object server extends TopLevel[server with Double]
  
}

