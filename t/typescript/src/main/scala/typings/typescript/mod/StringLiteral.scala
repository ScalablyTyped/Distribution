package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringLiteral
  extends LiteralExpression
     with Declaration
     with JsonObjectExpression
     with LiteralToken
     with ModuleName
     with PropertyName
     with StringLiteralLike {
  
  @JSName("kind")
  val kind_StringLiteral: typings.typescript.mod.SyntaxKind.StringLiteral = js.native
}
