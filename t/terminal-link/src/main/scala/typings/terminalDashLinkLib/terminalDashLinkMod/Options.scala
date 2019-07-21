package typings
package terminalDashLinkLib.terminalDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Override the default fallback.
  		@default `${text} (${url})`
  		*/
  var fallback: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* url */ java.lang.String, java.lang.String]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(fallback: (/* text */ java.lang.String, /* url */ java.lang.String) => java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction2(fallback))
    __obj.asInstanceOf[Options]
  }
}

