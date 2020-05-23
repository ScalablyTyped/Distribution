package typings.stylelint.anon

import typings.postcss.mod.Node
import typings.postcss.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var message: String
  var node: Node
  var result: Result
  var ruleName: String
  var word: js.UndefOr[String] = js.undefined
}

object Index {
  @scala.inline
  def apply(
    message: String,
    node: Node,
    result: Result,
    ruleName: String,
    index: js.UndefOr[Double] = js.undefined,
    line: js.UndefOr[Double] = js.undefined,
    word: String = null
  ): Index = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

