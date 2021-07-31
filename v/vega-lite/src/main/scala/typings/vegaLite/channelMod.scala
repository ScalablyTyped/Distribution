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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("vega-lite/build/src/channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def getMainRangeChannel_angle(channel: angle): MainChannelOf[angle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[angle]]
  
  @scala.inline
  def getMainRangeChannel_color(channel: color): MainChannelOf[color] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[color]]
  
  @scala.inline
  def getMainRangeChannel_column(channel: column): MainChannelOf[column] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[column]]
  
  @scala.inline
  def getMainRangeChannel_description(channel: description): MainChannelOf[description] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[description]]
  
  @scala.inline
  def getMainRangeChannel_detail(channel: detail): MainChannelOf[detail] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[detail]]
  
  @scala.inline
  def getMainRangeChannel_facet(channel: facet): MainChannelOf[facet] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[facet]]
  
  @scala.inline
  def getMainRangeChannel_fill(channel: fill): MainChannelOf[fill] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[fill]]
  
  @scala.inline
  def getMainRangeChannel_fillOpacity(channel: fillOpacity): MainChannelOf[fillOpacity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[fillOpacity]]
  
  @scala.inline
  def getMainRangeChannel_href(channel: href): MainChannelOf[href] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[href]]
  
  @scala.inline
  def getMainRangeChannel_key(channel: key): MainChannelOf[key] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[key]]
  
  @scala.inline
  def getMainRangeChannel_latitude(channel: latitude): MainChannelOf[latitude] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[latitude]]
  
  @scala.inline
  def getMainRangeChannel_latitude2(channel: latitude2): MainChannelOf[latitude2] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[latitude2]]
  
  @scala.inline
  def getMainRangeChannel_longitude(channel: longitude): MainChannelOf[longitude] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[longitude]]
  
  @scala.inline
  def getMainRangeChannel_longitude2(channel: longitude2): MainChannelOf[longitude2] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[longitude2]]
  
  @scala.inline
  def getMainRangeChannel_opacity(channel: opacity): MainChannelOf[opacity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[opacity]]
  
  @scala.inline
  def getMainRangeChannel_order(channel: order): MainChannelOf[order] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[order]]
  
  @scala.inline
  def getMainRangeChannel_radius(channel: radius): MainChannelOf[radius] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[radius]]
  
  @scala.inline
  def getMainRangeChannel_radius2(channel: radius2): MainChannelOf[radius2] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[radius2]]
  
  @scala.inline
  def getMainRangeChannel_row(channel: row): MainChannelOf[row] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[row]]
  
  @scala.inline
  def getMainRangeChannel_shape(channel: shape): MainChannelOf[shape] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[shape]]
  
  @scala.inline
  def getMainRangeChannel_size(channel: size): MainChannelOf[size] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[size]]
  
  @scala.inline
  def getMainRangeChannel_stroke(channel: stroke): MainChannelOf[stroke] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[stroke]]
  
  @scala.inline
  def getMainRangeChannel_strokeDash(channel: strokeDash): MainChannelOf[strokeDash] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[strokeDash]]
  
  @scala.inline
  def getMainRangeChannel_strokeOpacity(channel: strokeOpacity): MainChannelOf[strokeOpacity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[strokeOpacity]]
  
  @scala.inline
  def getMainRangeChannel_strokeWidth(channel: strokeWidth): MainChannelOf[strokeWidth] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[strokeWidth]]
  
  @scala.inline
  def getMainRangeChannel_text(channel: text): MainChannelOf[text] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[text]]
  
  @scala.inline
  def getMainRangeChannel_theta(channel: theta): MainChannelOf[theta] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[theta]]
  
  @scala.inline
  def getMainRangeChannel_theta2(channel: theta2): MainChannelOf[theta2] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[theta2]]
  
  @scala.inline
  def getMainRangeChannel_tooltip(channel: tooltip): MainChannelOf[tooltip] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[tooltip]]
  
  @scala.inline
  def getMainRangeChannel_url(channel: url): MainChannelOf[url] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[url]]
  
  @scala.inline
  def getMainRangeChannel_x(channel: x): MainChannelOf[x] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[x]]
  
  @scala.inline
  def getMainRangeChannel_x2(channel: x2): MainChannelOf[x2] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[x2]]
  
  @scala.inline
  def getMainRangeChannel_y(channel: y): MainChannelOf[y] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[y]]
  
  @scala.inline
  def getMainRangeChannel_y2(channel: y2): MainChannelOf[y2] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[MainChannelOf[y2]]
  
  @scala.inline
  def getOffsetChannel(channel: Channel): xOffset | yOffset | x2Offset | y2Offset | thetaOffset | radiusOffset | theta2Offset | radius2Offset = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[xOffset | yOffset | x2Offset | y2Offset | thetaOffset | radiusOffset | theta2Offset | radius2Offset]
  
  @scala.inline
  def getPositionChannelFromLatLong(channel: GeoPositionChannel): PositionChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositionChannelFromLatLong")(channel.asInstanceOf[js.Any]).asInstanceOf[PositionChannel]
  
  @scala.inline
  def getPositionScaleChannel_height(sizeType: height): PositionScaleChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositionScaleChannel")(sizeType.asInstanceOf[js.Any]).asInstanceOf[PositionScaleChannel]
  
  @scala.inline
  def getPositionScaleChannel_width(sizeType: width): PositionScaleChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositionScaleChannel")(sizeType.asInstanceOf[js.Any]).asInstanceOf[PositionScaleChannel]
  
  @scala.inline
  def getSecondaryRangeChannel_angle(channel: angle): js.UndefOr[SecondaryChannelOf[angle]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[angle]]]
  
  @scala.inline
  def getSecondaryRangeChannel_color(channel: color): js.UndefOr[SecondaryChannelOf[color]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[color]]]
  
  @scala.inline
  def getSecondaryRangeChannel_description(channel: description): js.UndefOr[SecondaryChannelOf[description]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[description]]]
  
  @scala.inline
  def getSecondaryRangeChannel_detail(channel: detail): js.UndefOr[SecondaryChannelOf[detail]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[detail]]]
  
  @scala.inline
  def getSecondaryRangeChannel_fill(channel: fill): js.UndefOr[SecondaryChannelOf[fill]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[fill]]]
  
  @scala.inline
  def getSecondaryRangeChannel_fillOpacity(channel: fillOpacity): js.UndefOr[SecondaryChannelOf[fillOpacity]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[fillOpacity]]]
  
  @scala.inline
  def getSecondaryRangeChannel_href(channel: href): js.UndefOr[SecondaryChannelOf[href]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[href]]]
  
  @scala.inline
  def getSecondaryRangeChannel_key(channel: key): js.UndefOr[SecondaryChannelOf[key]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[key]]]
  
  @scala.inline
  def getSecondaryRangeChannel_latitude(channel: latitude): js.UndefOr[SecondaryChannelOf[latitude]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[latitude]]]
  
  @scala.inline
  def getSecondaryRangeChannel_latitude2(channel: latitude2): js.UndefOr[SecondaryChannelOf[latitude2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[latitude2]]]
  
  @scala.inline
  def getSecondaryRangeChannel_longitude(channel: longitude): js.UndefOr[SecondaryChannelOf[longitude]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[longitude]]]
  
  @scala.inline
  def getSecondaryRangeChannel_longitude2(channel: longitude2): js.UndefOr[SecondaryChannelOf[longitude2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[longitude2]]]
  
  @scala.inline
  def getSecondaryRangeChannel_opacity(channel: opacity): js.UndefOr[SecondaryChannelOf[opacity]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[opacity]]]
  
  @scala.inline
  def getSecondaryRangeChannel_order(channel: order): js.UndefOr[SecondaryChannelOf[order]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[order]]]
  
  @scala.inline
  def getSecondaryRangeChannel_radius(channel: radius): js.UndefOr[SecondaryChannelOf[radius]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[radius]]]
  
  @scala.inline
  def getSecondaryRangeChannel_radius2(channel: radius2): js.UndefOr[SecondaryChannelOf[radius2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[radius2]]]
  
  @scala.inline
  def getSecondaryRangeChannel_shape(channel: shape): js.UndefOr[SecondaryChannelOf[shape]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[shape]]]
  
  @scala.inline
  def getSecondaryRangeChannel_size(channel: size): js.UndefOr[SecondaryChannelOf[size]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[size]]]
  
  @scala.inline
  def getSecondaryRangeChannel_stroke(channel: stroke): js.UndefOr[SecondaryChannelOf[stroke]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[stroke]]]
  
  @scala.inline
  def getSecondaryRangeChannel_strokeDash(channel: strokeDash): js.UndefOr[SecondaryChannelOf[strokeDash]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[strokeDash]]]
  
  @scala.inline
  def getSecondaryRangeChannel_strokeOpacity(channel: strokeOpacity): js.UndefOr[SecondaryChannelOf[strokeOpacity]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[strokeOpacity]]]
  
  @scala.inline
  def getSecondaryRangeChannel_strokeWidth(channel: strokeWidth): js.UndefOr[SecondaryChannelOf[strokeWidth]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[strokeWidth]]]
  
  @scala.inline
  def getSecondaryRangeChannel_text(channel: text): js.UndefOr[SecondaryChannelOf[text]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[text]]]
  
  @scala.inline
  def getSecondaryRangeChannel_theta(channel: theta): js.UndefOr[SecondaryChannelOf[theta]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[theta]]]
  
  @scala.inline
  def getSecondaryRangeChannel_theta2(channel: theta2): js.UndefOr[SecondaryChannelOf[theta2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[theta2]]]
  
  @scala.inline
  def getSecondaryRangeChannel_tooltip(channel: tooltip): js.UndefOr[SecondaryChannelOf[tooltip]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[tooltip]]]
  
  @scala.inline
  def getSecondaryRangeChannel_url(channel: url): js.UndefOr[SecondaryChannelOf[url]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[url]]]
  
  @scala.inline
  def getSecondaryRangeChannel_x(channel: x): js.UndefOr[SecondaryChannelOf[x]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[x]]]
  
  @scala.inline
  def getSecondaryRangeChannel_x2(channel: x2): js.UndefOr[SecondaryChannelOf[x2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[x2]]]
  
  @scala.inline
  def getSecondaryRangeChannel_y(channel: y): js.UndefOr[SecondaryChannelOf[y]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[y]]]
  
  @scala.inline
  def getSecondaryRangeChannel_y2(channel: y2): js.UndefOr[SecondaryChannelOf[y2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryRangeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SecondaryChannelOf[y2]]]
  
  @scala.inline
  def getSizeChannel(channel: Channel): js.UndefOr[width | height] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[width | height]]
  @scala.inline
  def getSizeChannel(channel: PositionChannel): width | height = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[width | height]
  
  @scala.inline
  def getVgPositionChannel(channel: PolarPositionChannel): x | y | x2 | y2 | innerRadius | outerRadius | startAngle | endAngle = ^.asInstanceOf[js.Dynamic].applyDynamic("getVgPositionChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[x | y | x2 | y2 | innerRadius | outerRadius | startAngle | endAngle]
  @scala.inline
  def getVgPositionChannel(channel: PositionChannel): x | y | x2 | y2 | innerRadius | outerRadius | startAngle | endAngle = ^.asInstanceOf[js.Dynamic].applyDynamic("getVgPositionChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[x | y | x2 | y2 | innerRadius | outerRadius | startAngle | endAngle]
  
  @scala.inline
  def isChannel(str: String): /* is vega-lite.vega-lite/build/src/channel.Channel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChannel")(str.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.Channel */ Boolean]
  
  @scala.inline
  def isColorChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColorChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.ColorChannel */ Boolean]
  
  @scala.inline
  def isGeoPositionChannel(c: Channel): /* is vega-lite.vega-lite/build/src/channel.GeoPositionChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeoPositionChannel")(c.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.GeoPositionChannel */ Boolean]
  
  @scala.inline
  def isNonPositionScaleChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.NonPositionScaleChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonPositionScaleChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.NonPositionScaleChannel */ Boolean]
  
  @scala.inline
  def isPolarPositionChannel(c: Channel): /* is vega-lite.vega-lite/build/src/channel.PolarPositionChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPolarPositionChannel")(c.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.PolarPositionChannel */ Boolean]
  
  @scala.inline
  def isScaleChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScaleChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ Boolean]
  
  @scala.inline
  def isSecondaryRangeChannel(c: ExtendedChannel): /* is vega-lite.vega-lite/build/src/channel.SecondaryRangeChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSecondaryRangeChannel")(c.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.SecondaryRangeChannel */ Boolean]
  
  @scala.inline
  def isSingleDefUnitChannel(str: String): /* is vega-lite.vega-lite/build/src/channel.SingleDefUnitChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleDefUnitChannel")(str.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.SingleDefUnitChannel */ Boolean]
  
  @scala.inline
  def isXorY(channel: ExtendedChannel): /* is vega-lite.vega-lite/build/src/channel.PositionScaleChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXorY")(channel.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channel.PositionScaleChannel */ Boolean]
  
  @scala.inline
  def rangeType(channel: ExtendedChannel): RangeType = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeType")(channel.asInstanceOf[js.Any]).asInstanceOf[RangeType]
  
  @scala.inline
  def supportLegend(channel: NonPositionScaleChannel): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportLegend")(channel.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def supportMark(channel: Channel, mark: Mark): binned | always = (^.asInstanceOf[js.Dynamic].applyDynamic("supportMark")(channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[binned | always]
  
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
  trait Channel
    extends StObject
       with ExtendedChannel
  
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
  trait FacetChannel
    extends StObject
       with ExtendedChannel
  
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
    - scala.Unit
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
  trait SupportedMark extends StObject {
    
    var arc: js.UndefOr[always | binned] = js.undefined
    
    var area: js.UndefOr[always | binned] = js.undefined
    
    var bar: js.UndefOr[always | binned] = js.undefined
    
    var circle: js.UndefOr[always | binned] = js.undefined
    
    var geoshape: js.UndefOr[always | binned] = js.undefined
    
    var image: js.UndefOr[always | binned] = js.undefined
    
    var line: js.UndefOr[always | binned] = js.undefined
    
    var point: js.UndefOr[always | binned] = js.undefined
    
    var rect: js.UndefOr[always | binned] = js.undefined
    
    var rule: js.UndefOr[always | binned] = js.undefined
    
    var square: js.UndefOr[always | binned] = js.undefined
    
    var text: js.UndefOr[always | binned] = js.undefined
    
    var tick: js.UndefOr[always | binned] = js.undefined
    
    var trail: js.UndefOr[always | binned] = js.undefined
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
