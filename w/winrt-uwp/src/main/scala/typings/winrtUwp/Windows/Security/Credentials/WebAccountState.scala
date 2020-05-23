package typings.winrtUwp.Windows.Security.Credentials

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
  
}

