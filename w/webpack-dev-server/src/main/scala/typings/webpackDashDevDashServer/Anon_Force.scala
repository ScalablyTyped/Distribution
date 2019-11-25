package typings.webpackDashDevDashServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force
  extends /* key */ StringDictionary[js.Array[String]] {
  var force: Boolean
}

object Anon_Force {
  @scala.inline
  def apply(force: Boolean, StringDictionary: /* key */ StringDictionary[js.Array[String]] = null): Anon_Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Force]
  }
}

