package typings.styledComponents.nativeDistTypesMod

import typings.styledComponents.modelsThemeProviderMod.DefaultTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionContext
  extends StObject
     with ExtensibleObject {
  
  @JSName("theme")
  var theme_ExecutionContext: DefaultTheme
}
object ExecutionContext {
  
  inline def apply(theme: DefaultTheme): ExecutionContext = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContext]
  }
  
  extension [Self <: ExecutionContext](x: Self) {
    
    inline def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
