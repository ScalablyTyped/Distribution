package typings.vegaLite.srcMarkMod

import typings.std.Set
import typings.vegaLite.compositemarkMod.CompositeMark
import typings.vegaLite.compositemarkMod.CompositeMarkDef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcMarkMod.^
import typings.vegaLite.vegaLiteStrings.arc
import typings.vegaLite.vegaLiteStrings.area
import typings.vegaLite.vegaLiteStrings.bar
import typings.vegaLite.vegaLiteStrings.circle
import typings.vegaLite.vegaLiteStrings.color
import typings.vegaLite.vegaLiteStrings.fill
import typings.vegaLite.vegaLiteStrings.fillOpacity
import typings.vegaLite.vegaLiteStrings.filled
import typings.vegaLite.vegaLiteStrings.geoshape
import typings.vegaLite.vegaLiteStrings.hide
import typings.vegaLite.vegaLiteStrings.image
import typings.vegaLite.vegaLiteStrings.invalid
import typings.vegaLite.vegaLiteStrings.line
import typings.vegaLite.vegaLiteStrings.mark
import typings.vegaLite.vegaLiteStrings.order
import typings.vegaLite.vegaLiteStrings.point
import typings.vegaLite.vegaLiteStrings.radius2
import typings.vegaLite.vegaLiteStrings.rect
import typings.vegaLite.vegaLiteStrings.rule
import typings.vegaLite.vegaLiteStrings.square
import typings.vegaLite.vegaLiteStrings.stroke
import typings.vegaLite.vegaLiteStrings.strokeDash
import typings.vegaLite.vegaLiteStrings.strokeDashOffset
import typings.vegaLite.vegaLiteStrings.strokeJoin
import typings.vegaLite.vegaLiteStrings.strokeMiterLimit
import typings.vegaLite.vegaLiteStrings.strokeOpacity
import typings.vegaLite.vegaLiteStrings.strokeWidth
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.theta2
import typings.vegaLite.vegaLiteStrings.tick
import typings.vegaLite.vegaLiteStrings.timeUnitBandPosition
import typings.vegaLite.vegaLiteStrings.timeUnitBandSize
import typings.vegaLite.vegaLiteStrings.trail
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ARC: arc = ^.asInstanceOf[js.Dynamic].selectDynamic("ARC").asInstanceOf[arc]

inline def AREA: area = ^.asInstanceOf[js.Dynamic].selectDynamic("AREA").asInstanceOf[area]

inline def BAR: bar = ^.asInstanceOf[js.Dynamic].selectDynamic("BAR").asInstanceOf[bar]

inline def CIRCLE: circle = ^.asInstanceOf[js.Dynamic].selectDynamic("CIRCLE").asInstanceOf[circle]

inline def FILL_CONFIG: js.Tuple2[fill, fillOpacity] = ^.asInstanceOf[js.Dynamic].selectDynamic("FILL_CONFIG").asInstanceOf[js.Tuple2[fill, fillOpacity]]

inline def FILL_STROKE_CONFIG: js.Array[
fill | fillOpacity | stroke | strokeOpacity | strokeWidth | strokeDash | strokeDashOffset | strokeJoin | strokeMiterLimit] = ^.asInstanceOf[js.Dynamic].selectDynamic("FILL_STROKE_CONFIG").asInstanceOf[js.Array[
fill | fillOpacity | stroke | strokeOpacity | strokeWidth | strokeDash | strokeDashOffset | strokeJoin | strokeMiterLimit]]

inline def GEOSHAPE: geoshape = ^.asInstanceOf[js.Dynamic].selectDynamic("GEOSHAPE").asInstanceOf[geoshape]

inline def IMAGE: image = ^.asInstanceOf[js.Dynamic].selectDynamic("IMAGE").asInstanceOf[image]

inline def LINE: line = ^.asInstanceOf[js.Dynamic].selectDynamic("LINE").asInstanceOf[line]

inline def MARK_CONFIGS: js.Array[
/* keyof vega-lite.vega-lite/build/src/mark.MarkConfigMixins<any> */ mark | arc | area | bar | circle | image | line | point | rect | rule | square | text | tick | trail | geoshape] = ^.asInstanceOf[js.Dynamic].selectDynamic("MARK_CONFIGS").asInstanceOf[js.Array[
/* keyof vega-lite.vega-lite/build/src/mark.MarkConfigMixins<any> */ mark | arc | area | bar | circle | image | line | point | rect | rule | square | text | tick | trail | geoshape]]

