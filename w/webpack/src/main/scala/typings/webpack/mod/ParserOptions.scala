package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions
  extends /* optName */ StringDictionary[js.Any] {
  var system: js.UndefOr[Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    StringDictionary: /* optName */ StringDictionary[js.Any] = null,
    system: js.UndefOr[Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(system)) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

