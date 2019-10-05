package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ServiceKindSupportedChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsServiceKindSupportedChangedEventArgs")
@js.native
abstract class RcsServiceKindSupportedChangedEventArgs () extends js.Object {
  /** Gets the type of the Rich Communication Services (RCS) service. */
  var serviceKind: RcsServiceKind = js.native
}

