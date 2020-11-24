package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableStatement
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  
  val declarationList: VariableDeclarationList = js.native
  
  @JSName("kind")
  val kind_VariableStatement: typings.typescript.mod.SyntaxKind.VariableStatement = js.native
}
