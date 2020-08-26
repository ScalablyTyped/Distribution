package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object describing a button bar or tabbed bar item.
  */
@js.native
trait BarItemType extends js.Object {
  /**
    * A succint label associated with the bar item for the device's accessibility service.
    */
  var accessibilityLabel: js.UndefOr[java.lang.String] = js.native
  /**
    * Whether the button is enabled initially.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Button icon. If specified, takes precedence over `title`.
    */
  var image: js.UndefOr[java.lang.String | Blob | File] = js.native
  /**
    * Button title, used if no `image` is specified.
    */
  var title: js.UndefOr[java.lang.String] = js.native
  /**
    * Width for this button.
    */
  var width: js.UndefOr[Double] = js.native
}

object BarItemType {
  @scala.inline
  def apply(): BarItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarItemType]
  }
  @scala.inline
  implicit class BarItemTypeOps[Self <: BarItemType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessibilityLabel(value: java.lang.String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setImage(value: java.lang.String | Blob | File): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

