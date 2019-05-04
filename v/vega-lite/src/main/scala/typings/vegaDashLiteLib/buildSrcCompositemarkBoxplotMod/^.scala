package typings
package vegaDashLiteLib.buildSrcCompositemarkBoxplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compositemark/boxplot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BOXPLOT: vegaDashLiteLib.vegaDashLiteLibStrings.`box-plot` = js.native
  val BOXPLOT_STYLES: js.Array[BoxPlotStyle] = js.native
  def filterUnsupportedChannels(
    spec: vegaDashLiteLib.buildSrcSpecMod.GenericUnitSpec[
      vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String], 
      BOXPLOT | BoxPlotDef
    ]
  ): vegaDashLiteLib.buildSrcSpecMod.GenericUnitSpec[
    vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String], 
    BOXPLOT | BoxPlotDef
  ] = js.native
  def isBoxPlotDef(mark: BOXPLOT): /* is vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotDef */ scala.Boolean = js.native
  def isBoxPlotDef(mark: BoxPlotDef): /* is vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotDef */ scala.Boolean = js.native
  def normalizeBoxPlot(
    spec: vegaDashLiteLib.buildSrcSpecMod.GenericUnitSpec[
      vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String], 
      BOXPLOT | BoxPlotDef
    ],
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): vegaDashLiteLib.buildSrcSpecMod.NormalizedLayerSpec = js.native
}

