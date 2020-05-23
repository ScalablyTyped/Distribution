package typings.vexflow.anon

import typings.vexflow.Vex.IFont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var font: js.UndefOr[IFont] = js.undefined
}

object Cache {
  @scala.inline
  def apply(cache: js.UndefOr[Boolean] = js.undefined, font: IFont = null): Cache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

