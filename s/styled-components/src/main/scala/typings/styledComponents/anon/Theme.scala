package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme[T] extends StObject {
  
  var theme: js.UndefOr[T] = js.undefined
}
object Theme {
  
  @scala.inline
  def apply[T](): Theme[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme[T]]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme[?], T] (val x: Self & Theme[T]) extends AnyVal {
    
    @scala.inline
    def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
