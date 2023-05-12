package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseClause
  extends StObject
     with JSDocContainer
     with CaseOrDefaultClause
     with HasJSDoc {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_CaseClause: typings.typescript.mod.SyntaxKind.CaseClause = js.native
  
  @JSName("parent")
  val parent_CaseClause: CaseBlock = js.native
  
  val statements: NodeArray[Statement] = js.native
}
