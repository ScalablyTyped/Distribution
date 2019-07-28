package typings.vegaDashLite.buildSrcLegendMod

import typings.vegaDashLite.vegaDashLiteStrings.`type`
import typings.vegaDashLite.vegaDashLiteStrings.encode
import typings.vegaDashLite.vegaDashLiteStrings.entryPadding
import typings.vegaDashLite.vegaDashLiteStrings.fill
import typings.vegaDashLite.vegaDashLiteStrings.format
import typings.vegaDashLite.vegaDashLiteStrings.offset
import typings.vegaDashLite.vegaDashLiteStrings.opacity
import typings.vegaDashLite.vegaDashLiteStrings.orient
import typings.vegaDashLite.vegaDashLiteStrings.padding
import typings.vegaDashLite.vegaDashLiteStrings.shape
import typings.vegaDashLite.vegaDashLiteStrings.size
import typings.vegaDashLite.vegaDashLiteStrings.stroke
import typings.vegaDashLite.vegaDashLiteStrings.tickCount
import typings.vegaDashLite.vegaDashLiteStrings.title
import typings.vegaDashLite.vegaDashLiteStrings.values
import typings.vegaDashLite.vegaDashLiteStrings.zindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/legend", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LEGEND_PROPERTIES: js.Array[
    title | padding | `type` | orient | zindex | tickCount | format | values | offset | entryPadding
  ] = js.native
  val VG_LEGEND_PROPERTIES: js.Array[
    title | padding | `type` | shape | orient | zindex | tickCount | format | values | offset | encode | fill | stroke | opacity | size | entryPadding
  ] = js.native
  val defaultLegendConfig: LegendConfig = js.native
}

