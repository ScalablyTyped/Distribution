package typings
package vegaDashLiteLib.buildSrcCompileDataTimeunitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode")
@js.native
class TimeUnitNode protected ()
  extends vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode {
  def this(parent: vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode, formula: vegaDashLiteLib.buildSrcUtilMod.Dict[TimeUnitComponent]) = this()
  var formula: js.Any = js.native
  def assemble(): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgFormulaTransform] = js.native
  def merge(other: TimeUnitNode): scala.Unit = js.native
}

/* static members */
@JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode")
@js.native
object TimeUnitNode extends js.Object {
  def makeFromEncoding(
    parent: vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode,
    model: vegaDashLiteLib.buildSrcCompileModelMod.ModelWithField
  ): vegaDashLiteLib.buildSrcCompileDataTimeunitMod.TimeUnitNode = js.native
  def makeFromTransform(
    parent: vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode,
    t: vegaDashLiteLib.buildSrcTransformMod.TimeUnitTransform
  ): vegaDashLiteLib.buildSrcCompileDataTimeunitMod.TimeUnitNode = js.native
}

