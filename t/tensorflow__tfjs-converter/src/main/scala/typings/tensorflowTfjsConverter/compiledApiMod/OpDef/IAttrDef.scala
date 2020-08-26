package typings.tensorflowTfjsConverter.compiledApiMod.OpDef

import typings.tensorflowTfjsConverter.compiledApiMod.IAttrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an AttrDef. */
@js.native
trait IAttrDef extends js.Object {
  /** AttrDef allowedValues */
  var allowedValues: js.UndefOr[IAttrValue | Null] = js.native
  /** AttrDef defaultValue */
  var defaultValue: js.UndefOr[IAttrValue | Null] = js.native
  /** AttrDef description */
  var description: js.UndefOr[String | Null] = js.native
  /** AttrDef hasMinimum */
  var hasMinimum: js.UndefOr[Boolean | Null] = js.native
  /** AttrDef minimum */
  var minimum: js.UndefOr[Double | String | Null] = js.native
  /** AttrDef name */
  var name: js.UndefOr[String | Null] = js.native
  /** AttrDef type */
  var `type`: js.UndefOr[String | Null] = js.native
}

object IAttrDef {
  @scala.inline
  def apply(): IAttrDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttrDef]
  }
  @scala.inline
  implicit class IAttrDefOps[Self <: IAttrDef] (val x: Self) extends AnyVal {
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
    def setAllowedValues(value: IAttrValue): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedValues: Self = this.set("allowedValues", js.undefined)
    @scala.inline
    def setAllowedValuesNull: Self = this.set("allowedValues", null)
    @scala.inline
    def setDefaultValue(value: IAttrValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setHasMinimum(value: Boolean): Self = this.set("hasMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasMinimum: Self = this.set("hasMinimum", js.undefined)
    @scala.inline
    def setHasMinimumNull: Self = this.set("hasMinimum", null)
    @scala.inline
    def setMinimum(value: Double | String): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setMinimumNull: Self = this.set("minimum", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

