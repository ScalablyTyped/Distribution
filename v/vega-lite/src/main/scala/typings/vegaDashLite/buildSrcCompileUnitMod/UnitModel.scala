package typings.vegaDashLite.buildSrcCompileUnitMod

import typings.vegaDashLite.buildSrcAxisMod.Axis
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcChannelMod.ScaleChannel
import typings.vegaDashLite.buildSrcCompileAxisComponentMod.AxisIndex
import typings.vegaDashLite.buildSrcCompileLegendComponentMod.LegendIndex
import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcCompileModelMod.ModelWithField
import typings.vegaDashLite.buildSrcCompileRepeaterMod.RepeaterValue
import typings.vegaDashLite.buildSrcCompileScaleComponentMod.ScaleIndex
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcLegendMod.Legend
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcMarkMod.MarkDef
import typings.vegaDashLite.buildSrcProjectionMod.Projection
import typings.vegaDashLite.buildSrcScaleMod.Domain
import typings.vegaDashLite.buildSrcSelectionMod.SelectionDef
import typings.vegaDashLite.buildSrcSpecMod.LayoutSizeMixins
import typings.vegaDashLite.buildSrcSpecMod.NormalizedUnitSpec
import typings.vegaDashLite.buildSrcStackMod.StackProperties
import typings.vegaDashLite.buildSrcUtilMod.Dict
import typings.vegaDashLite.vegaDashLiteStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/unit", "UnitModel")
@js.native
class UnitModel protected () extends ModelWithField {
  def this(
    spec: NormalizedUnitSpec,
    parent: Model,
    parentGivenName: String,
    parentGivenSize: LayoutSizeMixins,
    repeater: RepeaterValue,
    config: Config,
    fit: Boolean
  ) = this()
  val encoding: Encoding[String] = js.native
  var fit: Boolean = js.native
  val hasProjection: Boolean = js.native
  var initAxes: js.Any = js.native
  var initLegend: js.Any = js.native
  var initScales: js.Any = js.native
  val mark: Mark = js.native
  val markDef: MarkDef = js.native
  val selection: Dict[SelectionDef] = js.native
  var specifiedAxes: AxisIndex = js.native
  var specifiedLegends: LegendIndex = js.native
  var specifiedProjection: Projection = js.native
  val specifiedScales: ScaleIndex = js.native
  val stack: StackProperties = js.native
  @JSName("type")
  val type_UnitModel: unit = js.native
  def axis(channel: Channel): Axis = js.native
  def legend(channel: Channel): Legend = js.native
  /**
    * Return specified Vega-lite scale domain for a particular channel
    * @param channel
    */
  def scaleDomain(channel: ScaleChannel): Domain = js.native
  def toSpec(): js.Any = js.native
  def toSpec(excludeConfig: js.Any): js.Any = js.native
  def toSpec(excludeConfig: js.Any, excludeData: js.Any): js.Any = js.native
}

