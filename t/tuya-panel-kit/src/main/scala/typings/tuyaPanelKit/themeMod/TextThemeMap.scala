package typings.tuyaPanelKit.themeMod

import typings.tuyaPanelKit.anon.FontSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextThemeMap extends js.Object {
  
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
  implicit class TextThemeMapOps[Self <: TextThemeMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLarge(value: js.Any => FontSize): Self = this.set("large", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormal(value: js.Any => FontSize): Self = this.set("normal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSmall(value: js.Any => FontSize): Self = this.set("small", js.Any.fromFunction1(value))
  }
}
