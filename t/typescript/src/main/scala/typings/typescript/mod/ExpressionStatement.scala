package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionStatement
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_ExpressionStatement: typings.typescript.mod.SyntaxKind.ExpressionStatement = js.native
}
