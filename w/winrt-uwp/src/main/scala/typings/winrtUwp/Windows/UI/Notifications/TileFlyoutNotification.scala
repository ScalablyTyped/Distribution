package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileFlyoutNotification extends js.Object {
  var content: js.Any
   /* unmapped type */ var expirationTime: js.Any
}

object TileFlyoutNotification {
  @scala.inline
  def apply(content: js.Any, expirationTime: js.Any): TileFlyoutNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileFlyoutNotification]
  }
}

