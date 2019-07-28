package typings.wpapi.wpapiMod

import typings.wpapi.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPArgument extends js.Object {
  var default: js.UndefOr[String | Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var enum: js.UndefOr[js.Array[String]] = js.undefined
  var items: js.UndefOr[Anon_Type] = js.undefined
  var required: Boolean
  var `type`: js.UndefOr[HTTPArgumentType] = js.undefined
}

object HTTPArgument {
  @scala.inline
  def apply(
    required: Boolean,
    default: String | Double = null,
    description: String = null,
    enum: js.Array[String] = null,
    items: Anon_Type = null,
    `type`: HTTPArgumentType = null
  ): HTTPArgument = {
    val __obj = js.Dynamic.literal(required = required)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (items != null) __obj.updateDynamic("items")(items)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HTTPArgument]
  }
}

