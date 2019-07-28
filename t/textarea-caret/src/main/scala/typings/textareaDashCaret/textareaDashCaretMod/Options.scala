package typings.textareaDashCaret.textareaDashCaretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[Options]
  }
}

