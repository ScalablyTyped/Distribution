package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ImportKeyword
import typings.typescript.mod.SyntaxKind.NewKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaProperty extends PrimaryExpression {
  
  val keywordToken: NewKeyword | ImportKeyword = js.native
  
  @JSName("kind")
  val kind_MetaProperty: typings.typescript.mod.SyntaxKind.MetaProperty = js.native
  
  val name: Identifier = js.native
}
