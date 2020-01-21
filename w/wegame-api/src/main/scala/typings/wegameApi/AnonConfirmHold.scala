package typings.wegameApi

import typings.wegameApi.wegameApiStrings.done
import typings.wegameApi.wegameApiStrings.go
import typings.wegameApi.wegameApiStrings.next
import typings.wegameApi.wegameApiStrings.search
import typings.wegameApi.wegameApiStrings.send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfirmHold extends js.Object {
  /**
    * 当点击完成时键盘是否收起
    */
  var confirmHold: js.UndefOr[Boolean] = js.undefined
  /**
    * 键盘右下角 confirm 按钮的类型，只影响按钮的文本内容
    */
  var confirmType: js.UndefOr[done | next | search | go | send] = js.undefined
  /**
    * 键盘输入框显示的默认值
    */
  var defaultValue: String
  /**
    * 键盘中文本的最大长度
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * 是否为多行输入
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object AnonConfirmHold {
  @scala.inline
  def apply(
    defaultValue: String,
    confirmHold: js.UndefOr[Boolean] = js.undefined,
    confirmType: done | next | search | go | send = null,
    maxLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): AnonConfirmHold = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmHold)) __obj.updateDynamic("confirmHold")(confirmHold.asInstanceOf[js.Any])
    if (confirmType != null) __obj.updateDynamic("confirmType")(confirmType.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirmHold]
  }
}

