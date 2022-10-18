package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewWindowOptions extends StObject {
  
  var windowFeatures: js.UndefOr[String] = js.undefined
  
  var windowName: js.UndefOr[String] = js.undefined
}
object NewWindowOptions {
  
  inline def apply(): NewWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewWindowOptions]
  }
  
  extension [Self <: NewWindowOptions](x: Self) {
    
    inline def setWindowFeatures(value: String): Self = StObject.set(x, "windowFeatures", value.asInstanceOf[js.Any])
    
    inline def setWindowFeaturesUndefined: Self = StObject.set(x, "windowFeatures", js.undefined)
    
    inline def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
    
    inline def setWindowNameUndefined: Self = StObject.set(x, "windowName", js.undefined)
  }
}
