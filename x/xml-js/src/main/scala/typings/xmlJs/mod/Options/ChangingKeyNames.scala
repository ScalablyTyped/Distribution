package typings.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangingKeyNames extends js.Object {
  var attributesKey: js.UndefOr[String] = js.native
  var cdataKey: js.UndefOr[String] = js.native
  var commentKey: js.UndefOr[String] = js.native
  var declarationKey: js.UndefOr[String] = js.native
  var doctypeKey: js.UndefOr[String] = js.native
  var elementsKey: js.UndefOr[String] = js.native
  var instructionKey: js.UndefOr[String] = js.native
  var nameKey: js.UndefOr[String] = js.native
  var parentKey: js.UndefOr[String] = js.native
  var textKey: js.UndefOr[String] = js.native
  var typeKey: js.UndefOr[String] = js.native
}

object ChangingKeyNames {
  @scala.inline
  def apply(): ChangingKeyNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangingKeyNames]
  }
  @scala.inline
  implicit class ChangingKeyNamesOps[Self <: ChangingKeyNames] (val x: Self) extends AnyVal {
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
    def setAttributesKey(value: String): Self = this.set("attributesKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributesKey: Self = this.set("attributesKey", js.undefined)
    @scala.inline
    def setCdataKey(value: String): Self = this.set("cdataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdataKey: Self = this.set("cdataKey", js.undefined)
    @scala.inline
    def setCommentKey(value: String): Self = this.set("commentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentKey: Self = this.set("commentKey", js.undefined)
    @scala.inline
    def setDeclarationKey(value: String): Self = this.set("declarationKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclarationKey: Self = this.set("declarationKey", js.undefined)
    @scala.inline
    def setDoctypeKey(value: String): Self = this.set("doctypeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoctypeKey: Self = this.set("doctypeKey", js.undefined)
    @scala.inline
    def setElementsKey(value: String): Self = this.set("elementsKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementsKey: Self = this.set("elementsKey", js.undefined)
    @scala.inline
    def setInstructionKey(value: String): Self = this.set("instructionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstructionKey: Self = this.set("instructionKey", js.undefined)
    @scala.inline
    def setNameKey(value: String): Self = this.set("nameKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameKey: Self = this.set("nameKey", js.undefined)
    @scala.inline
    def setParentKey(value: String): Self = this.set("parentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentKey: Self = this.set("parentKey", js.undefined)
    @scala.inline
    def setTextKey(value: String): Self = this.set("textKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextKey: Self = this.set("textKey", js.undefined)
    @scala.inline
    def setTypeKey(value: String): Self = this.set("typeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeKey: Self = this.set("typeKey", js.undefined)
  }
  
}

