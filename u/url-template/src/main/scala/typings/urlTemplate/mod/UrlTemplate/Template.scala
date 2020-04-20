package typings.urlTemplate.mod.UrlTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  def expand(parameters: js.Any): String
}

object Template {
  @scala.inline
  def apply(expand: js.Any => String): Template = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
    __obj.asInstanceOf[Template]
  }
}

