package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowModalRes extends js.Object {
  /**
    * 为 true 时，表示用户点击了取消
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * 为 true 时，表示用户点击了确定按钮
    */
  var confirm: js.UndefOr[Boolean] = js.undefined
}

object ShowModalRes {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, confirm: js.UndefOr[Boolean] = js.undefined): ShowModalRes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowModalRes]
  }
}

