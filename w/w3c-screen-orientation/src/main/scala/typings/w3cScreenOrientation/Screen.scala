package typings.w3cScreenOrientation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen extends StObject {
  
  val orientation: ScreenOrientation
}
object Screen {
  
  inline def apply(orientation: ScreenOrientation): Screen = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  extension [Self <: Screen](x: Self) {
    
    inline def setOrientation(value: ScreenOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
