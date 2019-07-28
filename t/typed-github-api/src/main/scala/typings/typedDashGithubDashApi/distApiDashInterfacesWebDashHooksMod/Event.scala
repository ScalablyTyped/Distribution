package typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var action: String
}

object Event {
  @scala.inline
  def apply(action: String): Event = {
    val __obj = js.Dynamic.literal(action = action)
  
    __obj.asInstanceOf[Event]
  }
}

