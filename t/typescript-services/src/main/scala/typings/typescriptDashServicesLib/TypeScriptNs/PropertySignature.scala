package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PropertySignature")
@js.native
class PropertySignature protected () extends AST {
  def this(propertyName: IASTToken, questionToken: ASTSpan, typeAnnotation: TypeAnnotation) = this()
  var propertyName: IASTToken = js.native
  var questionToken: ASTSpan = js.native
  var typeAnnotation: TypeAnnotation = js.native
}

