package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.domain
import typings.vegaDashEmbed.vegaDashEmbedStrings.encode
import typings.vegaDashEmbed.vegaDashEmbedStrings.encoding
import typings.vegaDashEmbed.vegaDashEmbedStrings.format
import typings.vegaDashEmbed.vegaDashEmbedStrings.grid
import typings.vegaDashEmbed.vegaDashEmbedStrings.gridScale
import typings.vegaDashEmbed.vegaDashEmbedStrings.labelAngle
import typings.vegaDashEmbed.vegaDashEmbedStrings.labelBound
import typings.vegaDashEmbed.vegaDashEmbedStrings.labelFlush
import typings.vegaDashEmbed.vegaDashEmbedStrings.labelOverlap
import typings.vegaDashEmbed.vegaDashEmbedStrings.labelPadding
import typings.vegaDashEmbed.vegaDashEmbedStrings.labels
import typings.vegaDashEmbed.vegaDashEmbedStrings.maxExtent
import typings.vegaDashEmbed.vegaDashEmbedStrings.minExtent
import typings.vegaDashEmbed.vegaDashEmbedStrings.offset
import typings.vegaDashEmbed.vegaDashEmbedStrings.orient
import typings.vegaDashEmbed.vegaDashEmbedStrings.position
import typings.vegaDashEmbed.vegaDashEmbedStrings.scale
import typings.vegaDashEmbed.vegaDashEmbedStrings.tickCount
import typings.vegaDashEmbed.vegaDashEmbedStrings.tickSize
import typings.vegaDashEmbed.vegaDashEmbedStrings.ticks
import typings.vegaDashEmbed.vegaDashEmbedStrings.title
import typings.vegaDashEmbed.vegaDashEmbedStrings.titleMaxLength
import typings.vegaDashEmbed.vegaDashEmbedStrings.titlePadding
import typings.vegaDashEmbed.vegaDashEmbedStrings.values
import typings.vegaDashEmbed.vegaDashEmbedStrings.zindex
import typings.vegaDashLite.buildSrcAxisMod.AxisPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofaxis extends js.Object {
  val AXIS_PARTS: js.Array[AxisPart]
  val AXIS_PROPERTIES: js.Array[
    title | orient | zindex | ticks | labels | labelBound | labelFlush | labelPadding | labelOverlap | domain | grid | tickSize | tickCount | format | values | offset | position | titlePadding | minExtent | maxExtent | labelAngle | encoding | titleMaxLength
  ]
  val AXIS_PROPERTY_TYPE: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in 'scale' | 'domain' | 'format' | 'grid' | 'gridScale' | 'labels' | 'labelBound' | 'labelFlush' | 'labelPadding' | 'labelOverlap' | 'maxExtent' | 'minExtent' | 'offset' | 'orient' | 'position' | 'ticks' | 'tickCount' | 'tickSize' | 'title' | 'titlePadding' | 'values' | 'zindex' | 'encode' ]: 'main' | 'grid' | 'both'}
    */ typings.vegaDashEmbed.vegaDashEmbedStrings.Typeofaxis with js.Any
  val VG_AXIS_PROPERTIES: js.Array[
    title | orient | scale | zindex | ticks | labels | labelBound | labelFlush | labelPadding | labelOverlap | domain | grid | gridScale | tickSize | tickCount | format | values | offset | position | titlePadding | minExtent | maxExtent | encode
  ]
  def isAxisProperty(prop: String): Boolean
}

object Typeofaxis {
  @scala.inline
  def apply(
    AXIS_PARTS: js.Array[AxisPart],
    AXIS_PROPERTIES: js.Array[
      title | orient | zindex | ticks | labels | labelBound | labelFlush | labelPadding | labelOverlap | domain | grid | tickSize | tickCount | format | values | offset | position | titlePadding | minExtent | maxExtent | labelAngle | encoding | titleMaxLength
    ],
    AXIS_PROPERTY_TYPE: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in 'scale' | 'domain' | 'format' | 'grid' | 'gridScale' | 'labels' | 'labelBound' | 'labelFlush' | 'labelPadding' | 'labelOverlap' | 'maxExtent' | 'minExtent' | 'offset' | 'orient' | 'position' | 'ticks' | 'tickCount' | 'tickSize' | 'title' | 'titlePadding' | 'values' | 'zindex' | 'encode' ]: 'main' | 'grid' | 'both'}
    */ typings.vegaDashEmbed.vegaDashEmbedStrings.Typeofaxis with js.Any,
    VG_AXIS_PROPERTIES: js.Array[
      title | orient | scale | zindex | ticks | labels | labelBound | labelFlush | labelPadding | labelOverlap | domain | grid | gridScale | tickSize | tickCount | format | values | offset | position | titlePadding | minExtent | maxExtent | encode
    ],
    isAxisProperty: String => Boolean
  ): Typeofaxis = {
    val __obj = js.Dynamic.literal(AXIS_PARTS = AXIS_PARTS, AXIS_PROPERTIES = AXIS_PROPERTIES, AXIS_PROPERTY_TYPE = AXIS_PROPERTY_TYPE, VG_AXIS_PROPERTIES = VG_AXIS_PROPERTIES, isAxisProperty = js.Any.fromFunction1(isAxisProperty))
  
    __obj.asInstanceOf[Typeofaxis]
  }
}

