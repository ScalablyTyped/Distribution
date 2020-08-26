package typings.uniApp

import typings.uniApp.uniAppStrings.absolute
import typings.uniApp.uniAppStrings.bottom
import typings.uniApp.uniAppStrings.dock
import typings.uniApp.uniAppStrings.left
import typings.uniApp.uniAppStrings.navigationBar
import typings.uniApp.uniAppStrings.popup
import typings.uniApp.uniAppStrings.right
import typings.uniApp.uniAppStrings.static
import typings.uniApp.uniAppStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubNVuesSetStyleOptions extends js.Object {
  /**
    * 原生子窗体垂直向上的偏移量
    */
  var bottom: js.UndefOr[String] = js.native
  /**
    * 原生子窗体的停靠方式,仅当原生子窗体 "position" 属性值设置为 "dock" 时才生效
    * - top: 原生子窗体停靠则页面顶部
    * - bottom: 原生子窗体停靠在页面底部
    * - left: 原生子窗体停靠在页面左侧
    * - right: 原生子窗体停靠在页面右侧
    */
  var dock: js.UndefOr[top | bottom | left | right] = js.native
  /**
    * 原生子窗体的高度
    */
  var height: js.UndefOr[String] = js.native
  /**
    * 原生子窗体水平向左的偏移量
    */
  var left: js.UndefOr[String] = js.native
  /**
    * 原生子窗体的边距
    */
  var margin: js.UndefOr[String] = js.native
  /**
    * 原生子窗体的遮罩层,仅当原生子窗体 "type" 属性值设置为 "popup" 时才生效
    * - popup: 弹出层
    * - navigationBar: 导航栏
    */
  var mask: js.UndefOr[popup | navigationBar] = js.native
  /**
    * 原生子窗体的排版位置
    * - static: 原生子窗体在页面中正常定位
    * - absolute: 原生子窗体在页面中绝对定位
    * - dock: 原生子窗体在页面中停靠
    */
  var position: js.UndefOr[static | absolute | dock] = js.native
  /**
    * 原生子窗体水平向右的偏移量
    */
  var right: js.UndefOr[String] = js.native
  /**
    * 原生子窗体垂直向下的偏移量
    */
  var top: js.UndefOr[String] = js.native
  /**
    * 原生子窗体的内置样式
    * - popup: 弹出层
    * - navigationBar: 导航栏
    */
  var `type`: js.UndefOr[popup | navigationBar] = js.native
  /**
    * 原生子窗体的宽度
    */
  var width: js.UndefOr[String] = js.native
}

object SubNVuesSetStyleOptions {
  @scala.inline
  def apply(): SubNVuesSetStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubNVuesSetStyleOptions]
  }
  @scala.inline
  implicit class SubNVuesSetStyleOptionsOps[Self <: SubNVuesSetStyleOptions] (val x: Self) extends AnyVal {
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setDock(value: top | bottom | left | right): Self = this.set("dock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDock: Self = this.set("dock", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMargin(value: String): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMask(value: popup | navigationBar): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setPosition(value: static | absolute | dock): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setType(value: popup | navigationBar): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

