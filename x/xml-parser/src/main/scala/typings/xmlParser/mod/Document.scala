package typings.xmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var declaration: Declaration = js.native
  var root: Node = js.native
}

object Document {
  @scala.inline
  def apply(declaration: Declaration, root: Node): Document = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
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
    def setDeclaration(value: Declaration): Self = this.set("declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: Node): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

