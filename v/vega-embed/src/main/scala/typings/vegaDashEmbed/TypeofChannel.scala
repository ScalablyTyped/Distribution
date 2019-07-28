package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.color
import typings.vegaDashEmbed.vegaDashEmbedStrings.column
import typings.vegaDashEmbed.vegaDashEmbedStrings.detail
import typings.vegaDashEmbed.vegaDashEmbedStrings.fill
import typings.vegaDashEmbed.vegaDashEmbedStrings.href
import typings.vegaDashEmbed.vegaDashEmbedStrings.key
import typings.vegaDashEmbed.vegaDashEmbedStrings.latitude
import typings.vegaDashEmbed.vegaDashEmbedStrings.latitude2
import typings.vegaDashEmbed.vegaDashEmbedStrings.longitude
import typings.vegaDashEmbed.vegaDashEmbedStrings.longitude2
import typings.vegaDashEmbed.vegaDashEmbedStrings.opacity
import typings.vegaDashEmbed.vegaDashEmbedStrings.order
import typings.vegaDashEmbed.vegaDashEmbedStrings.row
import typings.vegaDashEmbed.vegaDashEmbedStrings.shape
import typings.vegaDashEmbed.vegaDashEmbedStrings.size
import typings.vegaDashEmbed.vegaDashEmbedStrings.stroke
import typings.vegaDashEmbed.vegaDashEmbedStrings.text
import typings.vegaDashEmbed.vegaDashEmbedStrings.tooltip
import typings.vegaDashEmbed.vegaDashEmbedStrings.x
import typings.vegaDashEmbed.vegaDashEmbedStrings.x2
import typings.vegaDashEmbed.vegaDashEmbedStrings.y
import typings.vegaDashEmbed.vegaDashEmbedStrings.y2
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcChannelMod.GeoPositionChannel
import typings.vegaDashLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaDashLite.buildSrcChannelMod.SupportedMark
import typings.vegaDashLite.buildSrcCompileScaleTypeMod.RangeType
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcUtilMod.Flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofChannel extends js.Object {
  val COLOR: color
  val COLUMN: column
  val DETAIL: detail
  val FILL: fill
  val HREF: href
  val KEY: key
  val LATITUDE: latitude
  val LATITUDE2: latitude2
  val LONGITUDE: longitude
  val LONGITUDE2: longitude2
  val OPACITY: opacity
  val ORDER: order
  val ROW: row
  val SHAPE: shape
  val SIZE: size
  val STROKE: stroke
  val TEXT: text
  val TOOLTIP: tooltip
  val X: x
  val X2: x2
  val Y: y
  val Y2: y2
}

trait Typeofchannel extends js.Object {
  val CHANNELS: js.Array[Channel]
  val COLOR: color
  val COLUMN: column
  val ChannelNs: TypeofChannel
  val DETAIL: detail
  val FILL: fill
  val GEOPOSITION_CHANNELS: js.Array[GeoPositionChannel]
  val GEOPOSITION_CHANNEL_INDEX: Flag[GeoPositionChannel]
  val HREF: href
  val KEY: key
  val LATITUDE: latitude
  val LATITUDE2: latitude2
  val LONGITUDE: longitude
  val LONGITUDE2: longitude2
  val NONPOSITION_CHANNELS: js.Array[
    text | shape | color | fill | stroke | opacity | size | detail | key | tooltip | href | order
  ]
  val NONPOSITION_SCALE_CHANNELS: js.Array[shape | color | fill | stroke | opacity | size]
  val OPACITY: opacity
  val ORDER: order
  val POSITION_SCALE_CHANNELS: js.Array[x | y]
  val ROW: row
  val SCALE_CHANNELS: js.Array[shape | x | y | color | fill | stroke | opacity | size]
  val SHAPE: shape
  val SINGLE_DEF_CHANNELS: js.Array[SingleDefChannel]
  val SIZE: size
  val STROKE: stroke
  val TEXT: text
  val TOOLTIP: tooltip
  val UNIT_CHANNELS: js.Array[
    text | shape | x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | color | fill | stroke | opacity | size | detail | key | tooltip | href | order
  ]
  val X: x
  val X2: x2
  val Y: y
  val Y2: y2
  def getSupportedMark(channel: Channel): SupportedMark
  def isChannel(str: String): /* is vega-lite.vega-lite/build/src/channel.Channel */ Boolean
  def isColorChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ Boolean
  def isScaleChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ Boolean
  def rangeType(channel: Channel): RangeType
  def supportMark(channel: Channel, mark: Mark): Boolean
}

