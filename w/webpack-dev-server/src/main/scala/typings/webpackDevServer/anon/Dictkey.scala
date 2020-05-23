package typings.webpackDevServer.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Array[String]] {
  var force: Boolean
}

object Dictkey {
  @scala.inline
  def apply(force: Boolean, StringDictionary: /* key */ StringDictionary[js.Array[String]] = null): Dictkey = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

