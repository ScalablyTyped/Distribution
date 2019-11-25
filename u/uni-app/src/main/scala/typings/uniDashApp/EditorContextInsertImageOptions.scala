package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorContextInsertImageOptions extends js.Object {
  /**
    * 图像无法显示时的替代文本
    */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * data 被序列化为 name=value;name1=value2 的格式挂在属性 data-custom 上
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 图片地址
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object EditorContextInsertImageOptions {
  @scala.inline
  def apply(
    alt: String = null,
    complete: () => Unit = null,
    data: js.Any = null,
    fail: () => Unit = null,
    src: String = null,
    success: () => Unit = null
  ): EditorContextInsertImageOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[EditorContextInsertImageOptions]
  }
}

