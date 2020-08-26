package typings.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypingInstallerResponse extends js.Object {
  val kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed = js.native
}

object TypingInstallerResponse {
  @scala.inline
  def apply(
    kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed
  ): TypingInstallerResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingInstallerResponse]
  }
  @scala.inline
  implicit class TypingInstallerResponseOps[Self <: TypingInstallerResponse] (val x: Self) extends AnyVal {
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
    def setKind(
      value: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed
    ): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

