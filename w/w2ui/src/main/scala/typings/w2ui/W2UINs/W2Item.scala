package typings.w2ui.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Primitives (first alphabetically, then by documentation order) */
trait W2Item extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var img: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[W2Item]] = js.undefined
  var onClick: js.UndefOr[js.Function] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object W2Item {
  @scala.inline
  def apply(
    caption: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    id: String = null,
    img: String = null,
    items: js.Array[W2Item] = null,
    onClick: js.Function = null,
    text: String = null,
    `type`: String = null
  ): W2Item = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (group != null) __obj.updateDynamic("group")(group)
    if (id != null) __obj.updateDynamic("id")(id)
    if (img != null) __obj.updateDynamic("img")(img)
    if (items != null) __obj.updateDynamic("items")(items)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[W2Item]
  }
}

