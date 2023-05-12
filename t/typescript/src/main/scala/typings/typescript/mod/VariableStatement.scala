package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableStatement
  extends StObject
     with Statement
     with FlowContainer
     with HasJSDoc
     with HasModifiers {
  
  val declarationList: VariableDeclarationList = js.native
  
  @JSName("kind")
  val kind_VariableStatement: typings.typescript.mod.SyntaxKind.VariableStatement = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
}
