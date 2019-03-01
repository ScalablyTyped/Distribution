package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Project extends js.Object {
  var project: scala.Double
  var projectCollection: scala.Double
}

object Anon_Project {
  @scala.inline
  def apply(project: scala.Double, projectCollection: scala.Double): Anon_Project = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("projectCollection")(projectCollection)
    __obj.asInstanceOf[Anon_Project]
  }
}

