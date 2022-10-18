package typings.vegaLite.buildSrcSpecBaseMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewBackground[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with BaseViewBackground[ES] {
  
  /**
    * A string or array of strings indicating the name of custom styles to apply to the view background. A style is a named collection of mark property defaults defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles.
    *
    * __Default value:__ `"cell"`
    * __Note:__ Any specified view background properties will augment the default style.
    */
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ViewBackground {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): ViewBackground[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBackground[ES]]
  }
  
  extension [Self <: ViewBackground[?], ES /* <: ExprRef | SignalRef */](x: Self & ViewBackground[ES]) {
    
    inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
