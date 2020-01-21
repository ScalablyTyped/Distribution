package typings.walkdir

import typings.walkdir.walkdirBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalseReturnobject extends js.Object {
  var return_object: js.UndefOr[`false`] = js.undefined
}

object AnonFalseReturnobject {
  @scala.inline
  def apply(return_object: `false` = null): AnonFalseReturnobject = {
    val __obj = js.Dynamic.literal()
    if (return_object != null) __obj.updateDynamic("return_object")(return_object.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalseReturnobject]
  }
}

