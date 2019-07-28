package typings.vegaDashEmbed

import typings.std.Partial
import typings.vegaDashEmbed.vegaDashEmbedStrings.main
import typings.vegaDashEmbed.vegaDashEmbedStrings.raw
import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdata extends js.Object {
  val MAIN: main = js.native
  val RAW: raw = js.native
  def isInlineData(data: Partial[Data | VgData]): /* is vega-lite.vega-lite/build/src/data.InlineData */ Boolean = js.native
  def isNamedData(data: Partial[Data]): /* is vega-lite.vega-lite/build/src/data.NamedData */ Boolean = js.native
  def isUrlData(data: Partial[Data | VgData]): /* is vega-lite.vega-lite/build/src/data.UrlData */ Boolean = js.native
}

