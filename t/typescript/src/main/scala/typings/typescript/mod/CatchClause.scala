package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatchClause extends Node {
  
  val block: Block = js.native
  
  @JSName("kind")
  val kind_CatchClause: typings.typescript.mod.SyntaxKind.CatchClause = js.native
  
  @JSName("parent")
  val parent_CatchClause: TryStatement = js.native
  
  val variableDeclaration: js.UndefOr[VariableDeclaration] = js.native
}
