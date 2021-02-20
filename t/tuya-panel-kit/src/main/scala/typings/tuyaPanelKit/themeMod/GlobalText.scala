package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalText extends StObject {
  
  var dark: String = js.native
  
  var light: String = js.native
}
object GlobalText {
  
  @scala.inline
  def apply(dark: String, light: String): GlobalText = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalText]
  }
  
  @scala.inline
  implicit class GlobalTextMutableBuilder[Self <: GlobalText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
