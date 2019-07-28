package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowActionSheetRes extends js.Object {
  /**
    * 用户点击的按钮，从上到下的顺序，从0开始
    */
  var tapIndex: js.UndefOr[Double] = js.undefined
}

object ShowActionSheetRes {
  @scala.inline
  def apply(tapIndex: Int | Double = null): ShowActionSheetRes = {
    val __obj = js.Dynamic.literal()
    if (tapIndex != null) __obj.updateDynamic("tapIndex")(tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetRes]
  }
}

