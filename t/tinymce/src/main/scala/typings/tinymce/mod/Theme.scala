package typings.tinymce.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends StObject {
  
  def renderUI(obj: js.Object): js.Object = js.native
}
object Theme {
  
  @scala.inline
  def apply(renderUI: js.Object => js.Object): Theme = {
    val __obj = js.Dynamic.literal(renderUI = js.Any.fromFunction1(renderUI))
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderUI(value: js.Object => js.Object): Self = StObject.set(x, "renderUI", js.Any.fromFunction1(value))
  }
}
