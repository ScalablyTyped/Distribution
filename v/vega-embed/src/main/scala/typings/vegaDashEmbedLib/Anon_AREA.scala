package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AREA extends js.Object {
  val AREA: vegaDashEmbedLib.vegaDashEmbedLibStrings.area
  val BAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.bar
  val CIRCLE: vegaDashEmbedLib.vegaDashEmbedLibStrings.circle
  val GEOSHAPE: vegaDashEmbedLib.vegaDashEmbedLibStrings.geoshape
  val LINE: vegaDashEmbedLib.vegaDashEmbedLibStrings.line
  val POINT: vegaDashEmbedLib.vegaDashEmbedLibStrings.point
  val RECT: vegaDashEmbedLib.vegaDashEmbedLibStrings.rect
  val RULE: vegaDashEmbedLib.vegaDashEmbedLibStrings.rule
  val SQUARE: vegaDashEmbedLib.vegaDashEmbedLibStrings.square
  val TEXT: vegaDashEmbedLib.vegaDashEmbedLibStrings.text
  val TICK: vegaDashEmbedLib.vegaDashEmbedLibStrings.tick
  val TRAIL: vegaDashEmbedLib.vegaDashEmbedLibStrings.trail
}

@js.native
trait Anon_Area extends js.Object {
  val STACKABLE_MARKS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.square | vegaDashEmbedLib.vegaDashEmbedLibStrings.area | vegaDashEmbedLib.vegaDashEmbedLibStrings.circle | vegaDashEmbedLib.vegaDashEmbedLibStrings.line | vegaDashEmbedLib.vegaDashEmbedLibStrings.text | vegaDashEmbedLib.vegaDashEmbedLibStrings.rule | vegaDashEmbedLib.vegaDashEmbedLibStrings.point | vegaDashEmbedLib.vegaDashEmbedLibStrings.bar | vegaDashEmbedLib.vegaDashEmbedLibStrings.tick
  ] = js.native
  val STACK_BY_DEFAULT_MARKS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.area | vegaDashEmbedLib.vegaDashEmbedLibStrings.bar
  ] = js.native
  def isStackOffset(s: java.lang.String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ scala.Boolean = js.native
  def stack(
    m: vegaDashLiteLib.buildSrcMarkMod.MarkDef,
    encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
    stackConfig: vegaDashLiteLib.buildSrcStackMod.StackOffset
  ): vegaDashLiteLib.buildSrcStackMod.StackProperties = js.native
  def stack(
    m: vegaDashLiteLib.buildSrcMarkMod.Mark,
    encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
    stackConfig: vegaDashLiteLib.buildSrcStackMod.StackOffset
  ): vegaDashLiteLib.buildSrcStackMod.StackProperties = js.native
}

object Anon_AREA {
  @scala.inline
  def apply(
    AREA: vegaDashEmbedLib.vegaDashEmbedLibStrings.area,
    BAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.bar,
    CIRCLE: vegaDashEmbedLib.vegaDashEmbedLibStrings.circle,
    GEOSHAPE: vegaDashEmbedLib.vegaDashEmbedLibStrings.geoshape,
    LINE: vegaDashEmbedLib.vegaDashEmbedLibStrings.line,
    POINT: vegaDashEmbedLib.vegaDashEmbedLibStrings.point,
    RECT: vegaDashEmbedLib.vegaDashEmbedLibStrings.rect,
    RULE: vegaDashEmbedLib.vegaDashEmbedLibStrings.rule,
    SQUARE: vegaDashEmbedLib.vegaDashEmbedLibStrings.square,
    TEXT: vegaDashEmbedLib.vegaDashEmbedLibStrings.text,
    TICK: vegaDashEmbedLib.vegaDashEmbedLibStrings.tick,
    TRAIL: vegaDashEmbedLib.vegaDashEmbedLibStrings.trail
  ): Anon_AREA = {
    val __obj = js.Dynamic.literal(AREA = AREA, BAR = BAR, CIRCLE = CIRCLE, GEOSHAPE = GEOSHAPE, LINE = LINE, POINT = POINT, RECT = RECT, RULE = RULE, SQUARE = SQUARE, TEXT = TEXT, TICK = TICK, TRAIL = TRAIL)
  
    __obj.asInstanceOf[Anon_AREA]
  }
}

