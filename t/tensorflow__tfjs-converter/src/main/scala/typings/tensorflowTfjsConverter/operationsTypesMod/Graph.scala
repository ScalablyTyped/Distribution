package typings.tensorflowTfjsConverter.operationsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.ISignatureDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  var functions: js.UndefOr[StringDictionary[Graph]] = js.native
  var inputs: js.Array[Node] = js.native
  var nodes: StringDictionary[Node] = js.native
  var outputs: js.Array[Node] = js.native
  var placeholders: js.Array[Node] = js.native
  var signature: js.UndefOr[ISignatureDef] = js.native
  var weights: js.Array[Node] = js.native
}

object Graph {
  @scala.inline
  def apply(
    inputs: js.Array[Node],
    nodes: StringDictionary[Node],
    outputs: js.Array[Node],
    placeholders: js.Array[Node],
    weights: js.Array[Node]
  ): Graph = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], placeholders = placeholders.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
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
    def setInputsVarargs(value: Node*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[Node]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: StringDictionary[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputsVarargs(value: Node*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[Node]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholdersVarargs(value: Node*): Self = this.set("placeholders", js.Array(value :_*))
    @scala.inline
    def setPlaceholders(value: js.Array[Node]): Self = this.set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeightsVarargs(value: Node*): Self = this.set("weights", js.Array(value :_*))
    @scala.inline
    def setWeights(value: js.Array[Node]): Self = this.set("weights", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctions(value: StringDictionary[Graph]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setSignature(value: ISignatureDef): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
  
}

