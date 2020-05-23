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
  def apply(maxLength: js.UndefOr[Double] = js.undefined, speedy: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speedy)) __obj.updateDynamic("speedy")(speedy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

