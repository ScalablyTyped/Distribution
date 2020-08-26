package typings.typescript.mod.server

import typings.typescript.typescriptStrings.closeProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseProject extends TypingInstallerRequestWithProjectName {
  val kind: closeProject = js.native
}

object CloseProject {
  @scala.inline
  def apply(kind: closeProject, projectName: String): CloseProject = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseProject]
  }
  @scala.inline
  implicit class CloseProjectOps[Self <: CloseProject] (val x: Self) extends AnyVal {
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
    def setKind(value: closeProject): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

