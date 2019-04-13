package typings
package wpapiLib.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPArgument extends js.Object {
  var default: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var items: js.UndefOr[wpapiLib.Anon_Type] = js.undefined
  var required: scala.Boolean
  var `type`: js.UndefOr[HTTPArgumentType] = js.undefined
}

object HTTPArgument {
  @scala.inline
  def apply(
    required: scala.Boolean,
    default: java.lang.String | scala.Double = null,
    description: java.lang.String = null,
    enum: js.Array[java.lang.String] = null,
    items: wpapiLib.Anon_Type = null,
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

