package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.filter
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VLOnlyMarkConfig[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with ColorMixins[ES] {
  
  /**
    * Whether the mark's color should be used as fill color instead of stroke color.
    *
    * __Default value:__ `false` for all `point`, `line`, and `rule` marks as well as `geoshape` marks for [`graticule`](https://vega.github.io/vega-lite/docs/data.html#graticule) data sources; otherwise, `true`.
    *
    * __Note:__ This property cannot be used in a [style config](https://vega.github.io/vega-lite/docs/mark.html#style-config).
    *
    */
  var filled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines how Vega-Lite should handle marks for invalid values (`null` and `NaN`).
    * - If set to `"filter"` (default), all data items with null values will be skipped (for line, trail, and area marks) or filtered (for other marks).
    * - If `null`, all data items are included. In this case, invalid values will be interpreted as zeroes.
    */
  var invalid: js.UndefOr[filter | Hide | Null] = js.undefined
  
  /**
    * For line and trail marks, this `order` property can be set to `null` or `false` to make the lines use the original order in the data sources.
    */
  var order: js.UndefOr[Null | Boolean] = js.undefined
  
  /**
    * The secondary (inner) radius in pixels of arc marks.
    *
    * __Default value:__ `0`
    * @minimum 0
    */
  var radius2: js.UndefOr[Double | ES] = js.undefined
  
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
}
object VLOnlyMarkConfig {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): VLOnlyMarkConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VLOnlyMarkConfig[ES]]
  }
  
  extension [Self <: VLOnlyMarkConfig[?], ES /* <: ExprRef | SignalRef */](x: Self & VLOnlyMarkConfig[ES]) {
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    inline def setInvalid(value: filter | Hide): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidNull: Self = StObject.set(x, "invalid", null)
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRadius2(value: Double | ES): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
    
    inline def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
    
    inline def setTheta2(value: Double | ES): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
    
    inline def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
    
    inline def setTimeUnitBandPosition(value: Double): Self = StObject.set(x, "timeUnitBandPosition", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitBandPositionUndefined: Self = StObject.set(x, "timeUnitBandPosition", js.undefined)
    
    inline def setTimeUnitBandSize(value: Double): Self = StObject.set(x, "timeUnitBandSize", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitBandSizeUndefined: Self = StObject.set(x, "timeUnitBandSize", js.undefined)
  }
}
