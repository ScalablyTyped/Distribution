package typings.vegaDashLite.buildSrcCompileModelMod

import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import typings.vegaDashLite.buildSrcFielddefMod.FieldRefOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/model", "ModelWithField")
@js.native
abstract class ModelWithField () extends Model {
  def channelHasField(channel: Channel): Boolean = js.native
  def fieldDef(channel: SingleDefChannel): FieldDef[String] = js.native
  def forEachFieldDef(f: js.Function2[/* fd */ FieldDef[String], /* c */ Channel, Unit]): Unit = js.native
  def forEachFieldDef(f: js.Function2[/* fd */ FieldDef[String], /* c */ Channel, Unit], t: js.Any): Unit = js.native
  /* protected */ def getMapping(): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
    */ typings.vegaDashLite.vegaDashLiteStrings.ModelWithField with js.Any = js.native
  def reduceFieldDef[T, U](f: js.Function3[/* acc */ U, /* fd */ FieldDef[String], /* c */ Channel, U], init: T): js.Any = js.native
  def reduceFieldDef[T, U](f: js.Function3[/* acc */ U, /* fd */ FieldDef[String], /* c */ Channel, U], init: T, t: js.Any): js.Any = js.native
  /** Get "field" reference for vega */
  def vgField(channel: SingleDefChannel): String = js.native
  def vgField(channel: SingleDefChannel, opt: FieldRefOption): String = js.native
}

