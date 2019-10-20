package typings.atWebpackDashBlocksPostcss.atWebpackDashBlocksPostcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var parser: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  var stringifier: js.UndefOr[String] = js.undefined
  var syntax: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    parser: String = null,
    plugins: js.Array[_] = null,
    stringifier: String = null,
    syntax: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[Options]
  }
}

