package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.NullKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullLiteral
  extends PrimaryExpression
     with JsonObjectExpression {
  
  @JSName("kind")
  val kind_NullLiteral: NullKeyword = js.native
}
