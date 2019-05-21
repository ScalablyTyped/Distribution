package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFontFaceOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 可选的字体描述符
    */
  var desc: js.UndefOr[LoadFontFaceOptionsDesc] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 定义的字体名称
    */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容。
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object LoadFontFaceOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    desc: LoadFontFaceOptionsDesc = null,
    fail: () => scala.Unit = null,
    family: java.lang.String = null,
    source: java.lang.String = null,
    success: () => scala.Unit = null
  ): LoadFontFaceOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (family != null) __obj.updateDynamic("family")(family)
    if (source != null) __obj.updateDynamic("source")(source)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[LoadFontFaceOptions]
  }
}

