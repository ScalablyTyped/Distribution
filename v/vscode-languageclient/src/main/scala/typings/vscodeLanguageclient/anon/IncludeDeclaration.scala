package typings.vscodeLanguageclient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeDeclaration extends js.Object {
  var includeDeclaration: Boolean = js.native
}

object IncludeDeclaration {
  @scala.inline
  def apply(includeDeclaration: Boolean): IncludeDeclaration = {
    val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeDeclaration]
  }
  @scala.inline
  implicit class IncludeDeclarationOps[Self <: IncludeDeclaration] (val x: Self) extends AnyVal {
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
    def setIncludeDeclaration(value: Boolean): Self = this.set("includeDeclaration", value.asInstanceOf[js.Any])
  }
  
}

