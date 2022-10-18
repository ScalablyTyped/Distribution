package typings.vegaLite.buildSrcMarkMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkConfigMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  /** Arc-specific Config */
  var arc: js.UndefOr[RectConfig[ES]] = js.undefined
  
  /** Area-Specific Config */
  var area: js.UndefOr[AreaConfig[ES]] = js.undefined
  
  /** Bar-Specific Config */
  var bar: js.UndefOr[BarConfig[ES]] = js.undefined
  
  /** Circle-Specific Config */
  var circle: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /** Geoshape-Specific Config */
  var geoshape: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /** Image-specific Config */
  var image: js.UndefOr[RectConfig[ES]] = js.undefined
  
  /** Line-Specific Config */
  var line: js.UndefOr[LineConfig[ES]] = js.undefined
  
  /** Mark Config */
  var mark: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /** Point-Specific Config */
  var point: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /** Rect-Specific Config */
  var rect: js.UndefOr[RectConfig[ES]] = js.undefined
  
  /** Rule-Specific Config */
  var rule: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /** Square-Specific Config */
  var square: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /** Text-Specific Config */
  var text: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /** Tick-Specific Config */
  var tick: js.UndefOr[TickConfig[ES]] = js.undefined
  
  /** Trail-Specific Config */
  var trail: js.UndefOr[LineConfig[ES]] = js.undefined
}
object MarkConfigMixins {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): MarkConfigMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkConfigMixins[ES]]
  }
  
  extension [Self <: MarkConfigMixins[?], ES /* <: ExprRef | SignalRef */](x: Self & MarkConfigMixins[ES]) {
    
    inline def setArc(value: RectConfig[ES]): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setArea(value: AreaConfig[ES]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setBar(value: BarConfig[ES]): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setCircle(value: MarkConfig[ES]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setGeoshape(value: MarkConfig[ES]): Self = StObject.set(x, "geoshape", value.asInstanceOf[js.Any])
    
    inline def setGeoshapeUndefined: Self = StObject.set(x, "geoshape", js.undefined)
    
    inline def setImage(value: RectConfig[ES]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLine(value: LineConfig[ES]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMark(value: MarkConfig[ES]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setPoint(value: MarkConfig[ES]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setRect(value: RectConfig[ES]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setRule(value: MarkConfig[ES]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setSquare(value: MarkConfig[ES]): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    inline def setText(value: MarkConfig[ES]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTick(value: TickConfig[ES]): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setTrail(value: LineConfig[ES]): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
    
    inline def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
  }
}
