package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakStatement
  extends Statement
     with BreakOrContinueStatement {
  @JSName("kind")
  var kind_BreakStatement: typings.typescript.typescriptMod.SyntaxKind.BreakStatement = js.native
  var label: js.UndefOr[Identifier] = js.native
}

