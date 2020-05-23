package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackStrings.empty
import typings.webpack.webpackStrings.mock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* nodeBuiltin */ StringDictionary[js.UndefOr[Boolean | mock | empty]] {
  var Buffer: js.UndefOr[Boolean | mock] = js.undefined
  var __dirname: js.UndefOr[Boolean | mock] = js.undefined
  var __filename: js.UndefOr[Boolean | mock] = js.undefined
  var console: js.UndefOr[Boolean | mock] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var process: js.UndefOr[Boolean | mock] = js.undefined
  var setImmediate: js.UndefOr[Boolean | mock | empty] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    Buffer: Boolean | mock = null,
    StringDictionary: /* nodeBuiltin */ StringDictionary[js.UndefOr[Boolean | mock | empty]] = null,
    __dirname: Boolean | mock = null,
    __filename: Boolean | mock = null,
    console: Boolean | mock = null,
    global: js.UndefOr[Boolean] = js.undefined,
    process: Boolean | mock = null,
    setImmediate: Boolean | mock | empty = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (Buffer != null) __obj.updateDynamic("Buffer")(Buffer.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__dirname != null) __obj.updateDynamic("__dirname")(__dirname.asInstanceOf[js.Any])
    if (__filename != null) __obj.updateDynamic("__filename")(__filename.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.get.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (setImmediate != null) __obj.updateDynamic("setImmediate")(setImmediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

