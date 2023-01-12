package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme[T] extends StObject {
  
  var theme: js.UndefOr[T] = js.undefined
}
object Theme {
  
  inline def apply[T](): Theme[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme[?], T] (val x: Self & Theme[T]) extends AnyVal {
    
    inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
