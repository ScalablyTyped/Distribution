package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ServiceKindSupportedChanged event. */
trait RcsServiceKindSupportedChangedEventArgs extends js.Object {
  /** Gets the type of the Rich Communication Services (RCS) service. */
  var serviceKind: RcsServiceKind
}

object RcsServiceKindSupportedChangedEventArgs {
  @scala.inline
  def apply(serviceKind: RcsServiceKind): RcsServiceKindSupportedChangedEventArgs = {
    val __obj = js.Dynamic.literal(serviceKind = serviceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsServiceKindSupportedChangedEventArgs]
  }
}

