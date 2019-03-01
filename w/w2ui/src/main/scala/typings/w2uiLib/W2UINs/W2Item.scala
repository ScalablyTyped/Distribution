package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Primitives (first alphabetically, then by documentation order) */
trait W2Item extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var img: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[W2Item]] = js.undefined
  var onClick: js.UndefOr[js.Function] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object W2Item {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    group: java.lang.String = null,
    id: java.lang.String = null,
    img: java.lang.String = null,
    items: js.Array[W2Item] = null,
    onClick: js.Function = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
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

