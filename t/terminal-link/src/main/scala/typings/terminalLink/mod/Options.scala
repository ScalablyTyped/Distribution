package typings.terminalLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Override the default fallback. If false, the fallback will be disabled.
  		@default `${text} (${url})`
  		*/
  var fallback: js.UndefOr[(js.Function2[/* text */ String, /* url */ String, String]) | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(fallback: (js.Function2[/* text */ String, /* url */ String, String]) | Boolean = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

