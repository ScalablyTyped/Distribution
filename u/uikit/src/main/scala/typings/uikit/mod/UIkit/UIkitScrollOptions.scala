package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitScrollOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
}
object UIkitScrollOptions {
  
  inline def apply(): UIkitScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollOptions]
  }
  
  extension [Self <: UIkitScrollOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
