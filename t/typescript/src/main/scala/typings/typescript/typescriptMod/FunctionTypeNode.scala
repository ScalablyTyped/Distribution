package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.FunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeNode
  extends FunctionOrConstructorTypeNodeBase
     with FunctionOrConstructorTypeNode
     with SignatureDeclaration
     with _HasJSDoc {
  @JSName("kind")
  var kind_FunctionTypeNode: FunctionType = js.native
}

