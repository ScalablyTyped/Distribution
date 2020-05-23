package typings.through.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoDestroy extends js.Object {
  var autoDestroy: Boolean
}

object AutoDestroy {
  @scala.inline
  def apply(autoDestroy: Boolean): AutoDestroy = {
    val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDestroy]
  }
}

