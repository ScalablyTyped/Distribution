package typings.through

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoDestroy extends js.Object {
  var autoDestroy: Boolean
}

object AnonAutoDestroy {
  @scala.inline
  def apply(autoDestroy: Boolean): AnonAutoDestroy = {
    val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutoDestroy]
  }
}

