package typings.vegaDashLite.buildSrcCompileDataTimeunitMod

import typings.vegaDashLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaDashLite.buildSrcCompileModelMod.ModelWithField
import typings.vegaDashLite.buildSrcTransformMod.TimeUnitTransform
import typings.vegaDashLite.buildSrcUtilMod.Dict
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgFormulaTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode")
@js.native
class TimeUnitNode protected () extends DataFlowNode {
  def this(parent: DataFlowNode, formula: Dict[TimeUnitComponent]) = this()
  var formula: js.Any = js.native
  def assemble(): js.Array[VgFormulaTransform] = js.native
  def merge(other: TimeUnitNode): Unit = js.native
}

/* static members */
@JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode")
@js.native
object TimeUnitNode extends js.Object {
  def makeFromEncoding(parent: DataFlowNode, model: ModelWithField): TimeUnitNode = js.native
  def makeFromTransform(parent: DataFlowNode, t: TimeUnitTransform): TimeUnitNode = js.native
}

