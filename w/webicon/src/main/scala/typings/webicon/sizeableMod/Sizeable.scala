package typings.webicon.sizeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizeable extends js.Object {
  /**
    * The default size of the icon.
    */
  var iconSize: js.UndefOr[Double] = js.undefined
}

object Sizeable {
  @scala.inline
  def apply(iconSize: js.UndefOr[Double] = js.undefined): Sizeable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizeable]
  }
}

