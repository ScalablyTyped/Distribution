package typings.twilioDashSync.libInterfacesServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  var connectionState: js.Any
  def updateToken(token: String): js.Promise[Notifications]
}

object Notifications {
  @scala.inline
  def apply(connectionState: js.Any, updateToken: String => js.Promise[Notifications]): Notifications = {
    val __obj = js.Dynamic.literal(connectionState = connectionState.asInstanceOf[js.Any], updateToken = js.Any.fromFunction1(updateToken))
  
    __obj.asInstanceOf[Notifications]
  }
}

