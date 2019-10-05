package typings.typescript.typescriptMod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypingInstallerRequestWithProjectName extends js.Object {
  val projectName: String
}

object TypingInstallerRequestWithProjectName {
  @scala.inline
  def apply(projectName: String): TypingInstallerRequestWithProjectName = {
    val __obj = js.Dynamic.literal(projectName = projectName)
  
    __obj.asInstanceOf[TypingInstallerRequestWithProjectName]
  }
}

