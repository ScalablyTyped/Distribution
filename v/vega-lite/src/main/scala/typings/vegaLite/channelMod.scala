package typings.vegaLite

import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.typeMod.RangeType
import typings.vegaLite.vegaLiteNumbers.`1`
import typings.vegaLite.vegaLiteStrings.always
import typings.vegaLite.vegaLiteStrings.angle
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaLiteStrings.color
import typings.vegaLite.vegaLiteStrings.column
import typings.vegaLite.vegaLiteStrings.description
import typings.vegaLite.vegaLiteStrings.detail
import typings.vegaLite.vegaLiteStrings.endAngle
import typings.vegaLite.vegaLiteStrings.facet
import typings.vegaLite.vegaLiteStrings.fill
import typings.vegaLite.vegaLiteStrings.fillOpacity
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.href
import typings.vegaLite.vegaLiteStrings.innerRadius
import typings.vegaLite.vegaLiteStrings.key
import typings.vegaLite.vegaLiteStrings.latitude
import typings.vegaLite.vegaLiteStrings.latitude2
import typings.vegaLite.vegaLiteStrings.longitude
import typings.vegaLite.vegaLiteStrings.longitude2
import typings.vegaLite.vegaLiteStrings.opacity
import typings.vegaLite.vegaLiteStrings.order
import typings.vegaLite.vegaLiteStrings.outerRadius
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.radius2
import typings.vegaLite.vegaLiteStrings.radius2Offset
import typings.vegaLite.vegaLiteStrings.radiusOffset
import typings.vegaLite.vegaLiteStrings.row
import typings.vegaLite.vegaLiteStrings.shape
import typings.vegaLite.vegaLiteStrings.size
import typings.vegaLite.vegaLiteStrings.startAngle
import typings.vegaLite.vegaLiteStrings.stroke
import typings.vegaLite.vegaLiteStrings.strokeDash
import typings.vegaLite.vegaLiteStrings.strokeOpacity
import typings.vegaLite.vegaLiteStrings.strokeWidth
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.theta2
import typings.vegaLite.vegaLiteStrings.theta2Offset
import typings.vegaLite.vegaLiteStrings.thetaOffset
import typings.vegaLite.vegaLiteStrings.tooltip
import typings.vegaLite.vegaLiteStrings.url
import typings.vegaLite.vegaLiteStrings.width
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.x2
import typings.vegaLite.vegaLiteStrings.x2Offset
import typings.vegaLite.vegaLiteStrings.xOffset
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaLiteStrings.y2
import typings.vegaLite.vegaLiteStrings.y2Offset
import typings.vegaLite.vegaLiteStrings.yOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("vega-lite/build/src/channel", "ANGLE")
  @js.native
  val ANGLE: angle = js.native
  
  @JSImport("vega-lite/build/src/channel", "CHANNELS")
  @js.native
  val CHANNELS: js.Array[ExtendedChannel] = js.native
  
  @JSImport("vega-lite/build/src/channel", "COLOR")
  @js.native
  val COLOR: color = js.native
  
  @JSImport("vega-lite/build/src/channel", "COLUMN")
  @js.native
  val COLUMN: column = js.native
  
  @JSImport("vega-lite/build/src/channel", "DESCRIPTION")
  @js.native
  val DESCRIPTION: description = js.native
  
  @JSImport("vega-lite/build/src/channel", "DETAIL")
  @js.native
  val DETAIL: detail = js.native
  
  @JSImport("vega-lite/build/src/channel", "FACET")
  @js.native
  val FACET: facet = js.native
  
  @JSImport("vega-lite/build/src/channel", "FACET_CHANNELS")
  @js.native
  val FACET_CHANNELS: js.Array[facet | row | column] = js.native
  
  @JSImport("vega-lite/build/src/channel", "FILL")
  @js.native
  val FILL: fill = js.native
  
  @JSImport("vega-lite/build/src/channel", "FILLOPACITY")
  @js.native
  val FILLOPACITY: fillOpacity = js.native
  
  @JSImport("vega-lite/build/src/channel", "GEOPOSITION_CHANNELS")
  @js.native
  val GEOPOSITION_CHANNELS: js.Array[longitude | latitude | longitude2 | latitude2] = js.native
  
  @JSImport("vega-lite/build/src/channel", "HREF")
  @js.native
  val HREF: href = js.native
  
  @JSImport("vega-lite/build/src/channel", "KEY")
  @js.native
  val KEY: key = js.native
  
  @JSImport("vega-lite/build/src/channel", "LATITUDE")
  @js.native
  val LATITUDE: latitude = js.native
  
  @JSImport("vega-lite/build/src/channel", "LATITUDE2")
  @js.native
  val LATITUDE2: latitude2 = js.native
  
  @JSImport("vega-lite/build/src/channel", "LONGITUDE")
  @js.native
  val LONGITUDE: longitude = js.native
  
  @JSImport("vega-lite/build/src/channel", "LONGITUDE2")
  @js.native
  val LONGITUDE2: longitude2 = js.native
  
  @JSImport("vega-lite/build/src/channel", "NONPOSITION_CHANNELS")
  @js.native
  val NONPOSITION_CHANNELS: js.Array[
    text | fill | stroke | color | shape | description | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | detail | key | tooltip | href | url | order
  ] = js.native
  
  @JSImport("vega-lite/build/src/channel", "NONPOSITION_SCALE_CHANNELS")
  @js.native
  val NONPOSITION_SCALE_CHANNELS: js.Array[
    fill | stroke | color | shape | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle
  ] = js.native
  
  @JSImport("vega-lite/build/src/channel", "OPACITY")
  @js.native
  val OPACITY: opacity = js.native
  
  @JSImport("vega-lite/build/src/channel", "ORDER")
  @js.native
  val ORDER: order = js.native
  
  @JSImport("vega-lite/build/src/channel", "POLAR_POSITION_SCALE_CHANNELS")
  @js.native
  val POLAR_POSITION_SCALE_CHANNELS: js.Array[theta | radius] = js.native
  
  object POLAR_POSITION_SCALE_CHANNEL_INDEX {
    
    @JSImport("vega-lite/build/src/channel", "POLAR_POSITION_SCALE_CHANNEL_INDEX.radius")
    @js.native
    val radius: `1` = js.native
    
    @JSImport("vega-lite/build/src/channel", "POLAR_POSITION_SCALE_CHANNEL_INDEX.theta")
    @js.native
    val theta: `1` = js.native
  }
  
  @JSImport("vega-lite/build/src/channel", "POSITION_SCALE_CHANNELS")
  @js.native
  val POSITION_SCALE_CHANNELS: js.Array[x | y] = js.native
  
  object POSITION_SCALE_CHANNEL_INDEX {
    
    @JSImport("vega-lite/build/src/channel", "POSITION_SCALE_CHANNEL_INDEX.x")
    @js.native
    val x: `1` = js.native
    
    @JSImport("vega-lite/build/src/channel", "POSITION_SCALE_CHANNEL_INDEX.y")
    @js.native
    val y: `1` = js.native
  }
  
  @JSImport("vega-lite/build/src/channel", "RADIUS")
  @js.native
  val RADIUS: radius = js.native
  
  @JSImport("vega-lite/build/src/channel", "RADIUS2")
  @js.native
  val RADIUS2: radius2 = js.native
  
  @JSImport("vega-lite/build/src/channel", "ROW")
  @js.native
  val ROW: row = js.native
  
  @JSImport("vega-lite/build/src/channel", "SCALE_CHANNELS")
  @js.native
  val SCALE_CHANNELS: js.Array[
    fill | stroke | color | shape | x | y | theta | radius | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle
  ] = js.native
  
  @JSImport("vega-lite/build/src/channel", "SECONDARY_RANGE_CHANNEL")
  @js.native
  val SECONDARY_RANGE_CHANNEL: js.Array[SecondaryRangeChannel] = js.native
  
  @JSImport("vega-lite/build/src/channel", "SHAPE")
  @js.native
  val SHAPE: shape = js.native
  
  @JSImport("vega-lite/build/src/channel", "SINGLE_DEF_CHANNELS")
  @js.native
  val SINGLE_DEF_CHANNELS: js.Array[
    text | fill | stroke | color | shape | description | x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | theta | theta2 | radius | radius2 | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | key | href | url | facet | row | column
  ] = js.native
  
  @JSImport("vega-lite/build/src/channel", "SINGLE_DEF_UNIT_CHANNELS")
  @js.native
  val SINGLE_DEF_UNIT_CHANNELS: js.Array[
    text | fill | stroke | color | shape | description | x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | theta | theta2 | radius | radius2 | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | key | href | url
  ] = js.native
  
  @JSImport("vega-lite/build/src/channel", "SIZE")
  @js.native
  val SIZE: size = js.native
  
  @JSImport("vega-lite/build/src/channel", "STROKE")
  @js.native
  val STROKE: stroke = js.native
  
  @JSImport("vega-lite/build/src/channel", "STROKEDASH")
  @js.native
  val STROKEDASH: strokeDash = js.native
  
  @JSImport("vega-lite/build/src/channel", "STROKEOPACITY")
  @js.native
  val STROKEOPACITY: strokeOpacity = js.native
  
  @JSImport("vega-lite/build/src/channel", "STROKEWIDTH")
  @js.native
  val STROKEWIDTH: strokeWidth = js.native
  
  @JSImport("vega-lite/build/src/channel", "TEXT")
  @js.native
  val TEXT: text = js.native
  
  @JSImport("vega-lite/build/src/channel", "THETA")
  @js.native
  val THETA: theta = js.native
  
  @JSImport("vega-lite/build/src/channel", "THETA2")
  @js.native
  val THETA2: theta2 = js.native
  
  @JSImport("vega-lite/build/src/channel", "TOOLTIP")
  @js.native
  val TOOLTIP: tooltip = js.native
  
  @JSImport("vega-lite/build/src/channel", "UNIT_CHANNELS")
  @js.native
  val UNIT_CHANNELS: js.Array[
    text | fill | stroke | color | shape | description | x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | theta | theta2 | radius | radius2 | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | detail | key | tooltip | href | url | order
  ] = js.native
  
  @JSImport("vega-lite/build/src/channel", "URL")
  @js.native
  val URL: url = js.native
  
  @JSImport("vega-lite/build/src/channel", "X")
  @js.native
  val X: x = js.native
  
  @JSImport("vega-lite/build/src/channel", "X2")
  @js.native
  val X2: x2 = js.native
  
  @JSImport("vega-lite/build/src/channel", "Y")
  @js.native
  val Y: y = js.native
  
  @JSImport("vega-lite/build/src/channel", "Y2")
  @js.native
  val Y2: y2 = js.native
  
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_angle(channel: angle): MainChannelOf[angle] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_color(channel: color): MainChannelOf[color] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_column(channel: column): MainChannelOf[column] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_description(channel: description): MainChannelOf[description] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_detail(channel: detail): MainChannelOf[detail] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_facet(channel: facet): MainChannelOf[facet] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_fill(channel: fill): MainChannelOf[fill] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_fillOpacity(channel: fillOpacity): MainChannelOf[fillOpacity] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_href(channel: href): MainChannelOf[href] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_key(channel: key): MainChannelOf[key] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_latitude(channel: latitude): MainChannelOf[latitude] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_latitude2(channel: latitude2): MainChannelOf[latitude2] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_longitude(channel: longitude): MainChannelOf[longitude] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_longitude2(channel: longitude2): MainChannelOf[longitude2] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_opacity(channel: opacity): MainChannelOf[opacity] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_order(channel: order): MainChannelOf[order] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_radius(channel: radius): MainChannelOf[radius] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_radius2(channel: radius2): MainChannelOf[radius2] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_row(channel: row): MainChannelOf[row] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_shape(channel: shape): MainChannelOf[shape] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_size(channel: size): MainChannelOf[size] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_stroke(channel: stroke): MainChannelOf[stroke] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_strokeDash(channel: strokeDash): MainChannelOf[strokeDash] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_strokeOpacity(channel: strokeOpacity): MainChannelOf[strokeOpacity] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_strokeWidth(channel: strokeWidth): MainChannelOf[strokeWidth] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_text(channel: text): MainChannelOf[text] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_theta(channel: theta): MainChannelOf[theta] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_theta2(channel: theta2): MainChannelOf[theta2] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_tooltip(channel: tooltip): MainChannelOf[tooltip] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_url(channel: url): MainChannelOf[url] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_x(channel: x): MainChannelOf[x] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_x2(channel: x2): MainChannelOf[x2] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_y(channel: y): MainChannelOf[y] = js.native
  @JSImport("vega-lite/build/src/channel", "getMainRangeChannel")
  @js.native
  def getMainRangeChannel_y2(channel: y2): MainChannelOf[y2] = js.native
  
  @JSImport("vega-lite/build/src/channel", "getOffsetChannel")
  @js.native
  def getOffsetChannel(channel: Channel): xOffset | yOffset | x2Offset | y2Offset | thetaOffset | radiusOffset | theta2Offset | radius2Offset = js.native
  
  @JSImport("vega-lite/build/src/channel", "getPositionChannelFromLatLong")
  @js.native
  def getPositionChannelFromLatLong(channel: GeoPositionChannel): PositionChannel = js.native
  
  @JSImport("vega-lite/build/src/channel", "getPositionScaleChannel")
  @js.native
  def getPositionScaleChannel_height(sizeType: height): PositionScaleChannel = js.native
  @JSImport("vega-lite/build/src/channel", "getPositionScaleChannel")
  @js.native
  def getPositionScaleChannel_width(sizeType: width): PositionScaleChannel = js.native
  
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_angle(channel: angle): js.UndefOr[SecondaryChannelOf[angle]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_color(channel: color): js.UndefOr[SecondaryChannelOf[color]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_description(channel: description): js.UndefOr[SecondaryChannelOf[description]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_detail(channel: detail): js.UndefOr[SecondaryChannelOf[detail]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_fill(channel: fill): js.UndefOr[SecondaryChannelOf[fill]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_fillOpacity(channel: fillOpacity): js.UndefOr[SecondaryChannelOf[fillOpacity]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_href(channel: href): js.UndefOr[SecondaryChannelOf[href]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_key(channel: key): js.UndefOr[SecondaryChannelOf[key]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_latitude(channel: latitude): js.UndefOr[SecondaryChannelOf[latitude]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_latitude2(channel: latitude2): js.UndefOr[SecondaryChannelOf[latitude2]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_longitude(channel: longitude): js.UndefOr[SecondaryChannelOf[longitude]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_longitude2(channel: longitude2): js.UndefOr[SecondaryChannelOf[longitude2]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_opacity(channel: opacity): js.UndefOr[SecondaryChannelOf[opacity]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_order(channel: order): js.UndefOr[SecondaryChannelOf[order]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_radius(channel: radius): js.UndefOr[SecondaryChannelOf[radius]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_radius2(channel: radius2): js.UndefOr[SecondaryChannelOf[radius2]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_shape(channel: shape): js.UndefOr[SecondaryChannelOf[shape]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_size(channel: size): js.UndefOr[SecondaryChannelOf[size]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_stroke(channel: stroke): js.UndefOr[SecondaryChannelOf[stroke]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_strokeDash(channel: strokeDash): js.UndefOr[SecondaryChannelOf[strokeDash]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_strokeOpacity(channel: strokeOpacity): js.UndefOr[SecondaryChannelOf[strokeOpacity]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_strokeWidth(channel: strokeWidth): js.UndefOr[SecondaryChannelOf[strokeWidth]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_text(channel: text): js.UndefOr[SecondaryChannelOf[text]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_theta(channel: theta): js.UndefOr[SecondaryChannelOf[theta]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_theta2(channel: theta2): js.UndefOr[SecondaryChannelOf[theta2]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_tooltip(channel: tooltip): js.UndefOr[SecondaryChannelOf[tooltip]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_url(channel: url): js.UndefOr[SecondaryChannelOf[url]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_x(channel: x): js.UndefOr[SecondaryChannelOf[x]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_x2(channel: x2): js.UndefOr[SecondaryChannelOf[x2]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_y(channel: y): js.UndefOr[SecondaryChannelOf[y]] = js.native
  @JSImport("vega-lite/build/src/channel", "getSecondaryRangeChannel")
  @js.native
  def getSecondaryRangeChannel_y2(channel: y2): js.UndefOr[SecondaryChannelOf[y2]] = js.native
  
  @JSImport("vega-lite/build/src/channel", "getSizeChannel")
  @js.native
  def getSizeChannel(channel: Channel): js.UndefOr[width | height] = js.native
  @JSImport("vega-lite/build/src/channel", "getSizeChannel")
  @js.native
  def getSizeChannel(channel: PositionChannel): width | height = js.native
  
  @JSImport("vega-lite/build/src/channel", "getVgPositionChannel")
  @js.native
  def getVgPositionChannel(channel: PolarPositionChannel): x | y | x2 | y2 | innerRadius | outerRadius | startAngle | endAngle = js.native
  @JSImport("vega-lite/build/src/channel", "getVgPositionChannel")
  @js.native
  def getVgPositionChannel(channel: PositionChannel): x | y | x2 | y2 | innerRadius | outerRadius | startAngle | endAngle = js.native
  
  @JSImport("vega-lite/build/src/channel", "isChannel")
  @js.native
  def isChannel(str: String): /* is vega-lite.vega-lite/build/src/channel.Channel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "isColorChannel")
  @js.native
  def isColorChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "isGeoPositionChannel")
  @js.native
  def isGeoPositionChannel(c: Channel): /* is vega-lite.vega-lite/build/src/channel.GeoPositionChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "isNonPositionScaleChannel")
  @js.native
  def isNonPositionScaleChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.NonPositionScaleChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "isPolarPositionChannel")
  @js.native
  def isPolarPositionChannel(c: Channel): /* is vega-lite.vega-lite/build/src/channel.PolarPositionChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "isScaleChannel")
  @js.native
  def isScaleChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "isSecondaryRangeChannel")
  @js.native
  def isSecondaryRangeChannel(c: ExtendedChannel): /* is vega-lite.vega-lite/build/src/channel.SecondaryRangeChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "isSingleDefUnitChannel")
  @js.native
  def isSingleDefUnitChannel(str: String): /* is vega-lite.vega-lite/build/src/channel.SingleDefUnitChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "isXorY")
  @js.native
  def isXorY(channel: ExtendedChannel): /* is vega-lite.vega-lite/build/src/channel.PositionScaleChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "rangeType")
  @js.native
  def rangeType(channel: ExtendedChannel): RangeType = js.native
  
  @JSImport("vega-lite/build/src/channel", "supportLegend")
  @js.native
  def supportLegend(channel: NonPositionScaleChannel): Boolean = js.native
  
  @JSImport("vega-lite/build/src/channel", "supportMark")
  @js.native
  def supportMark(channel: Channel, mark: Mark): binned | always = js.native
  
  /* keyof vega-lite.vega-lite/build/src/encoding.Encoding<any> */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.x
    - typings.vegaLite.vegaLiteStrings.y
    - typings.vegaLite.vegaLiteStrings.x2
    - typings.vegaLite.vegaLiteStrings.y2
    - typings.vegaLite.vegaLiteStrings.longitude
    - typings.vegaLite.vegaLiteStrings.latitude
    - typings.vegaLite.vegaLiteStrings.longitude2
    - typings.vegaLite.vegaLiteStrings.latitude2
    - typings.vegaLite.vegaLiteStrings.theta
    - typings.vegaLite.vegaLiteStrings.theta2
    - typings.vegaLite.vegaLiteStrings.radius
    - typings.vegaLite.vegaLiteStrings.radius2
    - typings.vegaLite.vegaLiteStrings.color
    - typings.vegaLite.vegaLiteStrings.fill
    - typings.vegaLite.vegaLiteStrings.stroke
    - typings.vegaLite.vegaLiteStrings.opacity
    - typings.vegaLite.vegaLiteStrings.fillOpacity
    - typings.vegaLite.vegaLiteStrings.strokeOpacity
    - typings.vegaLite.vegaLiteStrings.strokeWidth
    - typings.vegaLite.vegaLiteStrings.strokeDash
    - typings.vegaLite.vegaLiteStrings.size
    - typings.vegaLite.vegaLiteStrings.angle
    - typings.vegaLite.vegaLiteStrings.shape
    - typings.vegaLite.vegaLiteStrings.detail
    - typings.vegaLite.vegaLiteStrings.key
    - typings.vegaLite.vegaLiteStrings.text
    - typings.vegaLite.vegaLiteStrings.tooltip
    - typings.vegaLite.vegaLiteStrings.href
    - typings.vegaLite.vegaLiteStrings.url
    - typings.vegaLite.vegaLiteStrings.description
    - typings.vegaLite.vegaLiteStrings.order
  */
  trait Channel extends ExtendedChannel
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.color
    - typings.vegaLite.vegaLiteStrings.fill
    - typings.vegaLite.vegaLiteStrings.stroke
  */
  trait ColorChannel extends StObject
  object ColorChannel {
    
    @scala.inline
    def color: typings.vegaLite.vegaLiteStrings.color = "color".asInstanceOf[typings.vegaLite.vegaLiteStrings.color]
    
    @scala.inline
    def fill: typings.vegaLite.vegaLiteStrings.fill = "fill".asInstanceOf[typings.vegaLite.vegaLiteStrings.fill]
    
    @scala.inline
    def stroke: typings.vegaLite.vegaLiteStrings.stroke = "stroke".asInstanceOf[typings.vegaLite.vegaLiteStrings.stroke]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.channelMod.Channel
    - typings.vegaLite.channelMod.FacetChannel
  */
  trait ExtendedChannel extends StObject
  
  /* keyof vega-lite.vega-lite/build/src/spec/facet.EncodingFacetMapping<any, any> */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.facet
    - typings.vegaLite.vegaLiteStrings.row
    - typings.vegaLite.vegaLiteStrings.column
  */
  trait FacetChannel extends ExtendedChannel
  
  /* keyof vega-lite.anon.Latitude */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.longitude
    - typings.vegaLite.vegaLiteStrings.longitude2
    - typings.vegaLite.vegaLiteStrings.latitude
    - typings.vegaLite.vegaLiteStrings.latitude2
  */
  trait GeoPositionChannel extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - C
    - typings.vegaLite.vegaLiteStrings.radius
    - typings.vegaLite.vegaLiteStrings.theta
    - typings.vegaLite.vegaLiteStrings.longitude
    - typings.vegaLite.vegaLiteStrings.latitude
    - typings.vegaLite.vegaLiteStrings.y
    - typings.vegaLite.vegaLiteStrings.x
  */
  type MainChannelOf[C /* <: ExtendedChannel */] = _MainChannelOf[C] | C
  
  type NonPositionChannel = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'text' | 'fill' | 'stroke' | 'color' | 'shape' | 'description' | 'opacity' | 'fillOpacity' | 'strokeOpacity' | 'strokeWidth' | 'strokeDash' | 'size' | 'angle' | 'detail' | 'key' | 'tooltip' | 'href' | 'url' | 'order'>[number] */ js.Any
  
  type NonPositionScaleChannel = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'fill' | 'stroke' | 'color' | 'shape' | 'opacity' | 'fillOpacity' | 'strokeOpacity' | 'strokeWidth' | 'strokeDash' | 'size' | 'angle'>[number] */ js.Any
  
  /* keyof vega-lite.anon.Radius */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.theta
    - typings.vegaLite.vegaLiteStrings.theta2
    - typings.vegaLite.vegaLiteStrings.radius
    - typings.vegaLite.vegaLiteStrings.radius2
  */
  trait PolarPositionChannel extends StObject
  
  /* keyof vega-lite.anon.Theta */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.theta
    - typings.vegaLite.vegaLiteStrings.radius
  */
  trait PolarPositionScaleChannel extends StObject
  
  /* keyof vega-lite.anon.X */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.x
    - typings.vegaLite.vegaLiteStrings.y
    - typings.vegaLite.vegaLiteStrings.x2
    - typings.vegaLite.vegaLiteStrings.y2
  */
  trait PositionChannel extends StObject
  
  /* keyof vega-lite.anon.Y */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.x
    - typings.vegaLite.vegaLiteStrings.y
  */
  trait PositionScaleChannel extends StObject
  
  type ScaleChannel = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'fill' | 'stroke' | 'color' | 'shape' | 'x' | 'y' | 'theta' | 'radius' | 'opacity' | 'fillOpacity' | 'strokeOpacity' | 'strokeWidth' | 'strokeDash' | 'size' | 'angle'>[number] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - typings.vegaLite.vegaLiteStrings.radius2
    - typings.vegaLite.vegaLiteStrings.theta2
    - typings.vegaLite.vegaLiteStrings.longitude2
    - typings.vegaLite.vegaLiteStrings.latitude2
    - typings.vegaLite.vegaLiteStrings.y2
    - typings.vegaLite.vegaLiteStrings.x2
  */
  type SecondaryChannelOf[C /* <: Channel */] = js.UndefOr[_SecondaryChannelOf[C]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.x2
    - typings.vegaLite.vegaLiteStrings.y2
    - typings.vegaLite.vegaLiteStrings.latitude2
    - typings.vegaLite.vegaLiteStrings.longitude2
    - typings.vegaLite.vegaLiteStrings.theta2
    - typings.vegaLite.vegaLiteStrings.radius2
  */
  trait SecondaryRangeChannel extends StObject
  object SecondaryRangeChannel {
    
    @scala.inline
    def latitude2: typings.vegaLite.vegaLiteStrings.latitude2 = "latitude2".asInstanceOf[typings.vegaLite.vegaLiteStrings.latitude2]
    
    @scala.inline
    def longitude2: typings.vegaLite.vegaLiteStrings.longitude2 = "longitude2".asInstanceOf[typings.vegaLite.vegaLiteStrings.longitude2]
    
    @scala.inline
    def radius2: typings.vegaLite.vegaLiteStrings.radius2 = "radius2".asInstanceOf[typings.vegaLite.vegaLiteStrings.radius2]
    
    @scala.inline
    def theta2: typings.vegaLite.vegaLiteStrings.theta2 = "theta2".asInstanceOf[typings.vegaLite.vegaLiteStrings.theta2]
    
    @scala.inline
    def x2: typings.vegaLite.vegaLiteStrings.x2 = "x2".asInstanceOf[typings.vegaLite.vegaLiteStrings.x2]
    
    @scala.inline
    def y2: typings.vegaLite.vegaLiteStrings.y2 = "y2".asInstanceOf[typings.vegaLite.vegaLiteStrings.y2]
  }
  
  type SingleDefChannel = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'text' | 'fill' | 'stroke' | 'color' | 'shape' | 'description' | 'x' | 'y' | 'x2' | 'y2' | 'longitude' | 'latitude' | 'longitude2' | 'latitude2' | 'theta' | 'theta2' | 'radius' | 'radius2' | 'opacity' | 'fillOpacity' | 'strokeOpacity' | 'strokeWidth' | 'strokeDash' | 'size' | 'angle' | 'key' | 'href' | 'url' | 'facet' | 'row' | 'column'>[number] */ js.Any
  
  type SingleDefUnitChannel = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'text' | 'fill' | 'stroke' | 'color' | 'shape' | 'description' | 'x' | 'y' | 'x2' | 'y2' | 'longitude' | 'latitude' | 'longitude2' | 'latitude2' | 'theta' | 'theta2' | 'radius' | 'radius2' | 'opacity' | 'fillOpacity' | 'strokeOpacity' | 'strokeWidth' | 'strokeDash' | 'size' | 'angle' | 'key' | 'href' | 'url'>[number] */ js.Any
  
  /* Inlined std.Partial<std.Record<vega-lite.vega-lite/build/src/mark.Mark, 'always' | 'binned'>> */
  @js.native
  trait SupportedMark extends StObject {
    
    var arc: js.UndefOr[always | binned] = js.native
    
    var area: js.UndefOr[always | binned] = js.native
    
    var bar: js.UndefOr[always | binned] = js.native
    
    var circle: js.UndefOr[always | binned] = js.native
    
    var geoshape: js.UndefOr[always | binned] = js.native
    
    var image: js.UndefOr[always | binned] = js.native
    
    var line: js.UndefOr[always | binned] = js.native
    
    var point: js.UndefOr[always | binned] = js.native
    
    var rect: js.UndefOr[always | binned] = js.native
    
    var rule: js.UndefOr[always | binned] = js.native
    
    var square: js.UndefOr[always | binned] = js.native
    
    var text: js.UndefOr[always | binned] = js.native
    
    var tick: js.UndefOr[always | binned] = js.native
    
    var trail: js.UndefOr[always | binned] = js.native
  }
  object SupportedMark {
    
    @scala.inline
    def apply(): SupportedMark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportedMark]
    }
    
    @scala.inline
    implicit class SupportedMarkMutableBuilder[Self <: SupportedMark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArc(value: always | binned): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
      
      @scala.inline
      def setArea(value: always | binned): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      @scala.inline
      def setBar(value: always | binned): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      @scala.inline
      def setCircle(value: always | binned): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setGeoshape(value: always | binned): Self = StObject.set(x, "geoshape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoshapeUndefined: Self = StObject.set(x, "geoshape", js.undefined)
      
      @scala.inline
      def setImage(value: always | binned): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setLine(value: always | binned): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setPoint(value: always | binned): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      @scala.inline
      def setRect(value: always | binned): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      @scala.inline
      def setRule(value: always | binned): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      @scala.inline
      def setSquare(value: always | binned): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      @scala.inline
      def setText(value: always | binned): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTick(value: always | binned): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
      
      @scala.inline
      def setTrail(value: always | binned): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
    }
  }
  
  trait _MainChannelOf[C /* <: ExtendedChannel */] extends StObject
  
  trait _SecondaryChannelOf[C /* <: Channel */] extends StObject
}
