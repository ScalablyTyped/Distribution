package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditInfo extends js.Object {
  var length: Double
  var position: Double
  var replaceWith: String
}

object TextEditInfo {
  @scala.inline
  def apply(length: Double, position: Double, replaceWith: String): TextEditInfo = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], replaceWith = replaceWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditInfo]
  }
}

