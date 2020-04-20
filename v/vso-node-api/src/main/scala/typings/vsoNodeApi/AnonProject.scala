package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProject extends js.Object {
  var project: Double
  var projectCollection: Double
}

object AnonProject {
  @scala.inline
  def apply(project: Double, projectCollection: Double): AnonProject = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectCollection = projectCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProject]
  }
}

