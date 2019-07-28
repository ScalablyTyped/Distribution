package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypePredicateNode
  extends TypeNode
     with HasType {
  @JSName("kind")
  var kind_TypePredicateNode: typings.typescript.typescriptMod.SyntaxKind.TypePredicate = js.native
  var parameterName: Identifier | ThisTypeNode = js.native
  @JSName("parent")
  var parent_TypePredicateNode: SignatureDeclaration | JSDocTypeExpression = js.native
  var `type`: TypeNode = js.native
}

