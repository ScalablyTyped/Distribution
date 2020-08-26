package typings.xmlJs.mod

import typings.xmlJs.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var attributes: js.UndefOr[Attributes] = js.native
  var cdata: js.UndefOr[String] = js.native
  var comment: js.UndefOr[String] = js.native
  var declaration: js.UndefOr[`0`] = js.native
  var doctype: js.UndefOr[String] = js.native
  var elements: js.UndefOr[js.Array[Element]] = js.native
  var instruction: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var text: js.UndefOr[String | Double | Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Element {
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCdata(value: String): Self = this.set("cdata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdata: Self = this.set("cdata", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setDeclaration(value: `0`): Self = this.set("declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
    @scala.inline
    def setDoctype(value: String): Self = this.set("doctype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoctype: Self = this.set("doctype", js.undefined)
    @scala.inline
    def setElementsVarargs(value: Element*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[Element]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstruction: Self = this.set("instruction", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setText(value: String | Double | Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

