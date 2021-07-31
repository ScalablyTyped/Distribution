package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfStatement
  extends StObject
     with Statement {
  
  val elseStatement: js.UndefOr[Statement] = js.native
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_IfStatement: typings.typescript.mod.SyntaxKind.IfStatement = js.native
  
  val thenStatement: Statement = js.native
}
