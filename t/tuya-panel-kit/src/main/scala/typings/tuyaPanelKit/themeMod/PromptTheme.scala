package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptTheme extends StObject {
  
  var bg: String = js.native
  
  var padding: String = js.native
  
  var placeholder: String = js.native
  
  var radius: Double = js.native
}
object PromptTheme {
  
  @scala.inline
  def apply(bg: String, padding: String, placeholder: String, radius: Double): PromptTheme = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptTheme]
  }
  
  @scala.inline
  implicit class PromptThemeMutableBuilder[Self <: PromptTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
