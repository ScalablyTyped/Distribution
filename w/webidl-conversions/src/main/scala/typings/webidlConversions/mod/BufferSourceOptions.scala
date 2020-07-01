package typings.webidlConversions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferSourceOptions extends Options {
  var allowShared: js.UndefOr[Boolean] = js.undefined
}

object BufferSourceOptions {
  @scala.inline
  def apply(allowShared: js.UndefOr[Boolean] = js.undefined, context: String = null, globals: Globals = null): BufferSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowShared)) __obj.updateDynamic("allowShared")(allowShared.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferSourceOptions]
  }
}

