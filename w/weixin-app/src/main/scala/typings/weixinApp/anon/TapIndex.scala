package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapIndex extends js.Object {
  /**
    * 用户点击的按钮，从上到下的顺序，从0开始
    */
  var tapIndex: Double
}

object TapIndex {
  @scala.inline
  def apply(tapIndex: Double): TapIndex = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapIndex]
  }
}

