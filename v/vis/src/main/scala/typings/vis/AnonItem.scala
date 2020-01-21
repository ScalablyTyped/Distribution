package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  def template(item: js.Any): js.Any
}

object AnonItem {
  @scala.inline
  def apply(template: js.Any => js.Any): AnonItem = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction1(template))
  
    __obj.asInstanceOf[AnonItem]
  }
}

