package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* nodeBuiltin */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        scala.Boolean | webpackLib.webpackLibStrings.mock | webpackLib.webpackLibStrings.empty
      ]
    ] {
  var Buffer: js.UndefOr[scala.Boolean | webpackLib.webpackLibStrings.mock] = js.undefined
  var __dirname: js.UndefOr[scala.Boolean | webpackLib.webpackLibStrings.mock] = js.undefined
  var __filename: js.UndefOr[scala.Boolean | webpackLib.webpackLibStrings.mock] = js.undefined
  var console: js.UndefOr[scala.Boolean | webpackLib.webpackLibStrings.mock] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var process: js.UndefOr[scala.Boolean | webpackLib.webpackLibStrings.mock] = js.undefined
  var setImmediate: js.UndefOr[
    scala.Boolean | webpackLib.webpackLibStrings.mock | webpackLib.webpackLibStrings.empty
  ] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    Buffer: scala.Boolean | webpackLib.webpackLibStrings.mock = null,
    StringDictionary: /* nodeBuiltin */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        scala.Boolean | webpackLib.webpackLibStrings.mock | webpackLib.webpackLibStrings.empty
      ]
    ] = null,
    __dirname: scala.Boolean | webpackLib.webpackLibStrings.mock = null,
    __filename: scala.Boolean | webpackLib.webpackLibStrings.mock = null,
    console: scala.Boolean | webpackLib.webpackLibStrings.mock = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    process: scala.Boolean | webpackLib.webpackLibStrings.mock = null,
    setImmediate: scala.Boolean | webpackLib.webpackLibStrings.mock | webpackLib.webpackLibStrings.empty = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (Buffer != null) __obj.updateDynamic("Buffer")(Buffer.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__dirname != null) __obj.updateDynamic("__dirname")(__dirname.asInstanceOf[js.Any])
    if (__filename != null) __obj.updateDynamic("__filename")(__filename.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (setImmediate != null) __obj.updateDynamic("setImmediate")(setImmediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

