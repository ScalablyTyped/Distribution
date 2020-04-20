package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTemplate extends js.Object {
  def template(item: js.Any): js.Any
}

object AnonTemplate {
  @scala.inline
  def apply(template: js.Any => js.Any): AnonTemplate = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction1(template))
    __obj.asInstanceOf[AnonTemplate]
  }
}

