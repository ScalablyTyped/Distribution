package typings.stylelint

import typings.postcss.mod.Node
import typings.postcss.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var message: String
  var node: Node
  var result: Result
  var ruleName: String
  var word: js.UndefOr[String] = js.undefined
}

object AnonIndex {
  @scala.inline
  def apply(
    message: String,
    node: Node,
    result: Result,
    ruleName: String,
    index: Int | Double = null,
    line: Int | Double = null,
    word: String = null
  ): AnonIndex = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

