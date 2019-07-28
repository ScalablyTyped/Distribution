package typings.yeomanDashEnvironment.yeomanDashEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* key */ StringDictionary[js.Any] {
  var cwd: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, cwd: String = null): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    __obj.asInstanceOf[Options]
  }
}

