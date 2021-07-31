package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprOrSignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarCornerRadiusMixins[ES /* <: ExprOrSignalRef */] extends StObject {
  
  /**
    * - For vertical bars, top-left and top-right corner radius.
    * - For horizontal bars, top-right and bottom-right corner radius.
    */
  var cornerRadiusEnd: js.UndefOr[Double | ES] = js.undefined
}
object BarCornerRadiusMixins {
  
  @scala.inline
  def apply[ES /* <: ExprOrSignalRef */](): BarCornerRadiusMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarCornerRadiusMixins[ES]]
  }
  
  @scala.inline
  implicit class BarCornerRadiusMixinsMutableBuilder[Self <: BarCornerRadiusMixins[?], ES /* <: ExprOrSignalRef */] (val x: Self & BarCornerRadiusMixins[ES]) extends AnyVal {
    
    @scala.inline
    def setCornerRadiusEnd(value: Double | ES): Self = StObject.set(x, "cornerRadiusEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusEndUndefined: Self = StObject.set(x, "cornerRadiusEnd", js.undefined)
  }
}
