package typings.tensorflowTfjsConverter.compiledApiMod.OpDef

import typings.tensorflowTfjsConverter.compiledApiMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ArgDef. */
@js.native
trait IArgDef extends js.Object {
  /** ArgDef description */
  var description: js.UndefOr[String | Null] = js.native
  /** ArgDef isRef */
  var isRef: js.UndefOr[Boolean | Null] = js.native
  /** ArgDef name */
  var name: js.UndefOr[String | Null] = js.native
  /** ArgDef numberAttr */
  var numberAttr: js.UndefOr[String | Null] = js.native
  /** ArgDef type */
  var `type`: js.UndefOr[DataType | Null] = js.native
  /** ArgDef typeAttr */
  var typeAttr: js.UndefOr[String | Null] = js.native
  /** ArgDef typeListAttr */
  var typeListAttr: js.UndefOr[String | Null] = js.native
}

object IArgDef {
  @scala.inline
  def apply(): IArgDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArgDef]
  }
  @scala.inline
  implicit class IArgDefOps[Self <: IArgDef] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setIsRef(value: Boolean): Self = this.set("isRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRef: Self = this.set("isRef", js.undefined)
    @scala.inline
    def setIsRefNull: Self = this.set("isRef", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setNumberAttr(value: String): Self = this.set("numberAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberAttr: Self = this.set("numberAttr", js.undefined)
    @scala.inline
    def setNumberAttrNull: Self = this.set("numberAttr", null)
    @scala.inline
    def setType(value: DataType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    @scala.inline
    def setTypeAttr(value: String): Self = this.set("typeAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAttr: Self = this.set("typeAttr", js.undefined)
    @scala.inline
    def setTypeAttrNull: Self = this.set("typeAttr", null)
    @scala.inline
    def setTypeListAttr(value: String): Self = this.set("typeListAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeListAttr: Self = this.set("typeListAttr", js.undefined)
    @scala.inline
    def setTypeListAttrNull: Self = this.set("typeListAttr", null)
  }
  
}

