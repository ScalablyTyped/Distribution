package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormalParameterInfo extends js.Object {
  var docComment: String
  var isVariable: Boolean
  var limChar: Double
  var minChar: Double
  var name: String
}

object FormalParameterInfo {
  @scala.inline
  def apply(docComment: String, isVariable: Boolean, limChar: Double, minChar: Double, name: String): FormalParameterInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], isVariable = isVariable.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalParameterInfo]
  }
}

