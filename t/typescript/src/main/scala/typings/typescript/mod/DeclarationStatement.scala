package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationStatement
  extends NamedDeclaration
     with Statement {
  
  @JSName("name")
  val name_DeclarationStatement: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
}
