package typings.vexflow

import typings.vexflow.Vex.IFont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var font: js.UndefOr[IFont] = js.undefined
}

object Anon_Cache {
  @scala.inline
  def apply(cache: js.UndefOr[Boolean] = js.undefined, font: IFont = null): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cache]
  }
}

