package typings.winrtDashUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountState extends js.Object

/** Describes the state of a WebAccount object. */
@JSGlobal("Windows.Security.Credentials.WebAccountState")
@js.native
object WebAccountState extends js.Object {
  /** The account is connected. */
  @js.native
  sealed trait connected extends WebAccountState
  
  /** The account was unable to connect. */
  @js.native
  sealed trait error extends WebAccountState
  
  /** The account is currently not connected. */
  @js.native
  sealed trait none extends WebAccountState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountState with Double] = js.native
  /* 1 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 2 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

