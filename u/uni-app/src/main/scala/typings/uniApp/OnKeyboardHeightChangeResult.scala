package typings.uniApp

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
  def apply(height: js.UndefOr[Double] = js.undefined): OnKeyboardHeightChangeResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyboardHeightChangeResult]
  }
}

