package typings.webpackBlocksPostcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var parser: js.UndefOr[String | FunctionType] = js.undefined
  var stringifier: js.UndefOr[String | FunctionType] = js.undefined
  var syntax: js.UndefOr[String | FunctionType] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    parser: String | FunctionType = null,
    stringifier: String | FunctionType = null,
    syntax: String | FunctionType = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}

