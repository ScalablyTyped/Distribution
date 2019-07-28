package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Parameter")
@js.native
class Parameter protected () extends AST {
  def this(
    dotDotDotToken: ASTSpan,
    modifiers: js.Array[PullElementFlags],
    identifier: Identifier,
    questionToken: ASTSpan,
    typeAnnotation: TypeAnnotation,
    equalsValueClause: EqualsValueClause
  ) = this()
  var dotDotDotToken: ASTSpan = js.native
  var equalsValueClause: EqualsValueClause = js.native
  var identifier: Identifier = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  var questionToken: ASTSpan = js.native
  var typeAnnotation: TypeAnnotation = js.native
}

