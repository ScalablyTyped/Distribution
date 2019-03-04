package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyFilePattern extends js.Object {
  var ignore: js.UndefOr[scala.Boolean] = js.undefined
  var instrument: js.UndefOr[scala.Boolean] = js.undefined
  var load: js.UndefOr[scala.Boolean] = js.undefined
  var pattern: java.lang.String
}

object IWallabyFilePattern {
  @scala.inline
  def apply(
    pattern: java.lang.String,
    ignore: js.UndefOr[scala.Boolean] = js.undefined,
    instrument: js.UndefOr[scala.Boolean] = js.undefined,
    load: js.UndefOr[scala.Boolean] = js.undefined
  ): IWallabyFilePattern = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore)
    if (!js.isUndefined(instrument)) __obj.updateDynamic("instrument")(instrument)
    if (!js.isUndefined(load)) __obj.updateDynamic("load")(load)
    __obj.asInstanceOf[IWallabyFilePattern]
  }
}

