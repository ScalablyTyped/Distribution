package typings.vegaLite.channeldefMod

import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcTypeMod.Type
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<vega-lite.vega-lite/build/src/channeldef.TypeMixins<vega-lite.vega-lite/build/src/type.Type>> */
/* Inlined parent vega-lite.vega-lite/build/src/channeldef.BandMixins */
/* Inlined parent vega-lite.vega-lite/build/src/guide.TitleMixins */
trait DatumDef[F /* <: Field */, V /* <: PrimitiveValue | DateTime | ExprRef | SignalRef */] extends StObject {
  
  /**
    * Relative position on a band of a stacked, binned, time unit, or band scale. For example, the marks will be positioned at the beginning of the band if set to `0`, and at the middle of the band if set to `0.5`.
    *
    * @minimum 0
    * @maximum 1
    */
  var bandPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * A constant value in data domain.
    */
  var datum: js.UndefOr[V | RepeatRef] = js.undefined
  
  /**
    * A title for the field. If `null`, the title will be removed.
    *
    * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`). If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`). Otherwise, the title is simply the field name.
    *
    * __Notes__:
    *
    * 1) You can customize the default field title format by providing the [`fieldTitle`](https://vega.github.io/vega-lite/docs/config.html#top-level-config) property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/usage/compile.html#field-title).
    *
    * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
    */
  var title: js.UndefOr[Text | Null | SignalRef] = js.undefined
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object DatumDef {
  
  inline def apply[F /* <: Field */, V /* <: PrimitiveValue | DateTime | ExprRef | SignalRef */](): DatumDef[F, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatumDef[F, V]]
  }
  
  extension [Self <: DatumDef[?, ?], F /* <: Field */, V /* <: PrimitiveValue | DateTime | ExprRef | SignalRef */](x: Self & (DatumDef[F, V])) {
    
    inline def setBandPosition(value: Double): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
    
    inline def setDatum(value: V | RepeatRef): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
