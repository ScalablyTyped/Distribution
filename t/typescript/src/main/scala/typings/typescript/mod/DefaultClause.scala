package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultClause
  extends Node
     with CaseOrDefaultClause {
  
  @JSName("kind")
  val kind_DefaultClause: typings.typescript.mod.SyntaxKind.DefaultClause = js.native
  
  @JSName("parent")
  val parent_DefaultClause: CaseBlock = js.native
  
  val statements: NodeArray[Statement] = js.native
}
