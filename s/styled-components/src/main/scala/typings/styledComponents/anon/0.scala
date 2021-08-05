package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[T /* <: js.Object */] extends StObject {
  
  var theme: js.UndefOr[T] = js.undefined
}
object `0` {
  
  inline def apply[T /* <: js.Object */](): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[T]]
  }
  
  extension [Self <: `0`[?], T /* <: js.Object */](x: Self & `0`[T]) {
    
    inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
