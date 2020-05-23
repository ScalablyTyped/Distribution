package typings.ts3NodejsLibrary.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveEvent extends js.Object {
  var event: String
  var id: js.UndefOr[Double] = js.undefined
}

object ActiveEvent {
  @scala.inline
  def apply(event: String, id: js.UndefOr[Double] = js.undefined): ActiveEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveEvent]
  }
}

