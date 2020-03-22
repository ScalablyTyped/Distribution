package typings.uiBox.styleSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var maxLength: js.UndefOr[Double] = js.undefined
  var speedy: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(maxLength: Int | Double = null, speedy: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(speedy)) __obj.updateDynamic("speedy")(speedy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

