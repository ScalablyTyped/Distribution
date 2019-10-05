package typings.vegaDashTypings.typesRuntimeMod

import typings.std.Date
import typings.vegaDashTypings.typesSpecDataMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "read")
@js.native
object read extends js.Object {
  def apply(data: String, schema: Format): js.Array[js.Object] = js.native
  def apply(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, Date]): js.Array[js.Object] = js.native
}

