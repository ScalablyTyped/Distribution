package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableStatement
  extends StObject
     with Statement {
  
  val declarationList: VariableDeclarationList = js.native
  
  @JSName("kind")
  val kind_VariableStatement: typings.typescript.mod.SyntaxKind.VariableStatement = js.native
  
  @JSName("modifiers")
  val modifiers_VariableStatement: js.UndefOr[NodeArray[Modifier]] = js.native
}
