package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IArgDef
import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IAttrDef
import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IOpDeprecation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpDef extends js.Object {
  /** OpDef allowsUninitializedInput */
  var allowsUninitializedInput: js.UndefOr[Boolean | Null] = js.native
  /** OpDef attr */
  var attr: js.UndefOr[js.Array[IAttrDef] | Null] = js.native
  /** OpDef deprecation */
  var deprecation: js.UndefOr[IOpDeprecation | Null] = js.native
  /** OpDef description */
  var description: js.UndefOr[String | Null] = js.native
  /** OpDef inputArg */
  var inputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.native
  /** OpDef isAggregate */
  var isAggregate: js.UndefOr[Boolean | Null] = js.native
  /** OpDef isCommutative */
  var isCommutative: js.UndefOr[Boolean | Null] = js.native
  /** OpDef isStateful */
  var isStateful: js.UndefOr[Boolean | Null] = js.native
  /** OpDef name */
  var name: js.UndefOr[String | Null] = js.native
  /** OpDef outputArg */
  var outputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.native
  /** OpDef summary */
  var summary: js.UndefOr[String | Null] = js.native
}

object IOpDef {
  @scala.inline
  def apply(): IOpDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpDef]
  }
  @scala.inline
  implicit class IOpDefOps[Self <: IOpDef] (val x: Self) extends AnyVal {
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
    def setAllowsUninitializedInput(value: Boolean): Self = this.set("allowsUninitializedInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowsUninitializedInput: Self = this.set("allowsUninitializedInput", js.undefined)
    @scala.inline
    def setAllowsUninitializedInputNull: Self = this.set("allowsUninitializedInput", null)
    @scala.inline
    def setAttrVarargs(value: IAttrDef*): Self = this.set("attr", js.Array(value :_*))
    @scala.inline
    def setAttr(value: js.Array[IAttrDef]): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    @scala.inline
    def setAttrNull: Self = this.set("attr", null)
    @scala.inline
    def setDeprecation(value: IOpDeprecation): Self = this.set("deprecation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecation: Self = this.set("deprecation", js.undefined)
    @scala.inline
    def setDeprecationNull: Self = this.set("deprecation", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setInputArgVarargs(value: IArgDef*): Self = this.set("inputArg", js.Array(value :_*))
    @scala.inline
    def setInputArg(value: js.Array[IArgDef]): Self = this.set("inputArg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputArg: Self = this.set("inputArg", js.undefined)
    @scala.inline
    def setInputArgNull: Self = this.set("inputArg", null)
    @scala.inline
    def setIsAggregate(value: Boolean): Self = this.set("isAggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAggregate: Self = this.set("isAggregate", js.undefined)
    @scala.inline
    def setIsAggregateNull: Self = this.set("isAggregate", null)
    @scala.inline
    def setIsCommutative(value: Boolean): Self = this.set("isCommutative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCommutative: Self = this.set("isCommutative", js.undefined)
    @scala.inline
    def setIsCommutativeNull: Self = this.set("isCommutative", null)
    @scala.inline
    def setIsStateful(value: Boolean): Self = this.set("isStateful", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStateful: Self = this.set("isStateful", js.undefined)
    @scala.inline
    def setIsStatefulNull: Self = this.set("isStateful", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setOutputArgVarargs(value: IArgDef*): Self = this.set("outputArg", js.Array(value :_*))
    @scala.inline
    def setOutputArg(value: js.Array[IArgDef]): Self = this.set("outputArg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputArg: Self = this.set("outputArg", js.undefined)
    @scala.inline
    def setOutputArgNull: Self = this.set("outputArg", null)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setSummaryNull: Self = this.set("summary", null)
  }
  
}

