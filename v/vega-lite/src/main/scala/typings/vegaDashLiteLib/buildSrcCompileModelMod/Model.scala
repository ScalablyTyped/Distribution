package typings
package vegaDashLiteLib.buildSrcCompileModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/model", "Model")
@js.native
abstract class Model protected () extends js.Object {
  def this(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec, parent: Model, parentGivenName: java.lang.String, config: vegaDashLiteLib.buildSrcConfigMod.Config, repeater: vegaDashLiteLib.buildSrcCompileRepeaterMod.RepeaterValue, resolve: vegaDashLiteLib.buildSrcResolveMod.Resolve) = this()
  val children: js.Array[Model] = js.native
  val component: Component = js.native
  val config: vegaDashLiteLib.buildSrcConfigMod.Config = js.native
  val data: vegaDashLiteLib.buildSrcDataMod.Data = js.native
  val description: java.lang.String = js.native
  val height: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignalRef = js.native
  val layout: vegaDashLiteLib.buildSrcToplevelpropsMod.GenericCompositionLayout = js.native
  /** Name map for size, which can be renamed by a model's parent. */
  var layoutSizeNameMap: NameMapInterface = js.native
  val name: java.lang.String = js.native
  val parent: Model = js.native
  /** Name map for projections, which can be renamed by a model's parent. */
  var projectionNameMap: NameMapInterface = js.native
  /**
    * Rename top-level spec's size to be just width / height, ignoring model name.
    * This essentially merges the top-level spec's width/height signals with the width/height signals
    * to help us reduce redundant signals declaration.
    */
  var renameTopLevelLayoutSize: js.Any = js.native
  val repeater: vegaDashLiteLib.buildSrcCompileRepeaterMod.RepeaterValue = js.native
  /** Name map for scales, which can be renamed by a model's parent. */
  var scaleNameMap: NameMapInterface = js.native
  val title: vegaDashLiteLib.buildSrcTitleMod.TitleParams = js.native
  val transforms: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform] = js.native
  val `type`: vegaDashLiteLib.vegaDashLiteLibStrings.unit | vegaDashLiteLib.vegaDashLiteLibStrings.facet | vegaDashLiteLib.vegaDashLiteLibStrings.layer | vegaDashLiteLib.vegaDashLiteLibStrings.concat | vegaDashLiteLib.vegaDashLiteLibStrings.repeat = js.native
  val width: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignalRef = js.native
  def assembleAxes(): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis] = js.native
  /* protected */ def assembleDefaultLayout(): vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLayout = js.native
  /**
    * Assemble the mark group for this model.  We accept optional `signals` so that we can include concat top-level signals with the top-level model's local signals.
    */
  def assembleGroup(): js.Any = js.native
  def assembleGroup(signals: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignal]): js.Any = js.native
  def assembleGroupStyle(): java.lang.String = js.native
  def assembleHeaderMarks(): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgMarkGroup] = js.native
  def assembleLayout(): vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLayout = js.native
  def assembleLayoutSignals(): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignal] = js.native
  def assembleLayoutSize(): vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEncodeEntry = js.native
  def assembleLegends(): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLegend] = js.native
  def assembleMarks(): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgMarkGroup] = js.native
  def assembleProjections(): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgProjection] = js.native
  def assembleSelectionData(data: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData]): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData] = js.native
  def assembleSelectionSignals(): js.Array[_] = js.native
  def assembleSelectionTopLevelSignals(signals: js.Array[_]): js.Array[_] = js.native
  def assembleTitle(): vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgTitle = js.native
  /**
    * Corrects the data references in marks after assemble.
    */
  def correctDataNames(mark: js.Any): js.Any = js.native
  def getName(text: java.lang.String): java.lang.String = js.native
  /**
    * Traverse a model's hierarchy to get the scale component for a particular channel.
    */
  def getScaleComponent(channel: vegaDashLiteLib.buildSrcChannelMod.ScaleChannel): vegaDashLiteLib.buildSrcCompileScaleComponentMod.ScaleComponent = js.native
  /**
    * Traverse a model's hierarchy to get a particular selection component.
    */
  def getSelectionComponent(variableName: java.lang.String, origName: java.lang.String): vegaDashLiteLib.buildSrcCompileSelectionSelectionMod.SelectionComponent = js.native
  def getSizeName(oldSizeName: java.lang.String): java.lang.String = js.native
  @JSName("getSizeSignalRef")
  def getSizeSignalRef_height(sizeType: vegaDashLiteLib.vegaDashLiteLibStrings.height): vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignalRef = js.native
  @JSName("getSizeSignalRef")
  def getSizeSignalRef_width(sizeType: vegaDashLiteLib.vegaDashLiteLibStrings.width): vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSignalRef = js.native
  def hasDescendantWithFieldOnChannel(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): scala.Boolean = js.native
  /* protected */ def initSize(size: vegaDashLiteLib.buildSrcCompileLayoutsizeComponentMod.LayoutSizeIndex): scala.Unit = js.native
  /**
    * Lookup the name of the datasource for an output node. You probably want to call this in assemble.
    */
  def lookupDataSource(name: java.lang.String): java.lang.String = js.native
  def parse(): scala.Unit = js.native
  def parseAxisAndHeader(): scala.Unit = js.native
  def parseData(): scala.Unit = js.native
  def parseLayoutSize(): scala.Unit = js.native
  def parseLegend(): scala.Unit = js.native
  def parseMarkGroup(): scala.Unit = js.native
  def parseProjection(): scala.Unit = js.native
  def parseScale(): scala.Unit = js.native
  def parseSelection(): scala.Unit = js.native
  /**
    * @return projection name after the projection has been parsed and named.
    */
  def projectionName(): java.lang.String = js.native
  def projectionName(parse: scala.Boolean): java.lang.String = js.native
  def renameLayoutSize(oldName: java.lang.String, newName: java.lang.String): scala.Unit = js.native
  def renameProjection(oldName: java.lang.String, newName: java.lang.String): scala.Unit = js.native
  def renameScale(oldName: java.lang.String, newName: java.lang.String): scala.Unit = js.native
  /**
    * Request a data source name for the given data source type and mark that data source as required. This method should be called in parse, so that all used data source can be correctly instantiated in assembleData().
    */
  def requestDataName(name: vegaDashLiteLib.buildSrcDataMod.DataSourceType): java.lang.String = js.native
  /**
    * @return scale name for a given channel after the scale has been parsed and named.
    */
  def scaleName(originalScaleName: vegaDashLiteLib.buildSrcChannelMod.Channel | java.lang.String): java.lang.String = js.native
  def scaleName(
    originalScaleName: vegaDashLiteLib.buildSrcChannelMod.Channel | java.lang.String,
    parse: scala.Boolean
  ): java.lang.String = js.native
}

