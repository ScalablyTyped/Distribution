package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryStatement extends Statement {
  
  val catchClause: js.UndefOr[CatchClause] = js.native
  
  val finallyBlock: js.UndefOr[Block] = js.native
  
  @JSName("kind")
  val kind_TryStatement: typings.typescript.mod.SyntaxKind.TryStatement = js.native
  
  val tryBlock: Block = js.native
}
