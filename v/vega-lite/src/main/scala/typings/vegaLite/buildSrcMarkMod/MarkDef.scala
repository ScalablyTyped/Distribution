package typings.vegaLite.buildSrcMarkMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.filter
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.transparent
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

/* Inlined parent vega-lite.vega-lite/build/src/mark.GenericMarkDef<M> */
/* Inlined parent std.Omit<vega-lite.vega-lite/build/src/mark.MarkConfig<ES> & vega-lite.vega-lite/build/src/mark.AreaConfig<ES> & vega-lite.vega-lite/build/src/mark.BarConfig<ES> & // always extends RectConfig
vega-lite.vega-lite/build/src/mark.LineConfig<ES> & vega-lite.vega-lite/build/src/mark.TickConfig<ES>, 'startAngle' | 'endAngle' | 'width' | 'height'> */
/* Inlined parent vega-lite.vega-lite/build/src/mark.MarkDefMixins<ES> */
trait MarkDef[M /* <: String | Mark */, ES /* <: ExprRef | SignalRef */] extends StObject {
  
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
  
  var bandSize: js.UndefOr[Double] = js.undefined
  
  var baseline: js.UndefOr[TextBaseline | ES] = js.undefined
  
  var binSpacing: js.UndefOr[Double] = js.undefined
  
  var blend: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * Whether a mark be clipped to the enclosing group’s width and height.
    */
  var clip: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[Color | Gradient | ES] = js.undefined
  
  var continuousBandSize: js.UndefOr[Double] = js.undefined
  
  var cornerRadius: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var cornerRadiusBottomLeft: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var cornerRadiusBottomRight: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var cornerRadiusEnd: js.UndefOr[Double | ES] = js.undefined
  
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
  
  var discreteBandSize: js.UndefOr[Double | RelativeBandSize] = js.undefined
  
  var dx: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var dy: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var ellipsis: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined | undefined ? std.Exclude<string | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * @hidden
    */
  var endAngle: js.UndefOr[Double | ES] = js.undefined
  
  var fill: js.UndefOr[Color | Gradient | Null | ES] = js.undefined
  
  var fillOpacity: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
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
  
  /**
    * Height of the marks.  One of:
    *
    * - A number representing a fixed pixel height.
    *
    * - A relative band size definition.  For example, `{band: 0.5}` represents half of the band
    */
  var height: js.UndefOr[Double | ES | RelativeBandSize] = js.undefined
  
  var href: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var innerRadius: js.UndefOr[Double | ES] = js.undefined
  
  var interpolate: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Interpolate | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var invalid: js.UndefOr[filter | Hide | Null] = js.undefined
  
  var limit: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var line: js.UndefOr[Boolean | OverlayMarkDef[ES]] = js.undefined
  
  var lineBreak: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var lineHeight: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var opacity: js.UndefOr[Double | ES] = js.undefined
  
  var order: js.UndefOr[Null | Boolean] = js.undefined
  
  var orient: js.UndefOr[Orientation] = js.undefined
  
  var outerRadius: js.UndefOr[Double | ES] = js.undefined
  
  var padAngle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var point: js.UndefOr[Boolean | OverlayMarkDef[ES] | transparent] = js.undefined
  
  var radius: js.UndefOr[Double | ES] = js.undefined
  
  var radius2: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for radius2.
    */
  var radius2Offset: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for radius.
    */
  var radiusOffset: js.UndefOr[Double | ES] = js.undefined
  
  var shape: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.SymbolShape | string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var size: js.UndefOr[Double | ES] = js.undefined
  
  var smooth: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * @hidden
    */
  var startAngle: js.UndefOr[Double | ES] = js.undefined
  
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
  
  /**
    * A string or array of strings indicating the name of custom styles to apply to the mark. A style is a named collection of mark property defaults defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles. Any [mark properties](https://vega.github.io/vega-lite/docs/encoding.html#mark-prop) explicitly defined within the `encoding` will override a style default.
    *
    * __Default value:__ The mark's name. For example, a bar mark will have style `"bar"` by default.
    * __Note:__ Any specified style will augment the default style. For example, a bar mark with `"style": "foo"` will receive from `config.style.bar` and `config.style.foo` (the specified style `"foo"` has higher precedence).
    */
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tension: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var text: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Text | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  var theta: js.UndefOr[Double | ES] = js.undefined
  
  var theta2: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for theta2.
    */
  var theta2Offset: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for theta.
    */
  var thetaOffset: js.UndefOr[Double | ES] = js.undefined
  
  var thickness: js.UndefOr[Double | SignalRef] = js.undefined
  
  var timeUnitBandPosition: js.UndefOr[Double] = js.undefined
  
  var timeUnitBandSize: js.UndefOr[Double] = js.undefined
  
  var tooltip: js.UndefOr[Double | String | Boolean | TooltipContent | ES | Null] = js.undefined
  
  /**
    * The mark type. This could a primitive mark type
    * (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
    * `"area"`, `"point"`, `"geoshape"`, `"rule"`, and `"text"`)
    * or a composite mark type (`"boxplot"`, `"errorband"`, `"errorbar"`).
    */
  var `type`: M
  
