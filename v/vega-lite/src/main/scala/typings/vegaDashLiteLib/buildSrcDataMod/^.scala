package typings
package vegaDashLiteLib.buildSrcDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MAIN: vegaDashLiteLib.vegaDashLiteLibStrings.main = js.native
  val RAW: vegaDashLiteLib.vegaDashLiteLibStrings.raw = js.native
  def isInlineData(data: stdLib.Partial[Data | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData]): /* is vega-lite.vega-lite/build/src/data.InlineData */ scala.Boolean = js.native
  def isNamedData(data: stdLib.Partial[Data]): /* is vega-lite.vega-lite/build/src/data.NamedData */ scala.Boolean = js.native
  def isUrlData(data: stdLib.Partial[Data | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData]): /* is vega-lite.vega-lite/build/src/data.UrlData */ scala.Boolean = js.native
}

