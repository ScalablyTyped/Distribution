package typings.yogBigpipe

import org.scalablytyped.runtime.StringDictionary
import typings.yogBigpipe.mod.Pagelet.mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var mode: typings.yogBigpipe.mod.Pagelet.mode
}

object AnonDictkey {
  @scala.inline
  def apply(mode: mode, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

