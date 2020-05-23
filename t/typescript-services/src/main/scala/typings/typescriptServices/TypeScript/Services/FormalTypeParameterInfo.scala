package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormalTypeParameterInfo extends js.Object {
  var docComment: String
  var limChar: Double
  var minChar: Double
  var name: String
}

object FormalTypeParameterInfo {
  @scala.inline
  def apply(docComment: String, limChar: Double, minChar: Double, name: String): FormalTypeParameterInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalTypeParameterInfo]
  }
}

