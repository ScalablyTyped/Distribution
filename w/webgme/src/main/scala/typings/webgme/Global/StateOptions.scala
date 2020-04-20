package typings.webgme.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateOptions extends js.Object {
  var silent: Boolean
}

object StateOptions {
  @scala.inline
  def apply(silent: Boolean): StateOptions = {
    val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateOptions]
  }
}