inline def POINT: point = ^.asInstanceOf[js.Dynamic].selectDynamic("POINT").asInstanceOf[point]

inline def PRIMITIVE_MARKS: Set[
square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick] = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_MARKS").asInstanceOf[Set[
square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick]]

inline def RECT: rect = ^.asInstanceOf[js.Dynamic].selectDynamic("RECT").asInstanceOf[rect]

inline def RULE: rule = ^.asInstanceOf[js.Dynamic].selectDynamic("RULE").asInstanceOf[rule]

inline def SQUARE: square = ^.asInstanceOf[js.Dynamic].selectDynamic("SQUARE").asInstanceOf[square]

inline def STROKE_CONFIG: js.Tuple7[
stroke, 
strokeWidth, 
strokeDash, 
strokeDashOffset, 
strokeOpacity, 
strokeJoin, 
strokeMiterLimit] = ^.asInstanceOf[js.Dynamic].selectDynamic("STROKE_CONFIG").asInstanceOf[js.Tuple7[
stroke, 
strokeWidth, 
strokeDash, 
strokeDashOffset, 
strokeOpacity, 
strokeJoin, 
strokeMiterLimit]]

inline def TEXT: text = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXT").asInstanceOf[text]

inline def TICK: tick = ^.asInstanceOf[js.Dynamic].selectDynamic("TICK").asInstanceOf[tick]

inline def TRAIL: trail = ^.asInstanceOf[js.Dynamic].selectDynamic("TRAIL").asInstanceOf[trail]

inline def VL_ONLY_MARK_CONFIG_PROPERTIES: js.Array[
/* keyof vega-lite.vega-lite/build/src/mark.VLOnlyMarkConfig<any> */ filled | invalid | order | timeUnitBandPosition | timeUnitBandSize | theta2 | radius2 | color] = ^.asInstanceOf[js.Dynamic].selectDynamic("VL_ONLY_MARK_CONFIG_PROPERTIES").asInstanceOf[js.Array[
/* keyof vega-lite.vega-lite/build/src/mark.VLOnlyMarkConfig<any> */ filled | invalid | order | timeUnitBandPosition | timeUnitBandSize | theta2 | radius2 | color]]

inline def defaultBarConfig: RectConfig[SignalRef] = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultBarConfig").asInstanceOf[RectConfig[SignalRef]]

inline def defaultMarkConfig: MarkConfig[SignalRef] = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultMarkConfig").asInstanceOf[MarkConfig[SignalRef]]

inline def defaultRectConfig: RectConfig[SignalRef] = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultRectConfig").asInstanceOf[RectConfig[SignalRef]]

inline def defaultTickConfig: TickConfig[SignalRef] = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTickConfig").asInstanceOf[TickConfig[SignalRef]]

inline def getMarkType(m: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMarkType")(m.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def getMarkType(m: GenericMarkDef[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMarkType")(m.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def isMark(m: String): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMark")(m.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean]

inline def isMarkDef(mark: String): /* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkDef")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ Boolean]
inline def isMarkDef(mark: GenericMarkDef[Any]): /* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkDef")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ Boolean]

inline def isPathMark(m: CompositeMark): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathMark")(m.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isPathMark(m: Mark): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathMark")(m.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isPrimitiveMark(mark: AnyMark): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitiveMark")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean]

inline def isRectBasedMark(m: CompositeMark): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRectBasedMark")(m.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isRectBasedMark(m: Mark): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRectBasedMark")(m.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isRelativeBandSize(o: Double): /* is vega-lite.vega-lite/build/src/mark.RelativeBandSize */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeBandSize")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.RelativeBandSize */ Boolean]
inline def isRelativeBandSize(o: ExprRef): /* is vega-lite.vega-lite/build/src/mark.RelativeBandSize */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeBandSize")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.RelativeBandSize */ Boolean]
inline def isRelativeBandSize(o: RelativeBandSize): /* is vega-lite.vega-lite/build/src/mark.RelativeBandSize */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeBandSize")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.RelativeBandSize */ Boolean]
inline def isRelativeBandSize(o: SignalRef): /* is vega-lite.vega-lite/build/src/mark.RelativeBandSize */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeBandSize")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.RelativeBandSize */ Boolean]

type AnyMark = CompositeMark | CompositeMarkDef | Mark | (MarkDef[Mark, ExprRef | SignalRef])

type BandSize = Double | RelativeBandSize | SignalRef

type Hide = hide
