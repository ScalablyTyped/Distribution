package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.KeyOfKeyword
import typings.typescript.mod.SyntaxKind.TypeOperator
import typings.typescript.mod.SyntaxKind.UniqueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOperatorNode
  extends TypeNode
     with HasType {
  
  @JSName("kind")
  val kind_TypeOperatorNode: TypeOperator = js.native
  
  val operator: KeyOfKeyword | UniqueKeyword | typings.typescript.mod.SyntaxKind.ReadonlyKeyword = js.native
  
  val `type`: TypeNode = js.native
}
