package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TintColor extends StObject {
  
  var tintColor: js.UndefOr[String] = js.undefined
}
object TintColor {
  
  inline def apply(): TintColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TintColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TintColor] (val x: Self) extends AnyVal {
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
