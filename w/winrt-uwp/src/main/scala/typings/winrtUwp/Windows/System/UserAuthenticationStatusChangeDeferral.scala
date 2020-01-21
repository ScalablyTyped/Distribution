package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user authentication status change deferral returned by the UserAuthenticationStatusChangingEventArgs.GetDeferral method. */
@JSGlobal("Windows.System.UserAuthenticationStatusChangeDeferral")
@js.native
abstract class UserAuthenticationStatusChangeDeferral () extends js.Object {
  /** Reports that the application has completed its user authentication status change deferral. */
  def complete(): Unit = js.native
}

