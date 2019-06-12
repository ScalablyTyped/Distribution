package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralTypeNode extends TypeNode {
  @JSName("kind")
  var kind_LiteralTypeNode: typescriptLib.typescriptMod.SyntaxKind.LiteralType = js.native
  var literal: BooleanLiteral | LiteralExpression | PrefixUnaryExpression = js.native
}

