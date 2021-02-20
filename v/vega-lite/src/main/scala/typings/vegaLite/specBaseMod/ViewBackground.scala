package typings.vegaLite.specBaseMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewBackground[ES /* <: ExprRef | SignalRef */] extends BaseViewBackground[ES] {
  
  /**
    * A string or array of strings indicating the name of custom styles to apply to the view background. A style is a named collection of mark property defaults defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles.
    *
    * __Default value:__ `"cell"`
    * __Note:__ Any specified view background properties will augment the default style.
    */
  var style: js.UndefOr[String | js.Array[String]] = js.native
}
object ViewBackground {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): ViewBackground[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBackground[ES]]
  }
  
  @scala.inline
  implicit class ViewBackgroundMutableBuilder[Self <: ViewBackground[_], ES /* <: ExprRef | SignalRef */] (val x: Self with ViewBackground[ES]) extends AnyVal {
    
    @scala.inline
    def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
  }
}
