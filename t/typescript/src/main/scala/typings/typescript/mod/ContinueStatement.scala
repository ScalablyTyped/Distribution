package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueStatement
  extends Statement
     with BreakOrContinueStatement {
  @JSName("kind")
  var kind_ContinueStatement: typings.typescript.mod.SyntaxKind.ContinueStatement = js.native
  var label: js.UndefOr[Identifier] = js.native
}

