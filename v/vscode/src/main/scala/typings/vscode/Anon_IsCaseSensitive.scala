package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCaseSensitive extends js.Object {
  val isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  val isReadonly: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    isReadonly: js.UndefOr[Boolean] = js.undefined
  ): Anon_IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive)
    if (!js.isUndefined(isReadonly)) __obj.updateDynamic("isReadonly")(isReadonly)
    __obj.asInstanceOf[Anon_IsCaseSensitive]
  }
}

