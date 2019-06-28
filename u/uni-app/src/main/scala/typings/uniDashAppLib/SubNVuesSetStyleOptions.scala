package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubNVuesSetStyleOptions extends js.Object {
  /**
    * 原生子窗体垂直向上的偏移量
    */
  var bottom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 原生子窗体的停靠方式,仅当原生子窗体 "position" 属性值设置为 "dock" 时才生效
    * - top: 原生子窗体停靠则页面顶部
    * - bottom: 原生子窗体停靠在页面底部
    * - left: 原生子窗体停靠在页面左侧
    * - right: 原生子窗体停靠在页面右侧
    */
  var dock: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.top | uniDashAppLib.uniDashAppLibStrings.bottom | uniDashAppLib.uniDashAppLibStrings.left | uniDashAppLib.uniDashAppLibStrings.right
  ] = js.undefined
  /**
    * 原生子窗体的高度
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 原生子窗体水平向左的偏移量
    */
  var left: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 原生子窗体的边距
    */
  var margin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 原生子窗体的遮罩层,仅当原生子窗体 "type" 属性值设置为 "popup" 时才生效
    * - popup: 弹出层
    * - navigationBar: 导航栏
    */
  var mask: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.popup | uniDashAppLib.uniDashAppLibStrings.navigationBar
  ] = js.undefined
  /**
    * 原生子窗体的排版位置
    * - static: 原生子窗体在页面中正常定位
    * - absolute: 原生子窗体在页面中绝对定位
    * - dock: 原生子窗体在页面中停靠
    */
  var position: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.static | uniDashAppLib.uniDashAppLibStrings.absolute | uniDashAppLib.uniDashAppLibStrings.dock
  ] = js.undefined
  /**
    * 原生子窗体水平向右的偏移量
    */
  var right: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 原生子窗体垂直向下的偏移量
    */
  var top: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 原生子窗体的内置样式
    * - popup: 弹出层
    * - navigationBar: 导航栏
    */
  var `type`: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.popup | uniDashAppLib.uniDashAppLibStrings.navigationBar
  ] = js.undefined
  /**
    * 原生子窗体的宽度
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object SubNVuesSetStyleOptions {
  @scala.inline
  def apply(
    bottom: java.lang.String = null,
    dock: uniDashAppLib.uniDashAppLibStrings.top | uniDashAppLib.uniDashAppLibStrings.bottom | uniDashAppLib.uniDashAppLibStrings.left | uniDashAppLib.uniDashAppLibStrings.right = null,
    height: java.lang.String = null,
    left: java.lang.String = null,
    margin: java.lang.String = null,
    mask: uniDashAppLib.uniDashAppLibStrings.popup | uniDashAppLib.uniDashAppLibStrings.navigationBar = null,
    position: uniDashAppLib.uniDashAppLibStrings.static | uniDashAppLib.uniDashAppLibStrings.absolute | uniDashAppLib.uniDashAppLibStrings.dock = null,
    right: java.lang.String = null,
    top: java.lang.String = null,
    `type`: uniDashAppLib.uniDashAppLibStrings.popup | uniDashAppLib.uniDashAppLibStrings.navigationBar = null,
    width: java.lang.String = null
  ): SubNVuesSetStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (dock != null) __obj.updateDynamic("dock")(dock.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SubNVuesSetStyleOptions]
  }
}

