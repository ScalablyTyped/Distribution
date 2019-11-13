package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import typings.std.Record
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerNumbers.`2`
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
    val __obj = js.Dynamic.literal(expression = expression, text = text, tokens = tokens)
    __obj.updateDynamic("type")(`type`)
    if (ssrOptimizability != null) __obj.updateDynamic("ssrOptimizability")(ssrOptimizability)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[ASTExpression]
  }
}

