package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MethodSignature")
@js.native
class MethodSignature protected () extends AST {
  def this(propertyName: IASTToken, questionToken: ASTSpan, callSignature: CallSignature) = this()
  var callSignature: CallSignature = js.native
  var propertyName: IASTToken = js.native
  var questionToken: ASTSpan = js.native
}

