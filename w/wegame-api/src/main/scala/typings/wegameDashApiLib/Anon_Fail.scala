package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Fail extends js.Object {
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

