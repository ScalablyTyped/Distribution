package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountSelectionOptions extends js.Object

/** Represents web account selection options. Use this to support the use of multiple web accounts in an app, where user might choose to log in with an existing account or add a new account. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions")
@js.native
object WebAccountSelectionOptions extends js.Object {
  /** The user selected the default account. */
  @js.native
  sealed trait default extends WebAccountSelectionOptions
  
  /** The user selected to add a new account. */
  @js.native
  sealed trait `new` extends WebAccountSelectionOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountSelectionOptions with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object `new` extends TopLevel[`new` with Double]
  
}

