package typings.stylelint

import typings.postcss.postcssMod.Node
import typings.postcss.postcssMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var message: String
  var node: Node
  var result: Result
  var ruleName: String
  var word: js.UndefOr[String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(
    message: String,
    node: Node,
    result: Result,
    ruleName: String,
    index: Int | Double = null,
    line: Int | Double = null,
    word: String = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal(message = message, node = node, result = result, ruleName = ruleName)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[Anon_Index]
  }
}

