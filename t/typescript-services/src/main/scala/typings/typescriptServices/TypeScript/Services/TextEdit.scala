package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEdit extends js.Object {
  var limChar: Double
  var minChar: Double
  var text: String
}

object TextEdit {
  @scala.inline
  def apply(limChar: Double, minChar: Double, text: String): TextEdit = {
    val __obj = js.Dynamic.literal(limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEdit]
  }
}

