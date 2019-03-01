package typings
package typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var action: java.lang.String
}

object Event {
  @scala.inline
  def apply(action: java.lang.String): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[Event]
  }
}

