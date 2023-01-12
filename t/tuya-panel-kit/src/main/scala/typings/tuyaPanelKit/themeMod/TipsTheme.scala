package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TipsTheme extends StObject {
  
  var bgColor: String
}
object TipsTheme {
  
  inline def apply(bgColor: String): TipsTheme = {
    val __obj = js.Dynamic.literal(bgColor = bgColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipsTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TipsTheme] (val x: Self) extends AnyVal {
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
  }
}
