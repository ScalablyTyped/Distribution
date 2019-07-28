package typings.vegaDashLite

import typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BOXPLOT
import typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BoxPlotConfigMixins
import typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BoxPlotDef
import typings.vegaDashLite.buildSrcCompositemarkErrorbarMod.ERRORBAR
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcSpecMod.GenericUnitSpec
import typings.vegaDashLite.buildSrcSpecMod.NormalizedLayerSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCompositemarkMod {
  type CompositeAggregate = BOXPLOT
  type CompositeMark = BOXPLOT | ERRORBAR
  type CompositeMarkConfigMixins = BoxPlotConfigMixins
  type CompositeMarkDef = BoxPlotDef
  type CompositeMarkStyle = /* import warning: ImportType.apply Failed type conversion: std.Array<vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotStyle>[0] */ js.Any
  type UnitNormalizer = js.Function2[/* spec */ GenericUnitSpec[js.Any, js.Any], /* config */ Config, NormalizedLayerSpec]
}
