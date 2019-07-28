package typings.vegaDashLite.buildSrcCompositemarkBoxplotMod

import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcSpecMod.GenericUnitSpec
import typings.vegaDashLite.buildSrcSpecMod.NormalizedLayerSpec
import typings.vegaDashLite.vegaDashLiteStrings.`box-plot`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compositemark/boxplot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BOXPLOT: `box-plot` = js.native
  val BOXPLOT_STYLES: js.Array[BoxPlotStyle] = js.native
  def filterUnsupportedChannels(
    spec: GenericUnitSpec[
      Encoding[String], 
      typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BOXPLOT | BoxPlotDef
    ]
  ): GenericUnitSpec[
    Encoding[String], 
    typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BOXPLOT | BoxPlotDef
  ] = js.native
  def isBoxPlotDef(mark: typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BOXPLOT): /* is vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotDef */ Boolean = js.native
  def isBoxPlotDef(mark: BoxPlotDef): /* is vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotDef */ Boolean = js.native
  def normalizeBoxPlot(
    spec: GenericUnitSpec[
      Encoding[String], 
      typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BOXPLOT | BoxPlotDef
    ],
    config: Config
  ): NormalizedLayerSpec = js.native
}

