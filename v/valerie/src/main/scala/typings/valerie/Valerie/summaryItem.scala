package typings.valerie.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait summaryItem extends js.Object {
  var message: String
  var name: String
}

object summaryItem {
  @scala.inline
  def apply(message: String, name: String): summaryItem = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[summaryItem]
  }
}

