package typings.tensorflowTfjsConverter.operationsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.IAttrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var attrParams: StringDictionary[ParamValue] = js.native
  var category: Category = js.native
  var children: js.Array[Node] = js.native
  var defaultOutput: js.UndefOr[Double] = js.native
  var inputNames: js.Array[String] = js.native
  var inputParams: StringDictionary[InputParamValue] = js.native
  var inputs: js.Array[Node] = js.native
  var name: String = js.native
  var op: String = js.native
  var rawAttrs: js.UndefOr[StringDictionary[IAttrValue]] = js.native
  var signatureKey: js.UndefOr[String] = js.native
}

object Node {
  @scala.inline
  def apply(
    attrParams: StringDictionary[ParamValue],
    category: Category,
    children: js.Array[Node],
    inputNames: js.Array[String],
    inputParams: StringDictionary[InputParamValue],
    inputs: js.Array[Node],
    name: String,
    op: String
  ): Node = {
    val __obj = js.Dynamic.literal(attrParams = attrParams.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], inputNames = inputNames.asInstanceOf[js.Any], inputParams = inputParams.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setAttrParams(value: StringDictionary[ParamValue]): Self = this.set("attrParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: Category): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: Node*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Node]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputNamesVarargs(value: String*): Self = this.set("inputNames", js.Array(value :_*))
    @scala.inline
    def setInputNames(value: js.Array[String]): Self = this.set("inputNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputParams(value: StringDictionary[InputParamValue]): Self = this.set("inputParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: Node*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[Node]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOutput(value: Double): Self = this.set("defaultOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOutput: Self = this.set("defaultOutput", js.undefined)
    @scala.inline
    def setRawAttrs(value: StringDictionary[IAttrValue]): Self = this.set("rawAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawAttrs: Self = this.set("rawAttrs", js.undefined)
    @scala.inline
    def setSignatureKey(value: String): Self = this.set("signatureKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureKey: Self = this.set("signatureKey", js.undefined)
  }
  
}

