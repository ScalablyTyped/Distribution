package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExistence extends js.Object {
  var content: AnonItems
  var existence: AnonItems
}

object AnonExistence {
  @scala.inline
  def apply(content: AnonItems, existence: AnonItems): AnonExistence = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExistence]
  }
}

