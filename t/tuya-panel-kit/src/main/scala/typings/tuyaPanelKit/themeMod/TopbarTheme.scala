package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopbarTheme extends StObject {
  
  var background: BackgroundProps = js.native
  
  var color: String = js.native
}
object TopbarTheme {
  
  @scala.inline
  def apply(background: BackgroundProps, color: String): TopbarTheme = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopbarTheme]
  }
  
  @scala.inline
  implicit class TopbarThemeMutableBuilder[Self <: TopbarTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
