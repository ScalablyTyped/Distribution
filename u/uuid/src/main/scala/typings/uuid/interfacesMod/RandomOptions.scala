package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomOptions extends V4Options {
  var random: js.UndefOr[InputBuffer] = js.undefined
}

object RandomOptions {
  @scala.inline
  def apply(random: InputBuffer = null): RandomOptions = {
    val __obj = js.Dynamic.literal()
    if (random != null) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomOptions]
  }
}

