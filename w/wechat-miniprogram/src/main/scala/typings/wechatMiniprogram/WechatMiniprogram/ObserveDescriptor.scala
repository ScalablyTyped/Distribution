package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** media query 描述符 */
@js.native
trait ObserveDescriptor extends js.Object {
  /** 页面高度（ px 为单位） */
  var height: Double = js.native
  /** 页面最大高度（ px 为单位） */
  var maxHeight: Double = js.native
  /** 页面最大宽度（ px 为单位） */
  var maxWidth: Double = js.native
  /** 页面最小高度（ px 为单位） */
  var minHeight: Double = js.native
  /** 页面最小宽度（ px 为单位） */
  var minWidth: Double = js.native
  /** 屏幕方向（ `landscape` 或 `portrait` ） */
  var orientation: String = js.native
  /** 页面宽度（ px 为单位） */
  var width: Double = js.native
}

object ObserveDescriptor {
  @scala.inline
  def apply(
    height: Double,
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double,
    orientation: String,
    width: Double
  ): ObserveDescriptor = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveDescriptor]
  }
  @scala.inline
  implicit class ObserveDescriptorOps[Self <: ObserveDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

