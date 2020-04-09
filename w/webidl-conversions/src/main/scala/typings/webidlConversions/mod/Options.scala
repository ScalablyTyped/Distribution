package typings.webidlConversions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var globals: js.UndefOr[Globals] = js.undefined
}

object Options {
  @scala.inline
  def apply(context: String = null, globals: Globals = null): Options = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

