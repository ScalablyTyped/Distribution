package typings.vegaDashLite.buildSrcCompileSelectionSelectionMod

import typings.vegaDashLite.Anon_X
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaDashLite.buildSrcCompileLayerMod.LayerModel
import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaDashLite.buildSrcLogicalMod.LogicalOperand
import typings.vegaDashLite.buildSrcSelectionMod.SelectionDef
import typings.vegaDashLite.buildSrcUtilMod.Dict
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgData
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgSignalRef
import typings.vegaDashLite.vegaDashLiteStrings._modify
import typings.vegaDashLite.vegaDashLiteStrings._selection_domain_
import typings.vegaDashLite.vegaDashLiteStrings._store
import typings.vegaDashLite.vegaDashLiteStrings._tuple
import typings.vegaDashLite.vegaDashLiteStrings.data
import typings.vegaDashLite.vegaDashLiteStrings.visual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/selection/selection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MODIFY: _modify = js.native
  val SELECTION_DOMAIN: _selection_domain_ = js.native
  val STORE: _store = js.native
  val TUPLE: _tuple = js.native
  def assembleLayerSelectionMarks(model: LayerModel, marks: js.Array[_]): js.Array[_] = js.native
  def assembleTopLevelSignals(model: UnitModel, signals: js.Array[_]): js.Array[_] = js.native
  def assembleUnitSelectionData(model: UnitModel, data: js.Array[VgData]): js.Array[VgData] = js.native
  def assembleUnitSelectionMarks(model: UnitModel, marks: js.Array[_]): js.Array[_] = js.native
  def assembleUnitSelectionSignals(model: UnitModel, signals: js.Array[_]): js.Array[_] = js.native
  @JSName("channelSignalName")
  def channelSignalName_data(selCmpt: SelectionComponent, channel: Channel, range: data): js.Any = js.native
  @JSName("channelSignalName")
  def channelSignalName_visual(selCmpt: SelectionComponent, channel: Channel, range: visual): js.Any = js.native
  def isRawSelectionDomain(domainRaw: VgSignalRef): Boolean = js.native
  def parseUnitSelection(model: UnitModel, selDefs: Dict[SelectionDef]): Dict[SelectionComponent] = js.native
  def positionalProjections(selCmpt: SelectionComponent): Anon_X = js.native
  def requiresSelectionId(model: Model): Boolean = js.native
  def selectionPredicate(model: Model, selections: LogicalOperand[String]): String = js.native
  def selectionPredicate(model: Model, selections: LogicalOperand[String], dfnode: DataFlowNode): String = js.native
  def selectionScaleDomain(model: Model, domainRaw: VgSignalRef): VgSignalRef = js.native
  def unitName(model: Model): String = js.native
}

