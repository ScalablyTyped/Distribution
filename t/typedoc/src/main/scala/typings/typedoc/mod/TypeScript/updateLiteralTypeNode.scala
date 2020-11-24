package typings.typedoc.mod.TypeScript

import typings.typescript.mod.FalseLiteral
import typings.typescript.mod.LiteralExpression
import typings.typescript.mod.LiteralTypeNode
import typings.typescript.mod.NullLiteral
import typings.typescript.mod.PrefixUnaryExpression
import typings.typescript.mod.TrueLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateLiteralTypeNode")
@js.native
object updateLiteralTypeNode extends js.Object {
  
  def apply(node: LiteralTypeNode, literal: FalseLiteral): LiteralTypeNode = js.native
  /** @deprecated Use `factory.updateLiteralTypeNode` or the factory supplied by your transformation context instead. */
  def apply(node: LiteralTypeNode, literal: LiteralExpression): LiteralTypeNode = js.native
  def apply(node: LiteralTypeNode, literal: NullLiteral): LiteralTypeNode = js.native
  def apply(node: LiteralTypeNode, literal: PrefixUnaryExpression): LiteralTypeNode = js.native
  def apply(node: LiteralTypeNode, literal: TrueLiteral): LiteralTypeNode = js.native
}
