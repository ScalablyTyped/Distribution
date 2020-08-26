package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projects extends js.Object {
  var none: scala.Double = js.native
  var projects: scala.Double = js.native
}

object Projects {
  @scala.inline
  def apply(none: scala.Double, projects: scala.Double): Projects = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projects]
  }
  @scala.inline
  implicit class ProjectsOps[Self <: Projects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjects(value: scala.Double): Self = this.set("projects", value.asInstanceOf[js.Any])
  }
  
}

