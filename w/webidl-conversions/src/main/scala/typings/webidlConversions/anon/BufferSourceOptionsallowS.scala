package typings.webidlConversions.anon

import typings.webidlConversions.mod.Globals
import typings.webidlConversions.webidlConversionsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined webidl-conversions.webidl-conversions.BufferSourceOptions & {  allowShared ? :false} */
trait BufferSourceOptionsallowS extends js.Object {
  var allowShared: js.UndefOr[Boolean with `false`] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var globals: js.UndefOr[Globals] = js.undefined
}

object BufferSourceOptionsallowS {
  @scala.inline
  def apply(
    allowShared: js.UndefOr[Boolean with `false`] = js.undefined,
    context: String = null,
    globals: Globals = null
  ): BufferSourceOptionsallowS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowShared)) __obj.updateDynamic("allowShared")(allowShared.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferSourceOptionsallowS]
  }
}

