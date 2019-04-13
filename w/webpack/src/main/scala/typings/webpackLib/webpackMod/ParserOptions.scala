package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions
  extends /* optName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var system: js.UndefOr[scala.Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    StringDictionary: /* optName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    system: js.UndefOr[scala.Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(system)) __obj.updateDynamic("system")(system)
    __obj.asInstanceOf[ParserOptions]
  }
}

