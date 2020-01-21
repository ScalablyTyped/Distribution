package typings.walkdir

import typings.walkdir.walkdirBooleans.`false`
import typings.walkdir.walkdirBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var return_object: js.UndefOr[`false`] = js.undefined
  var sync: `true`
}

object AnonFalse {
  @scala.inline
  def apply(sync: `true`, return_object: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    if (return_object != null) __obj.updateDynamic("return_object")(return_object.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

