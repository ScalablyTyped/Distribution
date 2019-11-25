package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontDescOptions extends js.Object {
  //  字体样式，可选值为 normal / italic / oblique
  var style: js.UndefOr[String] = js.undefined
  //  设置小型大写字母的字体显示文本，可选值为 normal / small-caps / inherit
  var variant: js.UndefOr[String] = js.undefined
  //  字体粗细，可选值为 normal / bold / 100 / 200../ 900
  var weight: js.UndefOr[String] = js.undefined
}

object FontDescOptions {
  @scala.inline
  def apply(style: String = null, variant: String = null, weight: String = null): FontDescOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDescOptions]
  }
}

