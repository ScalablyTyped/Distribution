package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOptions extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var legalNodes: js.Array[String]
  var name: String
  var text: js.UndefOr[String] = js.undefined
  var topLevel: js.UndefOr[Boolean] = js.undefined
}

object NodeOptions {
  @scala.inline
  def apply(
    legalNodes: js.Array[String],
    name: String,
    attributes: js.Any = null,
    text: String = null,
    topLevel: js.UndefOr[Boolean] = js.undefined
  ): NodeOptions = {
    val __obj = js.Dynamic.literal(legalNodes = legalNodes, name = name)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(topLevel)) __obj.updateDynamic("topLevel")(topLevel)
    __obj.asInstanceOf[NodeOptions]
  }
}

