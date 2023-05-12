package typings.tonicUiReact.anon

import typings.tonicUiReact.mod.ThemeColorStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dark extends StObject {
  
  var dark: ThemeColorStyle
  
  var light: ThemeColorStyle
}
object Dark {
  
  inline def apply(dark: ThemeColorStyle, light: ThemeColorStyle): Dark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
    
    inline def setDark(value: ThemeColorStyle): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: ThemeColorStyle): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
