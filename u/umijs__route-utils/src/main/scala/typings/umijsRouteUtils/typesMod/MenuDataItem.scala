package typings.umijsRouteUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.umijsRouteUtils.umijsRouteUtilsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuDataItem
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
  var hideInMenu: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String | `false`] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object MenuDataItem {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: js.Array[MenuDataItem] = null,
    hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined,
    hideInMenu: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode = null,
    key: String = null,
    locale: String | `false` = null,
    name: String = null,
    parentKeys: js.Array[String] = null,
    path: String = null
  ): MenuDataItem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(hideChildrenInMenu)) __obj.updateDynamic("hideChildrenInMenu")(hideChildrenInMenu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInMenu)) __obj.updateDynamic("hideInMenu")(hideInMenu.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentKeys != null) __obj.updateDynamic("parentKeys")(parentKeys.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuDataItem]
  }
}

