package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOptions extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var legalNodes: js.Array[java.lang.String]
  var name: java.lang.String
  var text: js.UndefOr[java.lang.String] = js.undefined
  var topLevel: js.UndefOr[scala.Boolean] = js.undefined
}

object NodeOptions {
  @scala.inline
  def apply(
    legalNodes: js.Array[java.lang.String],
    name: java.lang.String,
    attributes: js.Any = null,
    text: java.lang.String = null,
    topLevel: js.UndefOr[scala.Boolean] = js.undefined
  ): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("legalNodes")(legalNodes)
    __obj.updateDynamic("name")(name)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(topLevel)) __obj.updateDynamic("topLevel")(topLevel)
    __obj.asInstanceOf[NodeOptions]
  }
}

