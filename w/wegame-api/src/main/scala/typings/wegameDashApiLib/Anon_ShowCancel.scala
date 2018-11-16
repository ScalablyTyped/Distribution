package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ShowCancel extends js.Object {
  /**
           * 取消按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值#000000
           */
  var cancelColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 取消按钮的文字，最多 4 个字符串
           */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * 确认按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值#3cc51f
           */
  var confirmColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 确认按钮的文字，最多 4 个字符串
           */
  var confirmText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 提示的内容
           */
  var content: js.UndefOr[java.lang.String] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * 是否显示取消按钮，默认true
           */
  var showCancel: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_Cancel, scala.Unit]] = js.undefined
  /**
           * 提示的标题
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

