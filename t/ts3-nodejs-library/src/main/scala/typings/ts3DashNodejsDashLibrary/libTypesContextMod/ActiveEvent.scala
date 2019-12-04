package typings.ts3DashNodejsDashLibrary.libTypesContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveEvent extends js.Object {
  var event: String
  var id: js.UndefOr[Double] = js.undefined
}

object ActiveEvent {
  @scala.inline
  def apply(event: String, id: Int | Double = null): ActiveEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveEvent]
  }
}

