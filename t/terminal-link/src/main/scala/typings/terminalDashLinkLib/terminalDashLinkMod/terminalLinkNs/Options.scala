package typings
package terminalDashLinkLib.terminalDashLinkMod.terminalLinkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fallback: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* url */ java.lang.String, java.lang.String]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fallback: js.Function2[/* text */ java.lang.String, /* url */ java.lang.String, java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    __obj.asInstanceOf[Options]
  }
}

