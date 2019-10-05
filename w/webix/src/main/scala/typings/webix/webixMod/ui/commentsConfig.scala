package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.DataCollection
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait commentsConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var currentUser: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var listItem: js.UndefOr[js.Any] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var mentions: js.UndefOr[Boolean] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var moreButton: js.UndefOr[String | WebixCallback] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var scheme: js.UndefOr[js.Any] = js.undefined
  var sendAction: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var users: js.UndefOr[js.Array[_] | String | DataCollection] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object commentsConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    css: js.Any = null,
    currentUser: Int | Double = null,
    data: String | js.Array[_] = null,
    datatype: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    listItem: js.Any = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    mentions: js.UndefOr[Boolean] = js.undefined,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    mode: String = null,
    moreButton: String | WebixCallback = null,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    scheme: js.Any = null,
    sendAction: String = null,
    `type`: String = null,
    url: js.Any = null,
    users: js.Array[_] | String | DataCollection = null,
    view: String = null,
    width: Int | Double = null
  ): commentsConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (currentUser != null) __obj.updateDynamic("currentUser")(currentUser.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listItem != null) __obj.updateDynamic("listItem")(listItem)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(mentions)) __obj.updateDynamic("mentions")(mentions)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (moreButton != null) __obj.updateDynamic("moreButton")(moreButton.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (sendAction != null) __obj.updateDynamic("sendAction")(sendAction)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[commentsConfig]
  }
}

