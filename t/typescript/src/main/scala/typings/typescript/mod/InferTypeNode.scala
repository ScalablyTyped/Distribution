package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.InferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferTypeNode extends TypeNode {
  @JSName("kind")
  var kind_InferTypeNode: InferType = js.native
  var typeParameter: TypeParameterDeclaration = js.native
}

