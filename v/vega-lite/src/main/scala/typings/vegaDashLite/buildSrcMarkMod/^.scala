package typings.vegaDashLite.buildSrcMarkMod

import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMark
import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMarkDef
import typings.vegaDashLite.vegaDashLiteStrings.area
import typings.vegaDashLite.vegaDashLiteStrings.bar
import typings.vegaDashLite.vegaDashLiteStrings.circle
import typings.vegaDashLite.vegaDashLiteStrings.color
import typings.vegaDashLite.vegaDashLiteStrings.filled
import typings.vegaDashLite.vegaDashLiteStrings.geoshape
import typings.vegaDashLite.vegaDashLiteStrings.line
import typings.vegaDashLite.vegaDashLiteStrings.point
import typings.vegaDashLite.vegaDashLiteStrings.rect
import typings.vegaDashLite.vegaDashLiteStrings.rule
import typings.vegaDashLite.vegaDashLiteStrings.square
import typings.vegaDashLite.vegaDashLiteStrings.text
import typings.vegaDashLite.vegaDashLiteStrings.tick
import typings.vegaDashLite.vegaDashLiteStrings.trail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/mark", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AREA: area = js.native
  val BAR: bar = js.native
  val CIRCLE: circle = js.native
  val FILL_CONFIG: js.Array[String] = js.native
  val FILL_STROKE_CONFIG: js.Array[js.Any] = js.native
  val GEOSHAPE: geoshape = js.native
  val LINE: line = js.native
  val POINT: point = js.native
  val PRIMITIVE_MARKS: js.Array[Mark] = js.native
  val RECT: rect = js.native
  val RULE: rule = js.native
  val SQUARE: square = js.native
  val STROKE_CONFIG: js.Array[String] = js.native
  val TEXT: text = js.native
  val TICK: tick = js.native
  val TRAIL: trail = js.native
  val VL_ONLY_MARK_CONFIG_PROPERTIES: js.Array[filled | color] = js.native
  val defaultBarConfig: BarConfig = js.native
  val defaultMarkConfig: MarkConfig = js.native
  val defaultTickConfig: TickConfig = js.native
  def isMark(m: String): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
  def isMarkDef(mark: AnyMark): Boolean = js.native
  def isPathMark(m: CompositeMark): Boolean = js.native
  def isPathMark(m: Mark): Boolean = js.native
  def isPrimitiveMark(mark: CompositeMark): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
  def isPrimitiveMark(mark: CompositeMarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
  def isPrimitiveMark(mark: Mark): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
  def isPrimitiveMark(mark: MarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
}

