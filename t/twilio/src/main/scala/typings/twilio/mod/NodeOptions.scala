package typings.twilio.mod

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
    val __obj = js.Dynamic.literal(legalNodes = legalNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(topLevel)) __obj.updateDynamic("topLevel")(topLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
}

