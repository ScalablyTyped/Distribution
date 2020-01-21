package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakStatement
  extends Statement
     with BreakOrContinueStatement {
  @JSName("kind")
  var kind_BreakStatement: typings.typescript.mod.SyntaxKind.BreakStatement = js.native
  var label: js.UndefOr[Identifier] = js.native
}

