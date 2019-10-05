package typings.winrtDashUwp.Windows.Security.Authentication.Web.Provider

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
  
  /* 1 */ val idAndProperties: typings.winrtDashUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idAndProperties with Double = js.native
  /* 0 */ val idOnly: typings.winrtDashUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountClientViewType with Double] = js.native
}

