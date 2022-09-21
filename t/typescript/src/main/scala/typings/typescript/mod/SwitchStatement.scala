package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchStatement
  extends StObject
     with Statement
     with HasJSDoc {
  
  val caseBlock: CaseBlock = js.native
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_SwitchStatement: typings.typescript.mod.SyntaxKind.SwitchStatement = js.native
  
  var possiblyExhaustive: js.UndefOr[Boolean] = js.native
}
