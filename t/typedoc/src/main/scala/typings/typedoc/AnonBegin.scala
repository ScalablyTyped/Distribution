package typings.typedoc

import typings.typedoc.serializationEventsMod.SerializeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBegin extends js.Object {
  var begin: js.UndefOr[SerializeEventData] = js.undefined
  var end: js.UndefOr[SerializeEventData] = js.undefined
}

object AnonBegin {
  @scala.inline
  def apply(begin: SerializeEventData = null, end: SerializeEventData = null): AnonBegin = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBegin]
  }
}

