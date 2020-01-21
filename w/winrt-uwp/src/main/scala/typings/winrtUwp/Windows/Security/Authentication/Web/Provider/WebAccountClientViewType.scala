package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountClientViewType extends js.Object

/** Represents the levels of information about a web account shown to the client. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountClientViewType")
@js.native
object WebAccountClientViewType extends js.Object {
  /** Shows the Id and properties. */
  @js.native
  sealed trait idAndProperties extends WebAccountClientViewType
  
  /** Shows only the Id. */
  @js.native
  sealed trait idOnly extends WebAccountClientViewType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountClientViewType with Double] = js.native
  /* 1 */ @js.native
  object idAndProperties extends TopLevel[idAndProperties with Double]
  
  /* 0 */ @js.native
  object idOnly extends TopLevel[idOnly with Double]
  
}

