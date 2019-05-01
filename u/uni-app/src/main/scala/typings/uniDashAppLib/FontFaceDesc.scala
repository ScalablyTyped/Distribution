package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceDesc extends js.Object {
  /**
    * 字体样式
    * - normal:
    * - italic:
    * - oblique:
    */
  var style: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.normal | uniDashAppLib.uniDashAppLibStrings.italic | uniDashAppLib.uniDashAppLibStrings.oblique
  ] = js.undefined
  /**
    * 设置小型大写字母的字体显示文本
    * - normal:
    * - small-caps:
    * - inherit:
    */
  var variant: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.normal | uniDashAppLib.uniDashAppLibStrings.`small-caps` | uniDashAppLib.uniDashAppLibStrings.inherit
  ] = js.undefined
  /**
    * 字体粗细
    * - normal:
    * - bold:
    */
  var weight: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.normal | uniDashAppLib.uniDashAppLibStrings.bold
  ] = js.undefined
}

object FontFaceDesc {
  @scala.inline
  def apply(
    style: uniDashAppLib.uniDashAppLibStrings.normal | uniDashAppLib.uniDashAppLibStrings.italic | uniDashAppLib.uniDashAppLibStrings.oblique = null,
    variant: uniDashAppLib.uniDashAppLibStrings.normal | uniDashAppLib.uniDashAppLibStrings.`small-caps` | uniDashAppLib.uniDashAppLibStrings.inherit = null,
    weight: uniDashAppLib.uniDashAppLibStrings.normal | uniDashAppLib.uniDashAppLibStrings.bold = null
  ): FontFaceDesc = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceDesc]
  }
}

