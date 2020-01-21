package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.VariableDeclarator")
@js.native
class VariableDeclarator protected () extends AST {
  def this(propertyName: IASTToken, typeAnnotation: TypeAnnotation, equalsValueClause: EqualsValueClause) = this()
  var equalsValueClause: EqualsValueClause = js.native
  var propertyName: IASTToken = js.native
  var typeAnnotation: TypeAnnotation = js.native
}

