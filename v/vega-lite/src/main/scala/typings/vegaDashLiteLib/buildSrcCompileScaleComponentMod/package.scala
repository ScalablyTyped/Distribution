package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCompileScaleComponentMod {
  type ScaleComponentIndex = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in vega-lite.vega-lite/build/src/channel.ScaleChannel ]:? vega-lite.vega-lite/build/src/compile/scale/component.ScaleComponent}
    */ vegaDashLiteLib.vegaDashLiteLibStrings.ScaleComponentIndex with js.Any
  type ScaleComponentProps = vegaDashLiteLib.buildSrcUtilMod.Omit[
    vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScale, 
    vegaDashLiteLib.vegaDashLiteLibStrings.domain
  ]
  type ScaleIndex = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in vega-lite.vega-lite/build/src/channel.ScaleChannel ]:? vega-lite.vega-lite/build/src/scale.Scale}
    */ vegaDashLiteLib.vegaDashLiteLibStrings.ScaleIndex with js.Any
}