object TypeofChannel {
  @scala.inline
  def apply(
    COLOR: color,
    COLUMN: column,
    DETAIL: detail,
    FILL: fill,
    HREF: href,
    KEY: key,
    LATITUDE: latitude,
    LATITUDE2: latitude2,
    LONGITUDE: longitude,
    LONGITUDE2: longitude2,
    OPACITY: opacity,
    ORDER: order,
    ROW: row,
    SHAPE: shape,
    SIZE: size,
    STROKE: stroke,
    TEXT: text,
    TOOLTIP: tooltip,
    X: x,
    X2: x2,
    Y: y,
    Y2: y2
  ): TypeofChannel = {
    val __obj = js.Dynamic.literal(COLOR = COLOR, COLUMN = COLUMN, DETAIL = DETAIL, FILL = FILL, HREF = HREF, KEY = KEY, LATITUDE = LATITUDE, LATITUDE2 = LATITUDE2, LONGITUDE = LONGITUDE, LONGITUDE2 = LONGITUDE2, OPACITY = OPACITY, ORDER = ORDER, ROW = ROW, SHAPE = SHAPE, SIZE = SIZE, STROKE = STROKE, TEXT = TEXT, TOOLTIP = TOOLTIP, X = X, X2 = X2, Y = Y, Y2 = Y2)
  
    __obj.asInstanceOf[TypeofChannel]
  }
}

object Typeofchannel {
  @scala.inline
  def apply(
    CHANNELS: js.Array[Channel],
    COLOR: color,
    COLUMN: column,
    ChannelNs: TypeofChannel,
    DETAIL: detail,
    FILL: fill,
    GEOPOSITION_CHANNELS: js.Array[GeoPositionChannel],
    GEOPOSITION_CHANNEL_INDEX: Flag[GeoPositionChannel],
    HREF: href,
    KEY: key,
    LATITUDE: latitude,
    LATITUDE2: latitude2,
    LONGITUDE: longitude,
    LONGITUDE2: longitude2,
    NONPOSITION_CHANNELS: js.Array[
      text | shape | color | fill | stroke | opacity | size | detail | key | tooltip | href | order
    ],
    NONPOSITION_SCALE_CHANNELS: js.Array[shape | color | fill | stroke | opacity | size],
    OPACITY: opacity,
    ORDER: order,
    POSITION_SCALE_CHANNELS: js.Array[x | y],
    ROW: row,
    SCALE_CHANNELS: js.Array[shape | x | y | color | fill | stroke | opacity | size],
    SHAPE: shape,
    SINGLE_DEF_CHANNELS: js.Array[SingleDefChannel],
    SIZE: size,
    STROKE: stroke,
    TEXT: text,
    TOOLTIP: tooltip,
    UNIT_CHANNELS: js.Array[
      text | shape | x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | color | fill | stroke | opacity | size | detail | key | tooltip | href | order
    ],
    X: x,
    X2: x2,
    Y: y,
    Y2: y2,
    getSupportedMark: Channel => SupportedMark,
    isChannel: String => /* is vega-lite.vega-lite/build/src/channel.Channel */ Boolean,
    isColorChannel: Channel => /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ Boolean,
    isScaleChannel: Channel => /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ Boolean,
    rangeType: Channel => RangeType,
    supportMark: (Channel, Mark) => Boolean
  ): Typeofchannel = {
    val __obj = js.Dynamic.literal(CHANNELS = CHANNELS, COLOR = COLOR, COLUMN = COLUMN, ChannelNs = ChannelNs, DETAIL = DETAIL, FILL = FILL, GEOPOSITION_CHANNELS = GEOPOSITION_CHANNELS, GEOPOSITION_CHANNEL_INDEX = GEOPOSITION_CHANNEL_INDEX, HREF = HREF, KEY = KEY, LATITUDE = LATITUDE, LATITUDE2 = LATITUDE2, LONGITUDE = LONGITUDE, LONGITUDE2 = LONGITUDE2, NONPOSITION_CHANNELS = NONPOSITION_CHANNELS, NONPOSITION_SCALE_CHANNELS = NONPOSITION_SCALE_CHANNELS, OPACITY = OPACITY, ORDER = ORDER, POSITION_SCALE_CHANNELS = POSITION_SCALE_CHANNELS, ROW = ROW, SCALE_CHANNELS = SCALE_CHANNELS, SHAPE = SHAPE, SINGLE_DEF_CHANNELS = SINGLE_DEF_CHANNELS, SIZE = SIZE, STROKE = STROKE, TEXT = TEXT, TOOLTIP = TOOLTIP, UNIT_CHANNELS = UNIT_CHANNELS, X = X, X2 = X2, Y = Y, Y2 = Y2, getSupportedMark = js.Any.fromFunction1(getSupportedMark), isChannel = js.Any.fromFunction1(isChannel), isColorChannel = js.Any.fromFunction1(isColorChannel), isScaleChannel = js.Any.fromFunction1(isScaleChannel), rangeType = js.Any.fromFunction1(rangeType), supportMark = js.Any.fromFunction2(supportMark))
  
    __obj.asInstanceOf[Typeofchannel]
  }
}

