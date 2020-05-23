package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  var project: scala.Double
  var projectCollection: scala.Double
}

object Project {
  @scala.inline
  def apply(project: scala.Double, projectCollection: scala.Double): Project = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectCollection = projectCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
}

