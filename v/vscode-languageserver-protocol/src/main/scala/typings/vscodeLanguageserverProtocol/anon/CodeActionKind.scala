package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionKind extends js.Object {
  /**
    * The code action kind is support with the following value
    * set.
    */
  var codeActionKind: `2` = js.native
}

object CodeActionKind {
  @scala.inline
  def apply(codeActionKind: `2`): CodeActionKind = {
    val __obj = js.Dynamic.literal(codeActionKind = codeActionKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionKind]
  }
  @scala.inline
  implicit class CodeActionKindOps[Self <: CodeActionKind] (val x: Self) extends AnyVal {
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
    def setCodeActionKind(value: `2`): Self = this.set("codeActionKind", value.asInstanceOf[js.Any])
  }
  
}