  var url: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
  ] = js.undefined
  
  /**
    * Width of the marks.  One of:
    *
    * - A number representing a fixed pixel width.
    *
    * - A relative band size definition.  For example, `{band: 0.5}` represents half of the band.
    */
  var width: js.UndefOr[Double | ES | RelativeBandSize] = js.undefined
  
  var x: js.UndefOr[Double | width | ES] = js.undefined
  
  var x2: js.UndefOr[Double | width | ES] = js.undefined
  
  /**
    * Offset for x2-position.
    */
  var x2Offset: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for x-position.
    */
  var xOffset: js.UndefOr[Double | ES] = js.undefined
  
  var y: js.UndefOr[Double | height | ES] = js.undefined
  
  var y2: js.UndefOr[Double | height | ES] = js.undefined
  
  /**
    * Offset for y2-position.
    */
  var y2Offset: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for y-position.
    */
  var yOffset: js.UndefOr[Double | ES] = js.undefined
}
object MarkDef {
  
  inline def apply[M /* <: String | Mark */, ES /* <: ExprRef | SignalRef */](`type`: M): MarkDef[M, ES] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkDef[M, ES]]
  }
  
  extension [Self <: MarkDef[?, ?], M /* <: String | Mark */, ES /* <: ExprRef | SignalRef */](x: Self & (MarkDef[M, ES])) {
    
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
    
    inline def setBandSize(value: Double): Self = StObject.set(x, "bandSize", value.asInstanceOf[js.Any])
    
    inline def setBandSizeUndefined: Self = StObject.set(x, "bandSize", js.undefined)
    
    inline def setBaseline(value: TextBaseline | ES): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setBinSpacing(value: Double): Self = StObject.set(x, "binSpacing", value.asInstanceOf[js.Any])
    
    inline def setBinSpacingUndefined: Self = StObject.set(x, "binSpacing", js.undefined)
    
    inline def setBlend(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/encode.Blend | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    inline def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setColor(value: Color | Gradient | ES): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContinuousBandSize(value: Double): Self = StObject.set(x, "continuousBandSize", value.asInstanceOf[js.Any])
    
    inline def setContinuousBandSizeUndefined: Self = StObject.set(x, "continuousBandSize", js.undefined)
    
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
    
    inline def setCornerRadiusEnd(value: Double | ES): Self = StObject.set(x, "cornerRadiusEnd", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusEndUndefined: Self = StObject.set(x, "cornerRadiusEnd", js.undefined)
    
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
    
    inline def setDiscreteBandSize(value: Double | RelativeBandSize): Self = StObject.set(x, "discreteBandSize", value.asInstanceOf[js.Any])
    
    inline def setDiscreteBandSizeUndefined: Self = StObject.set(x, "discreteBandSize", js.undefined)
    
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
    
    inline def setEndAngle(value: Double | ES): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
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
    
    inline def setHeight(value: Double | ES | RelativeBandSize): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
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
    
    inline def setLine(value: Boolean | OverlayMarkDef[ES]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineBreak(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
    
    inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
    
    inline def setLineHeight(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
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
    
    inline def setPoint(value: Boolean | OverlayMarkDef[ES] | transparent): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setRadius(value: Double | ES): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadius2(value: Double | ES): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
    
    inline def setRadius2Offset(value: Double | ES): Self = StObject.set(x, "radius2Offset", value.asInstanceOf[js.Any])
    
    inline def setRadius2OffsetUndefined: Self = StObject.set(x, "radius2Offset", js.undefined)
    
    inline def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
    
    inline def setRadiusOffset(value: Double | ES): Self = StObject.set(x, "radiusOffset", value.asInstanceOf[js.Any])
    
    inline def setRadiusOffsetUndefined: Self = StObject.set(x, "radiusOffset", js.undefined)
    
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
    
    inline def setStartAngle(value: Double | ES): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
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
    
    inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
    
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
    
    inline def setTheta2Offset(value: Double | ES): Self = StObject.set(x, "theta2Offset", value.asInstanceOf[js.Any])
    
    inline def setTheta2OffsetUndefined: Self = StObject.set(x, "theta2Offset", js.undefined)
    
    inline def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
    
    inline def setThetaOffset(value: Double | ES): Self = StObject.set(x, "thetaOffset", value.asInstanceOf[js.Any])
    
    inline def setThetaOffsetUndefined: Self = StObject.set(x, "thetaOffset", js.undefined)
    
    inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
    inline def setThickness(value: Double | SignalRef): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setTimeUnitBandPosition(value: Double): Self = StObject.set(x, "timeUnitBandPosition", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitBandPositionUndefined: Self = StObject.set(x, "timeUnitBandPosition", js.undefined)
    
    inline def setTimeUnitBandSize(value: Double): Self = StObject.set(x, "timeUnitBandSize", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitBandSizeUndefined: Self = StObject.set(x, "timeUnitBandSize", js.undefined)
    
    inline def setTooltip(value: Double | String | Boolean | TooltipContent | ES): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: M): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double | ES | RelativeBandSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double | width | ES): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double | width | ES): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Offset(value: Double | ES): Self = StObject.set(x, "x2Offset", value.asInstanceOf[js.Any])
    
    inline def setX2OffsetUndefined: Self = StObject.set(x, "x2Offset", js.undefined)
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setXOffset(value: Double | ES): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    inline def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | height | ES): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double | height | ES): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Offset(value: Double | ES): Self = StObject.set(x, "y2Offset", value.asInstanceOf[js.Any])
    
    inline def setY2OffsetUndefined: Self = StObject.set(x, "y2Offset", js.undefined)
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    inline def setYOffset(value: Double | ES): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    inline def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
