package typings.vegaDashLite.buildSrcEncodingMod

import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcFielddefMod.Field
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import typings.vegaDashLite.buildSrcMarkMod.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/encoding", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def channelHasField(encoding: EncodingWithFacet[Field], channel: Channel): Boolean = js.native
  def fieldDefs(encoding: EncodingWithFacet[Field]): js.Array[FieldDef[Field]] = js.native
  def forEach(mapping: js.Any, f: js.Function2[/* fd */ FieldDef[String], /* c */ Channel, Unit]): Unit = js.native
  def forEach(
    mapping: js.Any,
    f: js.Function2[/* fd */ FieldDef[String], /* c */ Channel, Unit],
    thisArg: js.Any
  ): Unit = js.native
  def isAggregate(encoding: EncodingWithFacet[Field]): Boolean = js.native
  def isRanged(encoding: EncodingWithFacet[_]): Boolean = js.native
  def normalizeEncoding(encoding: Encoding[String], mark: Mark): Encoding[String] = js.native
  def reduce[T, U /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
    */ typings.vegaDashLite.vegaDashLiteStrings.reduce with js.Any */](
    mapping: U,
    f: js.Function3[/* acc */ js.Any, /* fd */ FieldDef[String], /* c */ Channel, U],
    init: T
  ): js.Any = js.native
  def reduce[T, U /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
    */ typings.vegaDashLite.vegaDashLiteStrings.reduce with js.Any */](
    mapping: U,
    f: js.Function3[/* acc */ js.Any, /* fd */ FieldDef[String], /* c */ Channel, U],
    init: T,
    thisArg: js.Any
  ): js.Any = js.native
}

