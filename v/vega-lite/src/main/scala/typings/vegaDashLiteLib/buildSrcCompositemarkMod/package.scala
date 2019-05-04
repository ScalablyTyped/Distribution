package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCompositemarkMod {
  type CompositeAggregate = vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BOXPLOT
  type CompositeMark = vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BOXPLOT | vegaDashLiteLib.buildSrcCompositemarkErrorbarMod.ERRORBAR
  type CompositeMarkConfigMixins = vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BoxPlotConfigMixins
  type CompositeMarkDef = vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BoxPlotDef
  type CompositeMarkStyle = /* import warning: ImportType.apply Failed type conversion: std.Array<vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotStyle>[0] */ js.Any
  type UnitNormalizer = js.Function2[
    /* spec */ vegaDashLiteLib.buildSrcSpecMod.GenericUnitSpec[js.Any, js.Any], 
    /* config */ vegaDashLiteLib.buildSrcConfigMod.Config, 
    vegaDashLiteLib.buildSrcSpecMod.NormalizedLayerSpec
  ]
}
