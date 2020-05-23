package typings.yogBigpipe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.yogBigpipe.mod.Pagelet.mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var mode: typings.yogBigpipe.mod.Pagelet.mode
}

object Dictkey {
  @scala.inline
  def apply(mode: mode, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictkey = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

