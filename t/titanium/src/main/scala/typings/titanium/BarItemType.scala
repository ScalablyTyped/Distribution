package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object describing a button bar or tabbed bar item.
  */
trait BarItemType extends js.Object {
  /**
    * A succint label associated with the bar item for the device's accessibility service.
    */
  var accessibilityLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the button is enabled initially.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Button icon. If specified, takes precedence over `title`.
    */
  var image: js.UndefOr[java.lang.String | Blob | File] = js.undefined
  /**
    * Button title, used if no `image` is specified.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width for this button.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object BarItemType {
  @scala.inline
  def apply(
    accessibilityLabel: java.lang.String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    image: java.lang.String | Blob | File = null,
    title: java.lang.String = null,
    width: js.UndefOr[Double] = js.undefined
  ): BarItemType = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarItemType]
  }
}

