package typings.webpack.webpackMod

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
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(system)) __obj.updateDynamic("system")(system)
    __obj.asInstanceOf[ParserOptions]
  }
}

