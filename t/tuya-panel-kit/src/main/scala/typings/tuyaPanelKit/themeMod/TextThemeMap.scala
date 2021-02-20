package typings.tuyaPanelKit.themeMod

import typings.tuyaPanelKit.anon.FontSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextThemeMap extends StObject {
  
  def large(props: js.Any): FontSize = js.native
  
  def normal(props: js.Any): FontSize = js.native
  
  def small(props: js.Any): FontSize = js.native
}
object TextThemeMap {
  
  @scala.inline
  def apply(large: js.Any => FontSize, normal: js.Any => FontSize, small: js.Any => FontSize): TextThemeMap = {
    val __obj = js.Dynamic.literal(large = js.Any.fromFunction1(large), normal = js.Any.fromFunction1(normal), small = js.Any.fromFunction1(small))
    __obj.asInstanceOf[TextThemeMap]
  }
  
  @scala.inline
  implicit class TextThemeMapMutableBuilder[Self <: TextThemeMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLarge(value: js.Any => FontSize): Self = StObject.set(x, "large", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormal(value: js.Any => FontSize): Self = StObject.set(x, "normal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSmall(value: js.Any => FontSize): Self = StObject.set(x, "small", js.Any.fromFunction1(value))
  }
}
