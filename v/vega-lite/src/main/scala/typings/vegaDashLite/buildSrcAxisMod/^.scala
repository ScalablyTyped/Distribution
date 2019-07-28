package typings.vegaDashLite.buildSrcAxisMod

import typings.vegaDashLite.vegaDashLiteStrings.domain
import typings.vegaDashLite.vegaDashLiteStrings.encode
import typings.vegaDashLite.vegaDashLiteStrings.encoding
import typings.vegaDashLite.vegaDashLiteStrings.format
import typings.vegaDashLite.vegaDashLiteStrings.grid
import typings.vegaDashLite.vegaDashLiteStrings.gridScale
import typings.vegaDashLite.vegaDashLiteStrings.labelAngle
import typings.vegaDashLite.vegaDashLiteStrings.labelBound
import typings.vegaDashLite.vegaDashLiteStrings.labelFlush
import typings.vegaDashLite.vegaDashLiteStrings.labelOverlap
import typings.vegaDashLite.vegaDashLiteStrings.labelPadding
import typings.vegaDashLite.vegaDashLiteStrings.labels
import typings.vegaDashLite.vegaDashLiteStrings.maxExtent
import typings.vegaDashLite.vegaDashLiteStrings.minExtent
import typings.vegaDashLite.vegaDashLiteStrings.offset
import typings.vegaDashLite.vegaDashLiteStrings.orient
import typings.vegaDashLite.vegaDashLiteStrings.position
import typings.vegaDashLite.vegaDashLiteStrings.scale
import typings.vegaDashLite.vegaDashLiteStrings.tickCount
import typings.vegaDashLite.vegaDashLiteStrings.tickSize
import typings.vegaDashLite.vegaDashLiteStrings.ticks
import typings.vegaDashLite.vegaDashLiteStrings.title
import typings.vegaDashLite.vegaDashLiteStrings.titleMaxLength
import typings.vegaDashLite.vegaDashLiteStrings.titlePadding
import typings.vegaDashLite.vegaDashLiteStrings.values
import typings.vegaDashLite.vegaDashLiteStrings.zindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/axis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AXIS_PARTS: js.Array[AxisPart] = js.native
  val AXIS_PROPERTIES: js.Array[
    title | orient | zindex | ticks | labels | labelBound | labelFlush | labelPadding | labelOverlap | domain | grid | tickSize | tickCount | format | values | offset | position | titlePadding | minExtent | maxExtent | labelAngle | encoding | titleMaxLength
  ] = js.native
  val VG_AXIS_PROPERTIES: js.Array[
    title | orient | scale | zindex | ticks | labels | labelBound | labelFlush | labelPadding | labelOverlap | domain | grid | gridScale | tickSize | tickCount | format | values | offset | position | titlePadding | minExtent | maxExtent | encode
  ] = js.native
  def isAxisProperty(prop: String): Boolean = js.native
}

