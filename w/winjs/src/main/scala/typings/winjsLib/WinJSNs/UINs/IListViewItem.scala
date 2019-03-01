package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by ListView's currentItem API
  **/
trait IListViewItem extends js.Object {
  /**
    * Gets or sets whether the ListView item is focused.
    **/
  var hasFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Gets or sets index of the ListView item.
    **/
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Gets or sets key of the ListView item.
    **/
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets or sets whether the ListView item is focused and is showing its focus visual.
    **/
  var showFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Gets the type, if any.
    **/
  var `type`: js.UndefOr[ObjectType] = js.undefined
}

object IListViewItem {
  @scala.inline
  def apply(
    hasFocus: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    showFocus: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: ObjectType = null
  ): IListViewItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasFocus)) __obj.updateDynamic("hasFocus")(hasFocus)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(showFocus)) __obj.updateDynamic("showFocus")(showFocus)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IListViewItem]
  }
}

