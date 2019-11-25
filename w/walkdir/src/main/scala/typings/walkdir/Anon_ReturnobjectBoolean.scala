package typings.walkdir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnobjectBoolean extends js.Object {
  var return_object: js.UndefOr[Boolean] = js.undefined
}

object Anon_ReturnobjectBoolean {
  @scala.inline
  def apply(return_object: js.UndefOr[Boolean] = js.undefined): Anon_ReturnobjectBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(return_object)) __obj.updateDynamic("return_object")(return_object.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReturnobjectBoolean]
  }
}

