package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailItemColor extends js.Object {
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

object Anon_CompleteFailItemColor {
  @scala.inline
  def apply(
    itemList: js.Array[java.lang.String],
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    itemColor: java.lang.String = null,
    success: js.Function0[scala.Unit] = null
  ): Anon_CompleteFailItemColor = {
    val __obj = js.Dynamic.literal(itemList = itemList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailItemColor]
  }
}

