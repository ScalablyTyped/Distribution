package typings.wpapi.mod

import typings.wpapi.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPArgument extends js.Object {
  var default: js.UndefOr[String | Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var enum: js.UndefOr[js.Array[String]] = js.undefined
  var items: js.UndefOr[Type] = js.undefined
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
    items: Type = null,
    `type`: HTTPArgumentType = null
  ): HTTPArgument = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPArgument]
  }
}

