package typings.tonicUiReact.anon

import typings.tonicUiReact.mod.ThemeColorModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMode extends StObject {
  
  var colorMode: ThemeColorModes
}
object ColorMode {
  
  inline def apply(colorMode: ThemeColorModes): ColorMode = {
    val __obj = js.Dynamic.literal(colorMode = colorMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorMode] (val x: Self) extends AnyVal {
    
    inline def setColorMode(value: ThemeColorModes): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
  }
}
