package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabeledStatement
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  @JSName("kind")
  var kind_LabeledStatement: typings.typescript.mod.SyntaxKind.LabeledStatement = js.native
  var label: Identifier = js.native
  var statement: Statement = js.native
}

