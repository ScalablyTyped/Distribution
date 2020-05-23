package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies an advertising app that is no longer available. */
trait AllJoynServiceInfoRemovedEventArgs extends js.Object {
  /** The unique bus name of the advertising app that is no longer available. */
  var uniqueName: String
}

object AllJoynServiceInfoRemovedEventArgs {
  @scala.inline
  def apply(uniqueName: String): AllJoynServiceInfoRemovedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynServiceInfoRemovedEventArgs]
  }
}

