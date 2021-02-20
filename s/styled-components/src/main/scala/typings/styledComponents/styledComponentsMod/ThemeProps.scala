package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeProps[T] extends StObject {
  
  var theme: T = js.native
}
object ThemeProps {
  
  @scala.inline
  def apply[T](theme: T): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProps[T]]
  }
  
  @scala.inline
  implicit class ThemePropsMutableBuilder[Self <: ThemeProps[_], T] (val x: Self with ThemeProps[T]) extends AnyVal {
    
    @scala.inline
    def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
