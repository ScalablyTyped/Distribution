package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHierarchyItem extends js.Object {
  var file: java.lang.String = js.native
  var kind: ScriptElementKind = js.native
  var name: java.lang.String = js.native
  var selectionSpan: TextSpan = js.native
  var span: TextSpan = js.native
}

object CallHierarchyItem {
  @scala.inline
  def apply(
    file: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    selectionSpan: TextSpan,
    span: TextSpan
  ): CallHierarchyItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSpan = selectionSpan.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyItem]
  }
  @scala.inline
  implicit class CallHierarchyItemOps[Self <: CallHierarchyItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFile(value: java.lang.String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSpan(value: TextSpan): Self = this.set("selectionSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpan(value: TextSpan): Self = this.set("span", value.asInstanceOf[js.Any])
  }
  
}

