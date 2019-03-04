package typings
package vorpalLib.vorpalMod.VorpalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var options: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object Args {
  @scala.inline
  def apply(
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Args = {
    val __obj = js.Dynamic.literal(options = options)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Args]
  }
}

