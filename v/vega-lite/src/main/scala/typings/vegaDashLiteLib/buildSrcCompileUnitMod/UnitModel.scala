package typings
package vegaDashLiteLib.buildSrcCompileUnitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/unit", "UnitModel")
@js.native
class UnitModel protected ()
  extends vegaDashLiteLib.buildSrcCompileModelMod.ModelWithField {
  def this(spec: vegaDashLiteLib.buildSrcSpecMod.NormalizedUnitSpec, parent: vegaDashLiteLib.buildSrcCompileModelMod.Model, parentGivenName: java.lang.String, parentGivenSize: vegaDashLiteLib.buildSrcSpecMod.LayoutSizeMixins, repeater: vegaDashLiteLib.buildSrcCompileRepeaterMod.RepeaterValue, config: vegaDashLiteLib.buildSrcConfigMod.Config, fit: scala.Boolean) = this()
  val encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String] = js.native
  var fit: scala.Boolean = js.native
  val hasProjection: scala.Boolean = js.native
  var initAxes: js.Any = js.native
  var initLegend: js.Any = js.native
  var initScales: js.Any = js.native
  val mark: vegaDashLiteLib.buildSrcMarkMod.Mark = js.native
  val markDef: vegaDashLiteLib.buildSrcMarkMod.MarkDef = js.native
  val selection: vegaDashLiteLib.buildSrcUtilMod.Dict[vegaDashLiteLib.buildSrcSelectionMod.SelectionDef] = js.native
  var specifiedAxes: vegaDashLiteLib.buildSrcCompileAxisComponentMod.AxisIndex = js.native
  var specifiedLegends: vegaDashLiteLib.buildSrcCompileLegendComponentMod.LegendIndex = js.native
  var specifiedProjection: vegaDashLiteLib.buildSrcProjectionMod.Projection = js.native
  val specifiedScales: vegaDashLiteLib.buildSrcCompileScaleComponentMod.ScaleIndex = js.native
  val stack: vegaDashLiteLib.buildSrcStackMod.StackProperties = js.native
  @JSName("type")
  val type_UnitModel: vegaDashLiteLib.vegaDashLiteLibStrings.unit = js.native
  def axis(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcAxisMod.Axis = js.native
  def legend(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcLegendMod.Legend = js.native
  /**
    * Return specified Vega-lite scale domain for a particular channel
    * @param channel
    */
  def scaleDomain(channel: vegaDashLiteLib.buildSrcChannelMod.ScaleChannel): vegaDashLiteLib.buildSrcScaleMod.Domain = js.native
  def toSpec(): js.Any = js.native
  def toSpec(excludeConfig: js.Any): js.Any = js.native
  def toSpec(excludeConfig: js.Any, excludeData: js.Any): js.Any = js.native
}

