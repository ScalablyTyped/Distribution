package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TipsTheme extends StObject {
  
  var bgColor: String = js.native
}
object TipsTheme {
  
  @scala.inline
  def apply(bgColor: String): TipsTheme = {
    val __obj = js.Dynamic.literal(bgColor = bgColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipsTheme]
  }
  
  @scala.inline
  implicit class TipsThemeMutableBuilder[Self <: TipsTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
  }
}
