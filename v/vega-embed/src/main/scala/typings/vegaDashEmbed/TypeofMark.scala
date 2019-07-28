package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.area
import typings.vegaDashEmbed.vegaDashEmbedStrings.bar
import typings.vegaDashEmbed.vegaDashEmbedStrings.circle
import typings.vegaDashEmbed.vegaDashEmbedStrings.color
import typings.vegaDashEmbed.vegaDashEmbedStrings.filled
import typings.vegaDashEmbed.vegaDashEmbedStrings.geoshape
import typings.vegaDashEmbed.vegaDashEmbedStrings.line
import typings.vegaDashEmbed.vegaDashEmbedStrings.point
import typings.vegaDashEmbed.vegaDashEmbedStrings.rect
import typings.vegaDashEmbed.vegaDashEmbedStrings.rule
import typings.vegaDashEmbed.vegaDashEmbedStrings.square
import typings.vegaDashEmbed.vegaDashEmbedStrings.text
import typings.vegaDashEmbed.vegaDashEmbedStrings.tick
import typings.vegaDashEmbed.vegaDashEmbedStrings.trail
import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMark
import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMarkDef
import typings.vegaDashLite.buildSrcMarkMod.AnyMark
import typings.vegaDashLite.buildSrcMarkMod.BarConfig
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcMarkMod.MarkConfig
import typings.vegaDashLite.buildSrcMarkMod.MarkDef
import typings.vegaDashLite.buildSrcMarkMod.TickConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofMark extends js.Object {
  val AREA: area
  val BAR: bar
  val CIRCLE: circle
  val GEOSHAPE: geoshape
  val LINE: line
  val POINT: point
  val RECT: rect
  val RULE: rule
  val SQUARE: square
  val TEXT: text
  val TICK: tick
  val TRAIL: trail
}

@js.native
trait Typeofmark extends js.Object {
  val AREA: area = js.native
  val BAR: bar = js.native
  val CIRCLE: circle = js.native
  val FILL_CONFIG: js.Array[String] = js.native
  val FILL_STROKE_CONFIG: js.Array[_] = js.native
  val GEOSHAPE: geoshape = js.native
  val LINE: line = js.native
  val MarkNs: TypeofMark = js.native
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
  val VL_ONLY_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in std.Array<vega-lite.vega-lite/build/src/mark.Mark>[0] ]:? std.Array<'mark' | 'area' | 'bar' | 'circle' | 'line' | 'point' | 'rect' | 'rule' | 'square' | 'text' | 'tick' | 'trail' | 'geoshape'[k]>}
    */ typings.vegaDashEmbed.vegaDashEmbedStrings.Typeofmark with js.Any = js.native
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

object TypeofMark {
  @scala.inline
  def apply(
    AREA: area,
    BAR: bar,
    CIRCLE: circle,
    GEOSHAPE: geoshape,
    LINE: line,
    POINT: point,
    RECT: rect,
    RULE: rule,
    SQUARE: square,
    TEXT: text,
    TICK: tick,
    TRAIL: trail
  ): TypeofMark = {
    val __obj = js.Dynamic.literal(AREA = AREA, BAR = BAR, CIRCLE = CIRCLE, GEOSHAPE = GEOSHAPE, LINE = LINE, POINT = POINT, RECT = RECT, RULE = RULE, SQUARE = SQUARE, TEXT = TEXT, TICK = TICK, TRAIL = TRAIL)
  
    __obj.asInstanceOf[TypeofMark]
  }
}

