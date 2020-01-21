package typings.webpackDevServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForce
  extends /* key */ StringDictionary[js.Array[String]] {
  var force: Boolean
}

object AnonForce {
  @scala.inline
  def apply(force: Boolean, StringDictionary: /* key */ StringDictionary[js.Array[String]] = null): AnonForce = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonForce]
  }
}

