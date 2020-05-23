package typings.winrtUwp.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event data for the SystemNavigationManager.BackRequested event. */
trait BackRequestedEventArgs extends js.Object {
  /** Gets or sets a value that indicates whether the app performed the requested back-navigation. */
  var handled: Boolean
}

object BackRequestedEventArgs {
  @scala.inline
  def apply(handled: Boolean): BackRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackRequestedEventArgs]
  }
}

