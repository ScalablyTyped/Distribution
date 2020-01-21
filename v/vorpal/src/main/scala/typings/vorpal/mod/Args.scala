package typings.vorpal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args
  extends /* key */ StringDictionary[js.Any] {
  var options: StringDictionary[js.Any]
}

object Args {
  @scala.inline
  def apply(options: StringDictionary[js.Any], StringDictionary: /* key */ StringDictionary[js.Any] = null): Args = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Args]
  }
}

