package typings.w2ui.W2UI_

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
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[W2Item]
  }
}

