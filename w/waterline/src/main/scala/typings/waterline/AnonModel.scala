package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModel extends js.Object {
  var model: String
}

object AnonModel {
  @scala.inline
  def apply(model: String): AnonModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonModel]
  }
}

