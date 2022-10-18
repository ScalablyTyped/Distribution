package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitScrollOptions extends StObject {
  
  var offset: js.UndefOr[Double] = js.undefined
}
object UIkitScrollOptions {
  
  inline def apply(): UIkitScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollOptions]
  }
  
  extension [Self <: UIkitScrollOptions](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
