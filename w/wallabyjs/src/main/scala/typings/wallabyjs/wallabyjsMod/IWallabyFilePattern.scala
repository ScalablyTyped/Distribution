package typings.wallabyjs.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyFilePattern extends js.Object {
  var ignore: js.UndefOr[Boolean] = js.undefined
  var instrument: js.UndefOr[Boolean] = js.undefined
  var load: js.UndefOr[Boolean] = js.undefined
  var pattern: String
}

object IWallabyFilePattern {
  @scala.inline
  def apply(
    pattern: String,
    ignore: js.UndefOr[Boolean] = js.undefined,
    instrument: js.UndefOr[Boolean] = js.undefined,
    load: js.UndefOr[Boolean] = js.undefined
  ): IWallabyFilePattern = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore)
    if (!js.isUndefined(instrument)) __obj.updateDynamic("instrument")(instrument)
    if (!js.isUndefined(load)) __obj.updateDynamic("load")(load)
    __obj.asInstanceOf[IWallabyFilePattern]
  }
}

