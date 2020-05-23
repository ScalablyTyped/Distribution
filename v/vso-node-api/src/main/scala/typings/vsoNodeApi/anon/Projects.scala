package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projects extends js.Object {
  var none: scala.Double
  var projects: scala.Double
}

object Projects {
  @scala.inline
  def apply(none: scala.Double, projects: scala.Double): Projects = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projects]
  }
}

