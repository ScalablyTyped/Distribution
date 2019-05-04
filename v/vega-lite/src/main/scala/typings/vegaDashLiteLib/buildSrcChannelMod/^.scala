package typings
package vegaDashLiteLib.buildSrcChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/channel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CHANNELS: js.Array[Channel] = js.native
  val COLOR: vegaDashLiteLib.vegaDashLiteLibStrings.color = js.native
  val COLUMN: vegaDashLiteLib.vegaDashLiteLibStrings.column = js.native
  val DETAIL: vegaDashLiteLib.vegaDashLiteLibStrings.detail = js.native
  val FILL: vegaDashLiteLib.vegaDashLiteLibStrings.fill = js.native
  val GEOPOSITION_CHANNELS: js.Array[GeoPositionChannel] = js.native
  val GEOPOSITION_CHANNEL_INDEX: vegaDashLiteLib.buildSrcUtilMod.Flag[GeoPositionChannel] = js.native
  val HREF: vegaDashLiteLib.vegaDashLiteLibStrings.href = js.native
  val KEY: vegaDashLiteLib.vegaDashLiteLibStrings.key = js.native
  val LATITUDE: vegaDashLiteLib.vegaDashLiteLibStrings.latitude = js.native
  val LATITUDE2: vegaDashLiteLib.vegaDashLiteLibStrings.latitude2 = js.native
  val LONGITUDE: vegaDashLiteLib.vegaDashLiteLibStrings.longitude = js.native
  val LONGITUDE2: vegaDashLiteLib.vegaDashLiteLibStrings.longitude2 = js.native
  val NONPOSITION_CHANNELS: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size | vegaDashLiteLib.vegaDashLiteLibStrings.detail | vegaDashLiteLib.vegaDashLiteLibStrings.key | vegaDashLiteLib.vegaDashLiteLibStrings.tooltip | vegaDashLiteLib.vegaDashLiteLibStrings.href | vegaDashLiteLib.vegaDashLiteLibStrings.order
  ] = js.native
  val NONPOSITION_SCALE_CHANNELS: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size
  ] = js.native
  val OPACITY: vegaDashLiteLib.vegaDashLiteLibStrings.opacity = js.native
  val ORDER: vegaDashLiteLib.vegaDashLiteLibStrings.order = js.native
  val POSITION_SCALE_CHANNELS: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y
  ] = js.native
  val ROW: vegaDashLiteLib.vegaDashLiteLibStrings.row = js.native
  val SCALE_CHANNELS: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size
  ] = js.native
  val SHAPE: vegaDashLiteLib.vegaDashLiteLibStrings.shape = js.native
  val SINGLE_DEF_CHANNELS: js.Array[SingleDefChannel] = js.native
  val SIZE: vegaDashLiteLib.vegaDashLiteLibStrings.size = js.native
  val STROKE: vegaDashLiteLib.vegaDashLiteLibStrings.stroke = js.native
  val TEXT: vegaDashLiteLib.vegaDashLiteLibStrings.text = js.native
  val TOOLTIP: vegaDashLiteLib.vegaDashLiteLibStrings.tooltip = js.native
  val UNIT_CHANNELS: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y | vegaDashLiteLib.vegaDashLiteLibStrings.x2 | vegaDashLiteLib.vegaDashLiteLibStrings.y2 | vegaDashLiteLib.vegaDashLiteLibStrings.longitude | vegaDashLiteLib.vegaDashLiteLibStrings.latitude | vegaDashLiteLib.vegaDashLiteLibStrings.longitude2 | vegaDashLiteLib.vegaDashLiteLibStrings.latitude2 | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size | vegaDashLiteLib.vegaDashLiteLibStrings.detail | vegaDashLiteLib.vegaDashLiteLibStrings.key | vegaDashLiteLib.vegaDashLiteLibStrings.tooltip | vegaDashLiteLib.vegaDashLiteLibStrings.href | vegaDashLiteLib.vegaDashLiteLibStrings.order
  ] = js.native
  val X: vegaDashLiteLib.vegaDashLiteLibStrings.x = js.native
  val X2: vegaDashLiteLib.vegaDashLiteLibStrings.x2 = js.native
  val Y: vegaDashLiteLib.vegaDashLiteLibStrings.y = js.native
  val Y2: vegaDashLiteLib.vegaDashLiteLibStrings.y2 = js.native
  def getSupportedMark(channel: Channel): SupportedMark = js.native
  def isChannel(str: java.lang.String): /* is vega-lite.vega-lite/build/src/channel.Channel */ scala.Boolean = js.native
  def isColorChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ scala.Boolean = js.native
  def isScaleChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ scala.Boolean = js.native
  def rangeType(channel: Channel): vegaDashLiteLib.buildSrcCompileScaleTypeMod.RangeType = js.native
  def supportMark(channel: Channel, mark: vegaDashLiteLib.buildSrcMarkMod.Mark): scala.Boolean = js.native
}

