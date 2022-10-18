package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TintColor extends StObject {
  
  var tintColor: String
}
object TintColor {
  
  inline def apply(tintColor: String): TintColor = {
    val __obj = js.Dynamic.literal(tintColor = tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TintColor]
  }
  
  extension [Self <: TintColor](x: Self) {
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
  }
}
