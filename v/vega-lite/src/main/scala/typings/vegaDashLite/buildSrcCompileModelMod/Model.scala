package typings.vegaDashLite.buildSrcCompileModelMod

import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcChannelMod.ScaleChannel
import typings.vegaDashLite.buildSrcCompileLayoutsizeComponentMod.LayoutSizeIndex
import typings.vegaDashLite.buildSrcCompileRepeaterMod.RepeaterValue
import typings.vegaDashLite.buildSrcCompileScaleComponentMod.ScaleComponent
import typings.vegaDashLite.buildSrcCompileSelectionSelectionMod.SelectionComponent
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcDataMod.DataSourceType
import typings.vegaDashLite.buildSrcResolveMod.Resolve
import typings.vegaDashLite.buildSrcSpecMod.BaseSpec
import typings.vegaDashLite.buildSrcTitleMod.TitleParams
import typings.vegaDashLite.buildSrcToplevelpropsMod.GenericCompositionLayout
import typings.vegaDashLite.buildSrcTransformMod.Transform
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxis
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgData
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgEncodeEntry
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgLayout
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgLegend
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgMarkGroup
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgProjection
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgSignal
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgSignalRef
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgTitle
import typings.vegaDashLite.vegaDashLiteStrings.concat
import typings.vegaDashLite.vegaDashLiteStrings.facet
import typings.vegaDashLite.vegaDashLiteStrings.layer
import typings.vegaDashLite.vegaDashLiteStrings.repeat
import typings.vegaDashLite.vegaDashLiteStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/model", "Model")
@js.native
abstract class Model protected () extends js.Object {
  def this(
    spec: BaseSpec,
    parent: Model,
    parentGivenName: String,
    config: Config,
    repeater: RepeaterValue,
    resolve: Resolve
  ) = this()
  val children: js.Array[Model] = js.native
  val component: Component = js.native
  val config: Config = js.native
  val data: Data = js.native
  val description: String = js.native
  val height: VgSignalRef = js.native
  val layout: GenericCompositionLayout = js.native
  /** Name map for size, which can be renamed by a model's parent. */
  var layoutSizeNameMap: NameMapInterface = js.native
  val name: String = js.native
  val parent: Model = js.native
  /** Name map for projections, which can be renamed by a model's parent. */
  var projectionNameMap: NameMapInterface = js.native
  /**
    * Rename top-level spec's size to be just width / height, ignoring model name.
    * This essentially merges the top-level spec's width/height signals with the width/height signals
    * to help us reduce redundant signals declaration.
    */
  var renameTopLevelLayoutSize: js.Any = js.native
  val repeater: RepeaterValue = js.native
  /** Name map for scales, which can be renamed by a model's parent. */
  var scaleNameMap: NameMapInterface = js.native
  val title: TitleParams = js.native
  val transforms: js.Array[Transform] = js.native
  val `type`: unit | facet | layer | concat | repeat = js.native
  val width: VgSignalRef = js.native
  def assembleAxes(): js.Array[VgAxis] = js.native
  /* protected */ def assembleDefaultLayout(): VgLayout = js.native
  /**
    * Assemble the mark group for this model.  We accept optional `signals` so that we can include concat top-level signals with the top-level model's local signals.
    */
  def assembleGroup(): js.Any = js.native
  def assembleGroup(signals: js.Array[VgSignal]): js.Any = js.native
  def assembleGroupStyle(): String = js.native
  def assembleHeaderMarks(): js.Array[VgMarkGroup] = js.native
  def assembleLayout(): VgLayout = js.native
  def assembleLayoutSignals(): js.Array[VgSignal] = js.native
  def assembleLayoutSize(): VgEncodeEntry = js.native
  def assembleLegends(): js.Array[VgLegend] = js.native
  def assembleMarks(): js.Array[VgMarkGroup] = js.native
  def assembleProjections(): js.Array[VgProjection] = js.native
  def assembleSelectionData(data: js.Array[VgData]): js.Array[VgData] = js.native
  def assembleSelectionSignals(): js.Array[_] = js.native
  def assembleSelectionTopLevelSignals(signals: js.Array[_]): js.Array[_] = js.native
  def assembleTitle(): VgTitle = js.native
  /**
    * Corrects the data references in marks after assemble.
    */
  def correctDataNames(mark: js.Any): js.Any = js.native
  def getName(text: String): String = js.native
  /**
    * Traverse a model's hierarchy to get the scale component for a particular channel.
    */
  def getScaleComponent(channel: ScaleChannel): ScaleComponent = js.native
  /**
    * Traverse a model's hierarchy to get a particular selection component.
    */
  def getSelectionComponent(variableName: String, origName: String): SelectionComponent = js.native
  def getSizeName(oldSizeName: String): String = js.native
  @JSName("getSizeSignalRef")
  def getSizeSignalRef_height(sizeType: typings.vegaDashLite.vegaDashLiteStrings.height): VgSignalRef = js.native
  @JSName("getSizeSignalRef")
  def getSizeSignalRef_width(sizeType: typings.vegaDashLite.vegaDashLiteStrings.width): VgSignalRef = js.native
  def hasDescendantWithFieldOnChannel(channel: Channel): Boolean = js.native
  /* protected */ def initSize(size: LayoutSizeIndex): Unit = js.native
  /**
    * Lookup the name of the datasource for an output node. You probably want to call this in assemble.
    */
  def lookupDataSource(name: String): String = js.native
  def parse(): Unit = js.native
  def parseAxisAndHeader(): Unit = js.native
  def parseData(): Unit = js.native
  def parseLayoutSize(): Unit = js.native
  def parseLegend(): Unit = js.native
  def parseMarkGroup(): Unit = js.native
  def parseProjection(): Unit = js.native
  def parseScale(): Unit = js.native
  def parseSelection(): Unit = js.native
  /**
    * @return projection name after the projection has been parsed and named.
    */
  def projectionName(): String = js.native
  def projectionName(parse: Boolean): String = js.native
  def renameLayoutSize(oldName: String, newName: String): Unit = js.native
  def renameProjection(oldName: String, newName: String): Unit = js.native
  def renameScale(oldName: String, newName: String): Unit = js.native
  /**
    * Request a data source name for the given data source type and mark that data source as required. This method should be called in parse, so that all used data source can be correctly instantiated in assembleData().
    */
  def requestDataName(name: DataSourceType): String = js.native
  /**
    * @return scale name for a given channel after the scale has been parsed and named.
    */
  def scaleName(originalScaleName: Channel | String): String = js.native
  def scaleName(originalScaleName: Channel | String, parse: Boolean): String = js.native
}

