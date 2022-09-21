package typings.uikit.uikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitMarginOptions extends StObject {
  
  var `first-column`: js.UndefOr[String] = js.undefined
  
  var margin: js.UndefOr[String] = js.undefined
}
object UIkitMarginOptions {
  
  inline def apply(): UIkitMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitMarginOptions]
  }
  
  extension [Self <: UIkitMarginOptions](x: Self) {
    
    inline def `setFirst-column`(value: String): Self = StObject.set(x, "first-column", value.asInstanceOf[js.Any])
    
    inline def `setFirst-columnUndefined`: Self = StObject.set(x, "first-column", js.undefined)
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
  }
}
