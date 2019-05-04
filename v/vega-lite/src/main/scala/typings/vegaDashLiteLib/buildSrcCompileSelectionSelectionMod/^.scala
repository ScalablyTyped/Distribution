package typings
package vegaDashLiteLib.buildSrcCompileSelectionSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/selection/selection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MODIFY: vegaDashLiteLib.vegaDashLiteLibStrings._modify = js.native
  val SELECTION_DOMAIN: vegaDashLiteLib.vegaDashLiteLibStrings._selection_domain_ = js.native
  val STORE: vegaDashLiteLib.vegaDashLiteLibStrings._store = js.native
  val TUPLE: vegaDashLiteLib.vegaDashLiteLibStrings._tuple = js.native
  def assembleLayerSelectionMarks(model: vegaDashLiteLib.buildSrcCompileLayerMod.LayerModel, marks: js.Array[_]): js.Array[_] = js.native
  def assembleTopLevelSignals(model: vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, signals: js.Array[_]): js.Array[_] = js.native
  def assembleUnitSelectionData(
    model: vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel,
    data: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData]
  ): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData] = js.native
  def assembleUnitSelectionMarks(model: vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, marks: js.Array[_]): js.Array[_] = js.native
  def assembleUnitSelectionSignals(model: vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, signals: js.Array[_]): js.Array[_] = js.native
  @JSName("channelSignalName")
  def channelSignalName_data(
    selCmpt: SelectionComponent,
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    range: vegaDashLiteLib.vegaDashLiteLibStrings.data
  ): js.Any = js.native
  @JSName("channelSignalName")
  def channelSignalName_visual(
    selCmpt: SelectionComponent,
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    range: vegaDashLiteLib.vegaDashLiteLibStrings.visual
  ): js.Any = js.native
  def isRawSelectionDomain(domainRaw: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignalRef): scala.Boolean = js.native
  def parseUnitSelection(
    model: vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel,
    selDefs: vegaDashLiteLib.buildSrcUtilMod.Dict[vegaDashLiteLib.buildSrcSelectionMod.SelectionDef]
  ): vegaDashLiteLib.buildSrcUtilMod.Dict[SelectionComponent] = js.native
  def positionalProjections(selCmpt: SelectionComponent): vegaDashLiteLib.Anon_X = js.native
  def requiresSelectionId(model: vegaDashLiteLib.buildSrcCompileModelMod.Model): scala.Boolean = js.native
  def selectionPredicate(
    model: vegaDashLiteLib.buildSrcCompileModelMod.Model,
    selections: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[java.lang.String]
  ): java.lang.String = js.native
  def selectionPredicate(
    model: vegaDashLiteLib.buildSrcCompileModelMod.Model,
    selections: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[java.lang.String],
    dfnode: vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode
  ): java.lang.String = js.native
  def selectionScaleDomain(
    model: vegaDashLiteLib.buildSrcCompileModelMod.Model,
    domainRaw: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignalRef
  ): vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignalRef = js.native
  def unitName(model: vegaDashLiteLib.buildSrcCompileModelMod.Model): java.lang.String = js.native
}

