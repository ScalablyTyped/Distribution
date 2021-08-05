package typings.vegaLite.specBaseMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.container
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedFrameMixins extends StObject {
  
  /**
    * __Deprecated:__ Please avoid using width in a unit spec that's a part of a layer spec.
    */
  var height: js.UndefOr[Double | container | Step] = js.undefined
  
  /**
    * __Deprecated:__ Please avoid using width in a unit spec that's a part of a layer spec.
    */
  var view: js.UndefOr[ViewBackground[ExprRef | SignalRef]] = js.undefined
  
  /**
    * __Deprecated:__ Please avoid using width in a unit spec that's a part of a layer spec.
    */
  var width: js.UndefOr[Double | container | Step] = js.undefined
}
object DeprecatedFrameMixins {
  
  inline def apply(): DeprecatedFrameMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprecatedFrameMixins]
  }
  
  extension [Self <: DeprecatedFrameMixins](x: Self) {
    
    inline def setHeight(value: Double | container | Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setView(value: ViewBackground[ExprRef | SignalRef]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double | container | Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
