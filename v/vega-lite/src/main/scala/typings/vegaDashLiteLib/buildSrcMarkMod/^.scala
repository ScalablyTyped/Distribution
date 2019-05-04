package typings
package vegaDashLiteLib.buildSrcMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/mark", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AREA: vegaDashLiteLib.vegaDashLiteLibStrings.area = js.native
  val BAR: vegaDashLiteLib.vegaDashLiteLibStrings.bar = js.native
  val CIRCLE: vegaDashLiteLib.vegaDashLiteLibStrings.circle = js.native
  val FILL_CONFIG: js.Array[java.lang.String] = js.native
  val FILL_STROKE_CONFIG: js.Array[js.Any] = js.native
  val GEOSHAPE: vegaDashLiteLib.vegaDashLiteLibStrings.geoshape = js.native
  val LINE: vegaDashLiteLib.vegaDashLiteLibStrings.line = js.native
  val POINT: vegaDashLiteLib.vegaDashLiteLibStrings.point = js.native
  val PRIMITIVE_MARKS: js.Array[Mark] = js.native
  val RECT: vegaDashLiteLib.vegaDashLiteLibStrings.rect = js.native
  val RULE: vegaDashLiteLib.vegaDashLiteLibStrings.rule = js.native
  val SQUARE: vegaDashLiteLib.vegaDashLiteLibStrings.square = js.native
  val STROKE_CONFIG: js.Array[java.lang.String] = js.native
  val TEXT: vegaDashLiteLib.vegaDashLiteLibStrings.text = js.native
  val TICK: vegaDashLiteLib.vegaDashLiteLibStrings.tick = js.native
  val TRAIL: vegaDashLiteLib.vegaDashLiteLibStrings.trail = js.native
  val VL_ONLY_MARK_CONFIG_PROPERTIES: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.filled | vegaDashLiteLib.vegaDashLiteLibStrings.color
  ] = js.native
  val defaultBarConfig: BarConfig = js.native
  val defaultMarkConfig: MarkConfig = js.native
  val defaultTickConfig: TickConfig = js.native
  def isMark(m: java.lang.String): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
  def isMarkDef(mark: AnyMark): scala.Boolean = js.native
  def isPathMark(m: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark): scala.Boolean = js.native
  def isPathMark(m: Mark): scala.Boolean = js.native
  def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
  def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
  def isPrimitiveMark(mark: Mark): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
  def isPrimitiveMark(mark: MarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
}

