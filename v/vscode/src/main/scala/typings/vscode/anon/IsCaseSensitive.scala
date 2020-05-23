package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsCaseSensitive extends js.Object {
  val isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  val isReadonly: js.UndefOr[Boolean] = js.undefined
}

object IsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    isReadonly: js.UndefOr[Boolean] = js.undefined
  ): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isReadonly)) __obj.updateDynamic("isReadonly")(isReadonly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsCaseSensitive]
  }
}

