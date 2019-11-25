package typings.tabbable.tabbableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var includeContainer: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(includeContainer: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeContainer)) __obj.updateDynamic("includeContainer")(includeContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

