package typings.tuyaPanelKit.themeMod

import typings.tuyaPanelKit.anon.FontSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextThemeMap extends StObject {
  
  def large(props: Any): FontSize
  
  def normal(props: Any): FontSize
  
  def small(props: Any): FontSize
}
object TextThemeMap {
  
  inline def apply(large: Any => FontSize, normal: Any => FontSize, small: Any => FontSize): TextThemeMap = {
    val __obj = js.Dynamic.literal(large = js.Any.fromFunction1(large), normal = js.Any.fromFunction1(normal), small = js.Any.fromFunction1(small))
    __obj.asInstanceOf[TextThemeMap]
  }
  
  extension [Self <: TextThemeMap](x: Self) {
    
    inline def setLarge(value: Any => FontSize): Self = StObject.set(x, "large", js.Any.fromFunction1(value))
    
    inline def setNormal(value: Any => FontSize): Self = StObject.set(x, "normal", js.Any.fromFunction1(value))
    
    inline def setSmall(value: Any => FontSize): Self = StObject.set(x, "small", js.Any.fromFunction1(value))
  }
}
