package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModalOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 取消按钮的文字颜色，默认为"#000000"
  		 */
  var cancelColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 取消按钮的文字，默认为"取消"，最多 4 个字符
  		 */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 确定按钮的文字颜色，默认为"#3CC51F"
  		 */
  var confirmColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 确定按钮的文字，默认为"确定"，最多 4 个字符
  		 */
  var confirmText: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var content: java.lang.String
  /**
  		 * 是否显示取消按钮，默认为 true
  		 */
  var showCancel: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("success")
  var success_ModalOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_Cancel, scala.Unit]] = js.undefined
  /**
  		 * 提示的标题
  		 */
  var title: java.lang.String
}

