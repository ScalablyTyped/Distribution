package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyboardHeightChangeResult extends js.Object {
  /**
    * 键盘高度
    */
  var height: js.UndefOr[Double] = js.undefined
}

object OnKeyboardHeightChangeResult {
  @scala.inline
  def apply(height: Int | Double = null): OnKeyboardHeightChangeResult = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyboardHeightChangeResult]
  }
}

