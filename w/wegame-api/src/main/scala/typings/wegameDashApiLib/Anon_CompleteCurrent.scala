package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteCurrent extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 当前显示图片的链接，默认为urls的第一张
    */
  var current: js.UndefOr[java.lang.String] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 需要预览的图片链接列表
    */
  var urls: js.Array[java.lang.String]
}

object Anon_CompleteCurrent {
  @scala.inline
  def apply(
    urls: js.Array[java.lang.String],
    complete: js.Function0[scala.Unit] = null,
    current: java.lang.String = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): Anon_CompleteCurrent = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (current != null) __obj.updateDynamic("current")(current)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteCurrent]
  }
}

