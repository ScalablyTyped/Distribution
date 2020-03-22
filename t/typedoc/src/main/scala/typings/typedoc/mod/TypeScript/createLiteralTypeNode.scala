package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BooleanLiteral
import typings.typescript.mod.LiteralExpression
import typings.typescript.mod.LiteralTypeNode
import typings.typescript.mod.PrefixUnaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createLiteralTypeNode")
@js.native
object createLiteralTypeNode extends js.Object {
  def apply(literal: BooleanLiteral): LiteralTypeNode = js.native
  def apply(literal: LiteralExpression): LiteralTypeNode = js.native
  def apply(literal: PrefixUnaryExpression): LiteralTypeNode = js.native
}

