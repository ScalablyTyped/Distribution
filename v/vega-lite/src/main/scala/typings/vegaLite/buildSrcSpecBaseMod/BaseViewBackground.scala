package typings.vegaLite.buildSrcSpecBaseMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecConfigMod.Cursor
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Pick<vega-lite.vega-lite/build/src/mark.MarkConfig<ES>, 'cornerRadius' | 'fillOpacity' | 'opacity' | 'strokeCap' | 'strokeDash' | 'strokeDashOffset' | 'strokeJoin' | 'strokeMiterLimit' | 'strokeOpacity' | 'strokeWidth'>> */
trait BaseViewBackground[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  var cornerRadius: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * The mouse cursor used over the view. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
    */
  var cursor: js.UndefOr[Cursor] = js.undefined
  
  /**
    * The fill color.
    *
    * __Default value:__ `undefined`
    */
  var fill: js.UndefOr[Color | Null | ES] = js.undefined
  
  var fillOpacity: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var opacity: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * The stroke color.
    *
    * __Default value:__ `"#ddd"`
    */
  var stroke: js.UndefOr[Color | Null | ES] = js.undefined
  
  var strokeCap: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/config.StrokeCap | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/config.StrokeCap | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/config.StrokeCap | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var strokeDash: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends std.Array<number> | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<std.Array<number> | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<std.Array<number> | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var strokeDashOffset: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var strokeJoin: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/config.StrokeJoin | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/config.StrokeJoin | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/config.StrokeJoin | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var strokeMiterLimit: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var strokeOpacity: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var strokeWidth: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
}
object BaseViewBackground {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): BaseViewBackground[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseViewBackground[ES]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseViewBackground[?], ES /* <: ExprRef | SignalRef */] (val x: Self & BaseViewBackground[ES]) extends AnyVal {
    
    inline def setCornerRadius(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFill(value: Color | ES): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillNull: Self = StObject.set(x, "fill", null)
    
    inline def setFillOpacity(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setOpacity(value: Double | ES): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStroke(value: Color | ES): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeCap(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/config.StrokeCap | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/config.StrokeCap | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/config.StrokeCap | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    inline def setStrokeDash(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends std.Array<number> | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<std.Array<number> | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<std.Array<number> | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashOffset(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
    
    inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    inline def setStrokeJoin(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/config.StrokeJoin | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/config.StrokeJoin | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/config.StrokeJoin | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    inline def setStrokeMiterLimit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    inline def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
    
    inline def setStrokeNull: Self = StObject.set(x, "stroke", null)
    
    inline def setStrokeOpacity(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
