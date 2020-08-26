package typings.tern.ternMod

import typings.estree.mod.Program
import typings.tern.inferMod.Scope
import typings.tern.ternStrings.delete
import typings.tern.ternStrings.full
import typings.tern.ternStrings.part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var asLineChar: js.UndefOr[js.Function1[/* nodePosition */ Double, Position]] = js.native
  var ast: Program = js.native
  var name: String = js.native
  var scope: Scope = js.native
  var text: String = js.native
  var `type`: js.UndefOr[full | part | delete] = js.native
}

object File {
  @scala.inline
  def apply(ast: Program, name: String, scope: Scope, text: String): File = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setAst(value: Program): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsLineChar(value: /* nodePosition */ Double => Position): Self = this.set("asLineChar", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAsLineChar: Self = this.set("asLineChar", js.undefined)
    @scala.inline
    def setType(value: full | part | delete): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

