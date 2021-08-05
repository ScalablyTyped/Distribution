package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeProps[T] extends StObject {
  
  var theme: T
}
object ThemeProps {
  
  inline def apply[T](theme: T): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProps[T]]
  }
  
  extension [Self <: ThemeProps[?], T](x: Self & ThemeProps[T]) {
    
    inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
