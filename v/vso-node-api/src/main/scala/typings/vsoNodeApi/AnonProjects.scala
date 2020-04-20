package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjects extends js.Object {
  var none: Double
  var projects: Double
}

object AnonProjects {
  @scala.inline
  def apply(none: Double, projects: Double): AnonProjects = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjects]
  }
}

