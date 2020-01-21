package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.KeyOfKeyword
import typings.typescript.mod.SyntaxKind.ReadonlyKeyword
import typings.typescript.mod.SyntaxKind.TypeOperator
import typings.typescript.mod.SyntaxKind.UniqueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeOperatorNode
  extends TypeNode
     with HasType {
  @JSName("kind")
  var kind_TypeOperatorNode: TypeOperator = js.native
  var operator: KeyOfKeyword | UniqueKeyword | ReadonlyKeyword = js.native
  var `type`: TypeNode = js.native
}

