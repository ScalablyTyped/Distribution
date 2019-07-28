package typings.vegaDashLite.buildSrcDataMod

import typings.std.Partial
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgData
import typings.vegaDashLite.vegaDashLiteStrings.main
import typings.vegaDashLite.vegaDashLiteStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MAIN: main = js.native
  val RAW: raw = js.native
  def isInlineData(data: Partial[Data | VgData]): /* is vega-lite.vega-lite/build/src/data.InlineData */ Boolean = js.native
  def isNamedData(data: Partial[Data]): /* is vega-lite.vega-lite/build/src/data.NamedData */ Boolean = js.native
  def isUrlData(data: Partial[Data | VgData]): /* is vega-lite.vega-lite/build/src/data.UrlData */ Boolean = js.native
}

