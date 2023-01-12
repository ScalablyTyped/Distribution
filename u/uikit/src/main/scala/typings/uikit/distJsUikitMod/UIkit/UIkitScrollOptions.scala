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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIkitScrollOptions] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
