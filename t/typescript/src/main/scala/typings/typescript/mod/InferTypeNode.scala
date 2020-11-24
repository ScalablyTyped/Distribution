package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.InferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InferTypeNode extends TypeNode {
  
  @JSName("kind")
  val kind_InferTypeNode: InferType = js.native
  
  val typeParameter: TypeParameterDeclaration = js.native
}
