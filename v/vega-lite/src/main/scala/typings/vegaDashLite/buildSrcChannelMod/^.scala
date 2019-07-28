package typings.vegaDashLite.buildSrcChannelMod

import typings.vegaDashLite.buildSrcCompileScaleTypeMod.RangeType
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcUtilMod.Flag
import typings.vegaDashLite.vegaDashLiteStrings.color
import typings.vegaDashLite.vegaDashLiteStrings.column
import typings.vegaDashLite.vegaDashLiteStrings.detail
import typings.vegaDashLite.vegaDashLiteStrings.fill
import typings.vegaDashLite.vegaDashLiteStrings.href
import typings.vegaDashLite.vegaDashLiteStrings.key
import typings.vegaDashLite.vegaDashLiteStrings.latitude
import typings.vegaDashLite.vegaDashLiteStrings.latitude2
import typings.vegaDashLite.vegaDashLiteStrings.longitude
import typings.vegaDashLite.vegaDashLiteStrings.longitude2
import typings.vegaDashLite.vegaDashLiteStrings.opacity
import typings.vegaDashLite.vegaDashLiteStrings.order
import typings.vegaDashLite.vegaDashLiteStrings.row
import typings.vegaDashLite.vegaDashLiteStrings.shape
import typings.vegaDashLite.vegaDashLiteStrings.size
import typings.vegaDashLite.vegaDashLiteStrings.stroke
import typings.vegaDashLite.vegaDashLiteStrings.text
import typings.vegaDashLite.vegaDashLiteStrings.tooltip
import typings.vegaDashLite.vegaDashLiteStrings.x
import typings.vegaDashLite.vegaDashLiteStrings.x2
import typings.vegaDashLite.vegaDashLiteStrings.y
import typings.vegaDashLite.vegaDashLiteStrings.y2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/channel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CHANNELS: js.Array[Channel] = js.native
  val COLOR: color = js.native
  val COLUMN: column = js.native
  val DETAIL: detail = js.native
  val FILL: fill = js.native
  val GEOPOSITION_CHANNELS: js.Array[GeoPositionChannel] = js.native
  val GEOPOSITION_CHANNEL_INDEX: Flag[GeoPositionChannel] = js.native
  val HREF: href = js.native
  val KEY: key = js.native
  val LATITUDE: latitude = js.native
  val LATITUDE2: latitude2 = js.native
  val LONGITUDE: longitude = js.native
  val LONGITUDE2: longitude2 = js.native
  val NONPOSITION_CHANNELS: js.Array[
    text | shape | color | fill | stroke | opacity | size | detail | key | tooltip | href | order
  ] = js.native
  val NONPOSITION_SCALE_CHANNELS: js.Array[shape | color | fill | stroke | opacity | size] = js.native
  val OPACITY: opacity = js.native
  val ORDER: order = js.native
  val POSITION_SCALE_CHANNELS: js.Array[x | y] = js.native
  val ROW: row = js.native
  val SCALE_CHANNELS: js.Array[shape | x | y | color | fill | stroke | opacity | size] = js.native
  val SHAPE: shape = js.native
  val SINGLE_DEF_CHANNELS: js.Array[SingleDefChannel] = js.native
  val SIZE: size = js.native
  val STROKE: stroke = js.native
  val TEXT: text = js.native
  val TOOLTIP: tooltip = js.native
  val UNIT_CHANNELS: js.Array[
    text | shape | x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | color | fill | stroke | opacity | size | detail | key | tooltip | href | order
  ] = js.native
  val X: x = js.native
  val X2: x2 = js.native
  val Y: y = js.native
  val Y2: y2 = js.native
  def getSupportedMark(channel: Channel): SupportedMark = js.native
  def isChannel(str: String): /* is vega-lite.vega-lite/build/src/channel.Channel */ Boolean = js.native
  def isColorChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ Boolean = js.native
  def isScaleChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ Boolean = js.native
  def rangeType(channel: Channel): RangeType = js.native
  def supportMark(channel: Channel, mark: Mark): Boolean = js.native
}

