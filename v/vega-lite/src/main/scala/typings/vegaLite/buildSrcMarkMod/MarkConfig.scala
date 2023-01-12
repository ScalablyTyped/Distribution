package typings.vegaLite.buildSrcMarkMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.filter
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.width
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecEncodeMod.Align
import typings.vegaTypings.typesSpecEncodeMod.Gradient
import typings.vegaTypings.typesSpecEncodeMod.Orientation
import typings.vegaTypings.typesSpecEncodeMod.TextBaseline
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent vega-lite.vega-lite/build/src/mark.VLOnlyMarkConfig<ES> */
/* Inlined parent vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<std.Omit<vega.vega.MarkConfig, 'tooltip' | 'fill' | 'stroke'>, ES> */
trait MarkConfig[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with AnyMarkConfig[ES] {
  
  /**
    * The horizontal alignment of the text or ranged marks (area, bar, image, rect, rule). One of `"left"`, `"right"`, `"center"`.
    *
    * __Note:__ Expression reference is *not* supported for range marks.
    */
  var align: js.UndefOr[Align | ES] = js.undefined
  
  var angle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var aria: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var ariaRole: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var ariaRoleDescription: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var aspect: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * For text marks, the vertical text baseline. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, `"line-bottom"`, or an expression reference that provides one of the valid values.
    * The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`,
    * but are calculated relative to the `lineHeight` rather than `fontSize` alone.
    *
    * For range marks, the vertical alignment of the marks. One of `"top"`, `"middle"`, `"bottom"`.
    *
    * __Note:__ Expression reference is *not* supported for range marks.
    *
    */
  var baseline: js.UndefOr[TextBaseline | ES] = js.undefined
  
  var blend: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * Default color.
    *
    * __Default value:__ <span style="color: #4682b4;">&#9632;</span> `"#4682b4"`
    *
    * __Note:__
    * - This property cannot be used in a [style config](https://vega.github.io/vega-lite/docs/mark.html#style-config).
    * - The `fill` and `stroke` properties have higher precedence than `color` and will override `color`.
    */
  var color: js.UndefOr[Color | Gradient | ES] = js.undefined
  
  var cornerRadius: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var cornerRadiusBottomLeft: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var cornerRadiusBottomRight: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var cornerRadiusTopLeft: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var cornerRadiusTopRight: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var cursor: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/config.Cursor | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/config.Cursor | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/config.Cursor | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var description: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var dir: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.TextDirection | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.TextDirection | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.TextDirection | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var dx: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var dy: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var ellipsis: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined | undefined ? std.Exclude<string | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var endAngle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * Default fill color. This property has higher precedence than `config.color`. Set to `null` to remove fill.
    *
    * __Default value:__ (None)
    *
    */
  var fill: js.UndefOr[Color | Gradient | Null | ES] = js.undefined
  
  var fillOpacity: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * Whether the mark's color should be used as fill color instead of stroke color.
    *
    * __Default value:__ `false` for all `point`, `line`, and `rule` marks as well as `geoshape` marks for [`graticule`](https://vega.github.io/vega-lite/docs/data.html#graticule) data sources; otherwise, `true`.
    *
    * __Note:__ This property cannot be used in a [style config](https://vega.github.io/vega-lite/docs/mark.html#style-config).
    *
    */
  var filled: js.UndefOr[Boolean] = js.undefined
  
  var font: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var fontSize: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var fontStyle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.FontStyle | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.FontStyle | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.FontStyle | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var fontWeight: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.FontWeight | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.FontWeight | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.FontWeight | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var height: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var href: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * The inner radius in pixels of arc marks. `innerRadius` is an alias for `radius2`.
    *
    * __Default value:__ `0`
    * @minimum 0
    */
  var innerRadius: js.UndefOr[Double | ES] = js.undefined
  
  var interpolate: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * Defines how Vega-Lite should handle marks for invalid values (`null` and `NaN`).
    * - If set to `"filter"` (default), all data items with null values will be skipped (for line, trail, and area marks) or filtered (for other marks).
    * - If `null`, all data items are included. In this case, invalid values will be interpreted as zeroes.
    */
  var invalid: js.UndefOr[filter | Hide | Null] = js.undefined
  
  var limit: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var lineBreak: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var lineHeight: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * The overall opacity (value between [0,1]).
    *
    * __Default value:__ `0.7` for non-aggregate plots with `point`, `tick`, `circle`, or `square` marks or layered `bar` charts and `1` otherwise.
    *
    * @minimum 0
    * @maximum 1
    */
  var opacity: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * For line and trail marks, this `order` property can be set to `null` or `false` to make the lines use the original order in the data sources.
    */
  var order: js.UndefOr[Null | Boolean] = js.undefined
  
  /**
    * The orientation of a non-stacked bar, tick, area, and line charts.
    * The value is either horizontal (default) or vertical.
    * - For bar, rule and tick, this determines whether the size of the bar and tick
    * should be applied to x or y dimension.
    * - For area, this property determines the orient property of the Vega output.
    * - For line and trail marks, this property determines the sort order of the points in the line
    * if `config.sortLineBy` is not specified.
    * For stacked charts, this is always determined by the orientation of the stack;
    * therefore explicitly specified value will be ignored.
    */
  var orient: js.UndefOr[Orientation] = js.undefined
  
  /**
    * The outer radius in pixels of arc marks. `outerRadius` is an alias for `radius`.
    *
    * __Default value:__ `0`
    * @minimum 0
    */
  var outerRadius: js.UndefOr[Double | ES] = js.undefined
  
  var padAngle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    *
    * For arc mark, the primary (outer) radius in pixels.
    *
    * For text marks, polar coordinate radial offset, in pixels, of the text from the origin determined by the `x` and `y` properties.
    *
    * __Default value:__ `min(plot_width, plot_height)/2`
    * @minimum 0
    */
  var radius: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * The secondary (inner) radius in pixels of arc marks.
    *
    * __Default value:__ `0`
    * @minimum 0
    */
  var radius2: js.UndefOr[Double | ES] = js.undefined
  
  var shape: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * Default size for marks.
    * - For `point`/`circle`/`square`, this represents the pixel area of the marks. Note that this value sets the area of the symbol; the side lengths will increase with the square root of this value.
    * - For `bar`, this represents the band size of the bar, in pixels.
    * - For `text`, this represents the font size, in pixels.
    *
    * __Default value:__
    * - `30` for point, circle, square marks; width/height's `step`
    * - `2` for bar marks with discrete dimensions;
    * - `5` for bar marks with continuous dimensions;
    * - `11` for text marks.
    *
    * @minimum 0
    */
  var size: js.UndefOr[Double | ES] = js.undefined
  
  var smooth: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var startAngle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * Default stroke color. This property has higher precedence than `config.color`. Set to `null` to remove stroke.
    *
    * __Default value:__ (None)
    *
    */
  var stroke: js.UndefOr[Color | Gradient | Null | ES] = js.undefined
  
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
  
  var strokeOffset: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var strokeOpacity: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var strokeWidth: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var tension: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var text: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * - For arc marks, the arc length in radians if theta2 is not specified, otherwise the start arc angle. (A value of 0 indicates up or “north”, increasing values proceed clockwise.)
    *
    * - For text marks, polar coordinate angle in radians.
    *
    * @minimum 0
    * @maximum 360
    */
  var theta: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * The end angle of arc marks in radians. A value of 0 indicates up or “north”, increasing values proceed clockwise.
    */
  var theta2: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Default relative band position for a time unit. If set to `0`, the marks will be positioned at the beginning of the time unit band step.
    * If set to `0.5`, the marks will be positioned in the middle of the time unit band step.
    */
  var timeUnitBandPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * Default relative band size for a time unit. If set to `1`, the bandwidth of the marks will be equal to the time unit band step.
    * If set to `0.5`, bandwidth of the marks will be half of the time unit band step.
    */
  var timeUnitBandSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The tooltip text string to show upon mouse hover or an object defining which fields should the tooltip be derived from.
    *
    * - If `tooltip` is `true` or `{"content": "encoding"}`, then all fields from `encoding` will be used.
    * - If `tooltip` is `{"content": "data"}`, then all fields that appear in the highlighted data point will be used.
    * - If set to `null` or `false`, then no tooltip will be used.
    *
    * See the [`tooltip`](https://vega.github.io/vega-lite/docs/tooltip.html) documentation for a detailed discussion about tooltip  in Vega-Lite.
    *
    * __Default value:__ `null`
    */
  var tooltip: js.UndefOr[Double | String | Boolean | TooltipContent | ES | Null] = js.undefined
  
  var url: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var width: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * X coordinates of the marks, or width of horizontal `"bar"` and `"area"` without specified `x2` or `width`.
    *
    * The `value` of this channel can be a number or a string `"width"` for the width of the plot.
    */
  var x: js.UndefOr[Double | width | ES] = js.undefined
  
  /**
    * X2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
    *
    * The `value` of this channel can be a number or a string `"width"` for the width of the plot.
    */
  var x2: js.UndefOr[Double | width | ES] = js.undefined
  
  /**
    * Y coordinates of the marks, or height of vertical `"bar"` and `"area"` without specified `y2` or `height`.
    *
    * The `value` of this channel can be a number or a string `"height"` for the height of the plot.
    */
  var y: js.UndefOr[Double | height | ES] = js.undefined
  
  /**
    * Y2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
    *
    * The `value` of this channel can be a number or a string `"height"` for the height of the plot.
    */
  var y2: js.UndefOr[Double | height | ES] = js.undefined
}
object MarkConfig {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): MarkConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkConfig[ES]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkConfig[?], ES /* <: ExprRef | SignalRef */] (val x: Self & MarkConfig[ES]) extends AnyVal {
    
    inline def setAlign(value: Align | ES): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAngle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAria(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaRole(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
    
    inline def setAriaRoleDescription(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
    
    inline def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setAspect(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setBaseline(value: TextBaseline | ES): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setBlend(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    inline def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    inline def setColor(value: Color | Gradient | ES): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCornerRadius(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusBottomLeft(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
    
    inline def setCornerRadiusBottomRight(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
    
    inline def setCornerRadiusTopLeft(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
    
    inline def setCornerRadiusTopRight(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "cornerRadiusTopRight", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusTopRightUndefined: Self = StObject.set(x, "cornerRadiusTopRight", js.undefined)
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setCursor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/config.Cursor | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/config.Cursor | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/config.Cursor | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDescription(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDir(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.TextDirection | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.TextDirection | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.TextDirection | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDx(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setEllipsis(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined | undefined ? std.Exclude<string | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setEndAngle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setFill(value: Color | Gradient | ES): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillNull: Self = StObject.set(x, "fill", null)
    
    inline def setFillOpacity(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    inline def setFont(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.FontStyle | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.FontStyle | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.FontStyle | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontWeight(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.FontWeight | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.FontWeight | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.FontWeight | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setHeight(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setInnerRadius(value: Double | ES): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setInterpolate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setInvalid(value: filter | Hide): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidNull: Self = StObject.set(x, "invalid", null)
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setLimit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLineBreak(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
    
    inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
    
    inline def setLineHeight(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setOpacity(value: Double | ES): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrient(value: Orientation): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setOuterRadius(value: Double | ES): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    inline def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    inline def setPadAngle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    inline def setRadius(value: Double | ES): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadius2(value: Double | ES): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
    
    inline def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setShape(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double | ES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSmooth(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    inline def setStartAngle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setStroke(value: Color | Gradient | ES): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
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
    
    inline def setStrokeOffset(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
    
    inline def setStrokeOpacity(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setTension(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    inline def setText(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheta(value: Double | ES): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setTheta2(value: Double | ES): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
    
    inline def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
    
    inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
    inline def setTimeUnitBandPosition(value: Double): Self = StObject.set(x, "timeUnitBandPosition", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitBandPositionUndefined: Self = StObject.set(x, "timeUnitBandPosition", js.undefined)
    
    inline def setTimeUnitBandSize(value: Double): Self = StObject.set(x, "timeUnitBandSize", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitBandSizeUndefined: Self = StObject.set(x, "timeUnitBandSize", js.undefined)
    
    inline def setTooltip(value: Double | String | Boolean | TooltipContent | ES): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double | width | ES): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double | width | ES): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | height | ES): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double | height | ES): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
