package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_0 extends js.Object {
  val AREA: vegaDashEmbedLib.vegaDashEmbedLibStrings.area = js.native
  val BAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.bar = js.native
  val CIRCLE: vegaDashEmbedLib.vegaDashEmbedLibStrings.circle = js.native
  val FILL_CONFIG: js.Array[java.lang.String] = js.native
  val FILL_STROKE_CONFIG: js.Array[_] = js.native
  val GEOSHAPE: vegaDashEmbedLib.vegaDashEmbedLibStrings.geoshape = js.native
  val LINE: vegaDashEmbedLib.vegaDashEmbedLibStrings.line = js.native
  val MarkNs: Anon_AREA = js.native
  val POINT: vegaDashEmbedLib.vegaDashEmbedLibStrings.point = js.native
  val PRIMITIVE_MARKS: js.Array[vegaDashLiteLib.buildSrcMarkMod.Mark] = js.native
  val RECT: vegaDashEmbedLib.vegaDashEmbedLibStrings.rect = js.native
  val RULE: vegaDashEmbedLib.vegaDashEmbedLibStrings.rule = js.native
  val SQUARE: vegaDashEmbedLib.vegaDashEmbedLibStrings.square = js.native
  val STROKE_CONFIG: js.Array[java.lang.String] = js.native
  val TEXT: vegaDashEmbedLib.vegaDashEmbedLibStrings.text = js.native
  val TICK: vegaDashEmbedLib.vegaDashEmbedLibStrings.tick = js.native
  val TRAIL: vegaDashEmbedLib.vegaDashEmbedLibStrings.trail = js.native
  val VL_ONLY_MARK_CONFIG_PROPERTIES: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.filled | vegaDashEmbedLib.vegaDashEmbedLibStrings.color
  ] = js.native
  val VL_ONLY_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in std.Array<vega-lite.vega-lite/build/src/mark.Mark>[0] ]:? std.Array<'mark' | 'area' | 'bar' | 'circle' | 'line' | 'point' | 'rect' | 'rule' | 'square' | 'text' | 'tick' | 'trail' | 'geoshape'[k]>}
    */ vegaDashEmbedLib.vegaDashEmbedLibStrings.Anon_0 with js.Any = js.native
  val defaultBarConfig: vegaDashLiteLib.buildSrcMarkMod.BarConfig = js.native
  val defaultMarkConfig: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = js.native
  val defaultTickConfig: vegaDashLiteLib.buildSrcMarkMod.TickConfig = js.native
  def isMark(m: java.lang.String): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
  def isMarkDef(mark: vegaDashLiteLib.buildSrcMarkMod.AnyMark): scala.Boolean = js.native
  def isPathMark(m: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark): scala.Boolean = js.native
  def isPathMark(m: vegaDashLiteLib.buildSrcMarkMod.Mark): scala.Boolean = js.native
  def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
  def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
  def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcMarkMod.Mark): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
  def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcMarkMod.MarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
}

