package typings
package stylelintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
  var message: java.lang.String
  var node: postcssLib.postcssMod.postcssNs.Node
  var result: postcssLib.postcssMod.postcssNs.Result
  var ruleName: java.lang.String
  var word: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(
    message: java.lang.String,
    node: postcssLib.postcssMod.postcssNs.Node,
    result: postcssLib.postcssMod.postcssNs.Result,
    ruleName: java.lang.String,
    index: scala.Int | scala.Double = null,
    line: scala.Int | scala.Double = null,
    word: java.lang.String = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal(message = message, node = node, result = result, ruleName = ruleName)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[Anon_Index]
  }
}

