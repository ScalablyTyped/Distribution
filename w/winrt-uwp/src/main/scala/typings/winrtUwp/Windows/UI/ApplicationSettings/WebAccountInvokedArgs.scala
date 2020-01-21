package typings.winrtUwp.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the WebAccountCommandInvokedHandler delegate. */
@JSGlobal("Windows.UI.ApplicationSettings.WebAccountInvokedArgs")
@js.native
abstract class WebAccountInvokedArgs () extends js.Object {
  /** Gets the action for the web account in the accounts pane. */
  var action: WebAccountAction = js.native
}

