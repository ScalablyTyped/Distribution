package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitIconOptions extends StObject {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var ratio: js.UndefOr[Double] = js.undefined
}
object UIkitIconOptions {
  
  inline def apply(): UIkitIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitIconOptions]
  }
  
  extension [Self <: UIkitIconOptions](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
