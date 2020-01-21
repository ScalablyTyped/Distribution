package typings.toMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var converters: js.UndefOr[js.Array[Converter]] = js.undefined
  var gfm: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(converters: js.Array[Converter] = null, gfm: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (converters != null) __obj.updateDynamic("converters")(converters.asInstanceOf[js.Any])
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

