package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Gradient
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
  
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
}
object ColorMixins {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): ColorMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMixins[ES]]
  }
  
  extension [Self <: ColorMixins[?], ES /* <: ExprRef | SignalRef */](x: Self & ColorMixins[ES]) {
    
    inline def setColor(value: Color | Gradient | ES): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
