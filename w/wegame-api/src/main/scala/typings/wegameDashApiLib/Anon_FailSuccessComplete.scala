package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailSuccessComplete extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 按钮的文字颜色，默认值#000000
    */
  var itemColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮的文字数组，数组长度最大为 6
    */
  var itemList: js.Array[java.lang.String]
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

