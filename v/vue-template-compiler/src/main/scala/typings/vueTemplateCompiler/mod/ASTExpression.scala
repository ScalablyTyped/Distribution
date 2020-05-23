package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTExpression extends ASTNode {
  var expression: String
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var text: String
  var tokens: js.Array[String | (Record[String, _])]
  var `type`: `2`
}

object ASTExpression {
  @scala.inline
  def apply(
    expression: String,
    text: String,
    tokens: js.Array[String | (Record[String, _])],
    `type`: `2`,
    ssrOptimizability: SSROptimizability = null,
    static: js.UndefOr[Boolean] = js.undefined
  ): ASTExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ssrOptimizability != null) __obj.updateDynamic("ssrOptimizability")(ssrOptimizability.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTExpression]
  }
}

