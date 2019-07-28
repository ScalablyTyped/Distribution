package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongPressActionsOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 按钮的文字颜色，字符串格式，默认为"#000000"
    */
  var itemColor: js.UndefOr[String] = js.undefined
  /**
    * 按钮的文字数组
    */
  var itemList: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ LongPressActionsSuccessData, Unit]] = js.undefined
}

object LongPressActionsOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    itemColor: String = null,
    itemList: js.Array[String] = null,
    success: /* result */ LongPressActionsSuccessData => Unit = null
  ): LongPressActionsOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor)
    if (itemList != null) __obj.updateDynamic("itemList")(itemList)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[LongPressActionsOptions]
  }
}

