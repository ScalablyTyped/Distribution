package typings.tensorflowTfjsConverter.modelAnalysisMod

import typings.std.Set
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionInfo extends js.Object {
  var dynamicNode: Node = js.native
  var inputs: NamedTensorMap = js.native
  var missingInputs: js.Array[String] = js.native
  var outputs: js.Array[Node] = js.native
  var syncInputs: js.Array[String] = js.native
  var usedNodes: Set[String] = js.native
}

object ExecutionInfo {
  @scala.inline
  def apply(
    dynamicNode: Node,
    inputs: NamedTensorMap,
    missingInputs: js.Array[String],
    outputs: js.Array[Node],
    syncInputs: js.Array[String],
    usedNodes: Set[String]
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(dynamicNode = dynamicNode.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], missingInputs = missingInputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], syncInputs = syncInputs.asInstanceOf[js.Any], usedNodes = usedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionInfo]
  }
  @scala.inline
  implicit class ExecutionInfoOps[Self <: ExecutionInfo] (val x: Self) extends AnyVal {
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
    def setDynamicNode(value: Node): Self = this.set("dynamicNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputs(value: NamedTensorMap): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingInputsVarargs(value: String*): Self = this.set("missingInputs", js.Array(value :_*))
    @scala.inline
    def setMissingInputs(value: js.Array[String]): Self = this.set("missingInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputsVarargs(value: Node*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[Node]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncInputsVarargs(value: String*): Self = this.set("syncInputs", js.Array(value :_*))
    @scala.inline
    def setSyncInputs(value: js.Array[String]): Self = this.set("syncInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedNodes(value: Set[String]): Self = this.set("usedNodes", value.asInstanceOf[js.Any])
  }
  
}

