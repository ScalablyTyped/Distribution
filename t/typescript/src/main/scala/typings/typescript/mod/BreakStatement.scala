package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakStatement
  extends StObject
     with Statement
     with BreakOrContinueStatement {
  
  @JSName("kind")
  val kind_BreakStatement: typings.typescript.mod.SyntaxKind.BreakStatement = js.native
  
  val label: js.UndefOr[Identifier] = js.native
}
