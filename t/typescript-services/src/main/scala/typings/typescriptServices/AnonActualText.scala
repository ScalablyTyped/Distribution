package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActualText extends js.Object {
  var actualText: String
  var memberName: String
}

object AnonActualText {
  @scala.inline
  def apply(actualText: String, memberName: String): AnonActualText = {
    val __obj = js.Dynamic.literal(actualText = actualText.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActualText]
  }
}

