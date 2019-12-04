package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRulesStrictBooleanExpressionsRuleMod {
  import typings.typescript.typescriptMod.BinaryExpression
  import typings.typescript.typescriptMod.ConditionalExpression
  import typings.typescript.typescriptMod.DoStatement
  import typings.typescript.typescriptMod.ForStatement
  import typings.typescript.typescriptMod.IfStatement
  import typings.typescript.typescriptMod.PrefixUnaryExpression
  import typings.typescript.typescriptMod.WhileStatement

  type Location = PrefixUnaryExpression | IfStatement | WhileStatement | DoStatement | ForStatement | ConditionalExpression | BinaryExpression
}
