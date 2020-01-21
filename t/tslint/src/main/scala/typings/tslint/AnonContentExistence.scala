package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentExistence extends js.Object {
  var content: AnonItems
  var existence: AnonItems
}

object AnonContentExistence {
  @scala.inline
  def apply(content: AnonItems, existence: AnonItems): AnonContentExistence = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentExistence]
  }
}

