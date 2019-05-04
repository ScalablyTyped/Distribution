package typings
package vegaDashLiteLib.buildSrcCompileModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/model", "ModelWithField")
@js.native
abstract class ModelWithField () extends Model {
  def channelHasField(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): scala.Boolean = js.native
  def fieldDef(channel: vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel): vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String] = js.native
  def forEachFieldDef(
    f: js.Function2[
      /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
      /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEachFieldDef(
    f: js.Function2[
      /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
      /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
      scala.Unit
    ],
    t: js.Any
  ): scala.Unit = js.native
  /* protected */ def getMapping(): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
    */ vegaDashLiteLib.vegaDashLiteLibStrings.ModelWithField with js.Any = js.native
  def reduceFieldDef[T, U](
    f: js.Function3[
      /* acc */ U, 
      /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
      /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
      U
    ],
    init: T
  ): js.Any = js.native
  def reduceFieldDef[T, U](
    f: js.Function3[
      /* acc */ U, 
      /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
      /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
      U
    ],
    init: T,
    t: js.Any
  ): js.Any = js.native
  /** Get "field" reference for vega */
  def vgField(channel: vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel): java.lang.String = js.native
  def vgField(
    channel: vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel,
    opt: vegaDashLiteLib.buildSrcFielddefMod.FieldRefOption
  ): java.lang.String = js.native
}

