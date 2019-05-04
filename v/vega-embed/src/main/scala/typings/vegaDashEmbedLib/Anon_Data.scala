package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Data extends js.Object {
  val MAIN: vegaDashEmbedLib.vegaDashEmbedLibStrings.main = js.native
  val RAW: vegaDashEmbedLib.vegaDashEmbedLibStrings.raw = js.native
  def isInlineData(
    data: stdLib.Partial[
      vegaDashLiteLib.buildSrcDataMod.Data | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData
    ]
  ): /* is vega-lite.vega-lite/build/src/data.InlineData */ scala.Boolean = js.native
  def isNamedData(data: stdLib.Partial[vegaDashLiteLib.buildSrcDataMod.Data]): /* is vega-lite.vega-lite/build/src/data.NamedData */ scala.Boolean = js.native
  def isUrlData(
    data: stdLib.Partial[
      vegaDashLiteLib.buildSrcDataMod.Data | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData
    ]
  ): /* is vega-lite.vega-lite/build/src/data.UrlData */ scala.Boolean = js.native
}

