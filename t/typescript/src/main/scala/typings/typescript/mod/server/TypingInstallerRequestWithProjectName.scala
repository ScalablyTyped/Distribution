package typings.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypingInstallerRequestWithProjectName extends js.Object {
  val projectName: String = js.native
}

object TypingInstallerRequestWithProjectName {
  @scala.inline
  def apply(projectName: String): TypingInstallerRequestWithProjectName = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingInstallerRequestWithProjectName]
  }
  @scala.inline
  implicit class TypingInstallerRequestWithProjectNameOps[Self <: TypingInstallerRequestWithProjectName] (val x: Self) extends AnyVal {
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
    def setProjectName(value: String): Self = this.set("projectName", value.asInstanceOf[js.Any])
  }
  
}

