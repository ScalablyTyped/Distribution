package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  def template(item: js.Any): js.Any
}

object Template {
  @scala.inline
  def apply(template: js.Any => js.Any): Template = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction1(template))
    __obj.asInstanceOf[Template]
  }
}

