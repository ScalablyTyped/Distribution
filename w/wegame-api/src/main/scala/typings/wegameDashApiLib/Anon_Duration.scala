package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 提示的延迟时间
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 图标
    */
  var icon: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.success | wegameDashApiLib.wegameDashApiLibStrings.loading
  ] = js.undefined
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 提示的内容
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

