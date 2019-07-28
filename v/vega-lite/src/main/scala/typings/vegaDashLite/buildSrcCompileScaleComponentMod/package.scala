package typings.vegaDashLite

import typings.vegaDashLite.buildSrcUtilMod.Omit
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgScale
import typings.vegaDashLite.vegaDashLiteStrings.domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCompileScaleComponentMod {
  type ScaleComponentIndex = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in vega-lite.vega-lite/build/src/channel.ScaleChannel ]:? vega-lite.vega-lite/build/src/compile/scale/component.ScaleComponent}
    */ typings.vegaDashLite.vegaDashLiteStrings.ScaleComponentIndex with js.Any
  type ScaleComponentProps = Omit[VgScale, domain]
  type ScaleIndex = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in vega-lite.vega-lite/build/src/channel.ScaleChannel ]:? vega-lite.vega-lite/build/src/scale.Scale}
    */ typings.vegaDashLite.vegaDashLiteStrings.ScaleIndex with js.Any
}
