package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHANNELS extends js.Object {
  val CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.Channel]
  val COLOR: vegaDashEmbedLib.vegaDashEmbedLibStrings.color
  val COLUMN: vegaDashEmbedLib.vegaDashEmbedLibStrings.column
  val ChannelNs: Anon_COLOR
  val DETAIL: vegaDashEmbedLib.vegaDashEmbedLibStrings.detail
  val FILL: vegaDashEmbedLib.vegaDashEmbedLibStrings.fill
  val GEOPOSITION_CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.GeoPositionChannel]
  val GEOPOSITION_CHANNEL_INDEX: vegaDashLiteLib.buildSrcUtilMod.Flag[vegaDashLiteLib.buildSrcChannelMod.GeoPositionChannel]
  val HREF: vegaDashEmbedLib.vegaDashEmbedLibStrings.href
  val KEY: vegaDashEmbedLib.vegaDashEmbedLibStrings.key
  val LATITUDE: vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude
  val LATITUDE2: vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude2
  val LONGITUDE: vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude
  val LONGITUDE2: vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude2
  val NONPOSITION_CHANNELS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.text | vegaDashEmbedLib.vegaDashEmbedLibStrings.shape | vegaDashEmbedLib.vegaDashEmbedLibStrings.color | vegaDashEmbedLib.vegaDashEmbedLibStrings.fill | vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke | vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity | vegaDashEmbedLib.vegaDashEmbedLibStrings.size | vegaDashEmbedLib.vegaDashEmbedLibStrings.detail | vegaDashEmbedLib.vegaDashEmbedLibStrings.key | vegaDashEmbedLib.vegaDashEmbedLibStrings.tooltip | vegaDashEmbedLib.vegaDashEmbedLibStrings.href | vegaDashEmbedLib.vegaDashEmbedLibStrings.order
  ]
  val NONPOSITION_SCALE_CHANNELS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.shape | vegaDashEmbedLib.vegaDashEmbedLibStrings.color | vegaDashEmbedLib.vegaDashEmbedLibStrings.fill | vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke | vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity | vegaDashEmbedLib.vegaDashEmbedLibStrings.size
  ]
  val OPACITY: vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity
  val ORDER: vegaDashEmbedLib.vegaDashEmbedLibStrings.order
  val POSITION_SCALE_CHANNELS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.x | vegaDashEmbedLib.vegaDashEmbedLibStrings.y
  ]
  val ROW: vegaDashEmbedLib.vegaDashEmbedLibStrings.row
  val SCALE_CHANNELS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.shape | vegaDashEmbedLib.vegaDashEmbedLibStrings.x | vegaDashEmbedLib.vegaDashEmbedLibStrings.y | vegaDashEmbedLib.vegaDashEmbedLibStrings.color | vegaDashEmbedLib.vegaDashEmbedLibStrings.fill | vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke | vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity | vegaDashEmbedLib.vegaDashEmbedLibStrings.size
  ]
  val SHAPE: vegaDashEmbedLib.vegaDashEmbedLibStrings.shape
  val SINGLE_DEF_CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel]
  val SIZE: vegaDashEmbedLib.vegaDashEmbedLibStrings.size
  val STROKE: vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke
  val TEXT: vegaDashEmbedLib.vegaDashEmbedLibStrings.text
  val TOOLTIP: vegaDashEmbedLib.vegaDashEmbedLibStrings.tooltip
  val UNIT_CHANNELS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.text | vegaDashEmbedLib.vegaDashEmbedLibStrings.shape | vegaDashEmbedLib.vegaDashEmbedLibStrings.x | vegaDashEmbedLib.vegaDashEmbedLibStrings.y | vegaDashEmbedLib.vegaDashEmbedLibStrings.x2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.y2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude | vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude | vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.color | vegaDashEmbedLib.vegaDashEmbedLibStrings.fill | vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke | vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity | vegaDashEmbedLib.vegaDashEmbedLibStrings.size | vegaDashEmbedLib.vegaDashEmbedLibStrings.detail | vegaDashEmbedLib.vegaDashEmbedLibStrings.key | vegaDashEmbedLib.vegaDashEmbedLibStrings.tooltip | vegaDashEmbedLib.vegaDashEmbedLibStrings.href | vegaDashEmbedLib.vegaDashEmbedLibStrings.order
  ]
  val X: vegaDashEmbedLib.vegaDashEmbedLibStrings.x
  val X2: vegaDashEmbedLib.vegaDashEmbedLibStrings.x2
  val Y: vegaDashEmbedLib.vegaDashEmbedLibStrings.y
  val Y2: vegaDashEmbedLib.vegaDashEmbedLibStrings.y2
  def getSupportedMark(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcChannelMod.SupportedMark
  def isChannel(str: java.lang.String): /* is vega-lite.vega-lite/build/src/channel.Channel */ scala.Boolean
  def isColorChannel(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ scala.Boolean
  def isScaleChannel(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ scala.Boolean
  def rangeType(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcCompileScaleTypeMod.RangeType
  def supportMark(channel: vegaDashLiteLib.buildSrcChannelMod.Channel, mark: vegaDashLiteLib.buildSrcMarkMod.Mark): scala.Boolean
}

object Anon_CHANNELS {
  @scala.inline
  def apply(
    CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.Channel],
    COLOR: vegaDashEmbedLib.vegaDashEmbedLibStrings.color,
    COLUMN: vegaDashEmbedLib.vegaDashEmbedLibStrings.column,
    ChannelNs: Anon_COLOR,
    DETAIL: vegaDashEmbedLib.vegaDashEmbedLibStrings.detail,
    FILL: vegaDashEmbedLib.vegaDashEmbedLibStrings.fill,
    GEOPOSITION_CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.GeoPositionChannel],
    GEOPOSITION_CHANNEL_INDEX: vegaDashLiteLib.buildSrcUtilMod.Flag[vegaDashLiteLib.buildSrcChannelMod.GeoPositionChannel],
    HREF: vegaDashEmbedLib.vegaDashEmbedLibStrings.href,
    KEY: vegaDashEmbedLib.vegaDashEmbedLibStrings.key,
    LATITUDE: vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude,
    LATITUDE2: vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude2,
    LONGITUDE: vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude,
    LONGITUDE2: vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude2,
    NONPOSITION_CHANNELS: js.Array[
      vegaDashEmbedLib.vegaDashEmbedLibStrings.text | vegaDashEmbedLib.vegaDashEmbedLibStrings.shape | vegaDashEmbedLib.vegaDashEmbedLibStrings.color | vegaDashEmbedLib.vegaDashEmbedLibStrings.fill | vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke | vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity | vegaDashEmbedLib.vegaDashEmbedLibStrings.size | vegaDashEmbedLib.vegaDashEmbedLibStrings.detail | vegaDashEmbedLib.vegaDashEmbedLibStrings.key | vegaDashEmbedLib.vegaDashEmbedLibStrings.tooltip | vegaDashEmbedLib.vegaDashEmbedLibStrings.href | vegaDashEmbedLib.vegaDashEmbedLibStrings.order
    ],
    NONPOSITION_SCALE_CHANNELS: js.Array[
      vegaDashEmbedLib.vegaDashEmbedLibStrings.shape | vegaDashEmbedLib.vegaDashEmbedLibStrings.color | vegaDashEmbedLib.vegaDashEmbedLibStrings.fill | vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke | vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity | vegaDashEmbedLib.vegaDashEmbedLibStrings.size
    ],
    OPACITY: vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity,
    ORDER: vegaDashEmbedLib.vegaDashEmbedLibStrings.order,
    POSITION_SCALE_CHANNELS: js.Array[
      vegaDashEmbedLib.vegaDashEmbedLibStrings.x | vegaDashEmbedLib.vegaDashEmbedLibStrings.y
    ],
    ROW: vegaDashEmbedLib.vegaDashEmbedLibStrings.row,
    SCALE_CHANNELS: js.Array[
      vegaDashEmbedLib.vegaDashEmbedLibStrings.shape | vegaDashEmbedLib.vegaDashEmbedLibStrings.x | vegaDashEmbedLib.vegaDashEmbedLibStrings.y | vegaDashEmbedLib.vegaDashEmbedLibStrings.color | vegaDashEmbedLib.vegaDashEmbedLibStrings.fill | vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke | vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity | vegaDashEmbedLib.vegaDashEmbedLibStrings.size
    ],
    SHAPE: vegaDashEmbedLib.vegaDashEmbedLibStrings.shape,
    SINGLE_DEF_CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel],
    SIZE: vegaDashEmbedLib.vegaDashEmbedLibStrings.size,
    STROKE: vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke,
    TEXT: vegaDashEmbedLib.vegaDashEmbedLibStrings.text,
    TOOLTIP: vegaDashEmbedLib.vegaDashEmbedLibStrings.tooltip,
    UNIT_CHANNELS: js.Array[
      vegaDashEmbedLib.vegaDashEmbedLibStrings.text | vegaDashEmbedLib.vegaDashEmbedLibStrings.shape | vegaDashEmbedLib.vegaDashEmbedLibStrings.x | vegaDashEmbedLib.vegaDashEmbedLibStrings.y | vegaDashEmbedLib.vegaDashEmbedLibStrings.x2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.y2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude | vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude | vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.color | vegaDashEmbedLib.vegaDashEmbedLibStrings.fill | vegaDashEmbedLib.vegaDashEmbedLibStrings.stroke | vegaDashEmbedLib.vegaDashEmbedLibStrings.opacity | vegaDashEmbedLib.vegaDashEmbedLibStrings.size | vegaDashEmbedLib.vegaDashEmbedLibStrings.detail | vegaDashEmbedLib.vegaDashEmbedLibStrings.key | vegaDashEmbedLib.vegaDashEmbedLibStrings.tooltip | vegaDashEmbedLib.vegaDashEmbedLibStrings.href | vegaDashEmbedLib.vegaDashEmbedLibStrings.order
    ],
    X: vegaDashEmbedLib.vegaDashEmbedLibStrings.x,
    X2: vegaDashEmbedLib.vegaDashEmbedLibStrings.x2,
    Y: vegaDashEmbedLib.vegaDashEmbedLibStrings.y,
    Y2: vegaDashEmbedLib.vegaDashEmbedLibStrings.y2,
    getSupportedMark: vegaDashLiteLib.buildSrcChannelMod.Channel => vegaDashLiteLib.buildSrcChannelMod.SupportedMark,
    isChannel: java.lang.String => /* is vega-lite.vega-lite/build/src/channel.Channel */ scala.Boolean,
    isColorChannel: vegaDashLiteLib.buildSrcChannelMod.Channel => /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ scala.Boolean,
    isScaleChannel: vegaDashLiteLib.buildSrcChannelMod.Channel => /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ scala.Boolean,
    rangeType: vegaDashLiteLib.buildSrcChannelMod.Channel => vegaDashLiteLib.buildSrcCompileScaleTypeMod.RangeType,
    supportMark: (vegaDashLiteLib.buildSrcChannelMod.Channel, vegaDashLiteLib.buildSrcMarkMod.Mark) => scala.Boolean
  ): Anon_CHANNELS = {
    val __obj = js.Dynamic.literal(CHANNELS = CHANNELS, COLOR = COLOR, COLUMN = COLUMN, ChannelNs = ChannelNs, DETAIL = DETAIL, FILL = FILL, GEOPOSITION_CHANNELS = GEOPOSITION_CHANNELS, GEOPOSITION_CHANNEL_INDEX = GEOPOSITION_CHANNEL_INDEX, HREF = HREF, KEY = KEY, LATITUDE = LATITUDE, LATITUDE2 = LATITUDE2, LONGITUDE = LONGITUDE, LONGITUDE2 = LONGITUDE2, NONPOSITION_CHANNELS = NONPOSITION_CHANNELS, NONPOSITION_SCALE_CHANNELS = NONPOSITION_SCALE_CHANNELS, OPACITY = OPACITY, ORDER = ORDER, POSITION_SCALE_CHANNELS = POSITION_SCALE_CHANNELS, ROW = ROW, SCALE_CHANNELS = SCALE_CHANNELS, SHAPE = SHAPE, SINGLE_DEF_CHANNELS = SINGLE_DEF_CHANNELS, SIZE = SIZE, STROKE = STROKE, TEXT = TEXT, TOOLTIP = TOOLTIP, UNIT_CHANNELS = UNIT_CHANNELS, X = X, X2 = X2, Y = Y, Y2 = Y2, getSupportedMark = js.Any.fromFunction1(getSupportedMark), isChannel = js.Any.fromFunction1(isChannel), isColorChannel = js.Any.fromFunction1(isColorChannel), isScaleChannel = js.Any.fromFunction1(isScaleChannel), rangeType = js.Any.fromFunction1(rangeType), supportMark = js.Any.fromFunction2(supportMark))
  
    __obj.asInstanceOf[Anon_CHANNELS]
  }
}

