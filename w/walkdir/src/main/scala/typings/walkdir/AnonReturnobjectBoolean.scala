package typings.walkdir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnobjectBoolean extends js.Object {
  var return_object: js.UndefOr[Boolean] = js.undefined
}

object AnonReturnobjectBoolean {
  @scala.inline
  def apply(return_object: js.UndefOr[Boolean] = js.undefined): AnonReturnobjectBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(return_object)) __obj.updateDynamic("return_object")(return_object.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReturnobjectBoolean]
  }
}

