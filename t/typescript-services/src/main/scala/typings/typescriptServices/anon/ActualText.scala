package typings.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActualText extends js.Object {
  var actualText: String
  var memberName: String
}

object ActualText {
  @scala.inline
  def apply(actualText: String, memberName: String): ActualText = {
    val __obj = js.Dynamic.literal(actualText = actualText.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualText]
  }
}

