package typings
package vegaDashLiteLib.buildSrcEncodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/encoding", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def channelHasField(
    encoding: EncodingWithFacet[vegaDashLiteLib.buildSrcFielddefMod.Field],
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel
  ): scala.Boolean = js.native
  def fieldDefs(encoding: EncodingWithFacet[vegaDashLiteLib.buildSrcFielddefMod.Field]): js.Array[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field]
  ] = js.native
  def forEach(
    mapping: js.Any,
    f: js.Function2[
      /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
      /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEach(
    mapping: js.Any,
    f: js.Function2[
      /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
      /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
      scala.Unit
    ],
    thisArg: js.Any
  ): scala.Unit = js.native
  def isAggregate(encoding: EncodingWithFacet[vegaDashLiteLib.buildSrcFielddefMod.Field]): scala.Boolean = js.native
  def isRanged(encoding: EncodingWithFacet[_]): scala.Boolean = js.native
  def normalizeEncoding(encoding: Encoding[java.lang.String], mark: vegaDashLiteLib.buildSrcMarkMod.Mark): Encoding[java.lang.String] = js.native
  def reduce[T, U /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
    */ vegaDashLiteLib.vegaDashLiteLibStrings.reduce with js.Any */](
    mapping: U,
    f: js.Function3[
      /* acc */ js.Any, 
      /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
      /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
      U
    ],
    init: T
  ): js.Any = js.native
  def reduce[T, U /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
    */ vegaDashLiteLib.vegaDashLiteLibStrings.reduce with js.Any */](
    mapping: U,
    f: js.Function3[
      /* acc */ js.Any, 
      /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
      /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
      U
    ],
    init: T,
    thisArg: js.Any
  ): js.Any = js.native
}

