package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[T /* <: js.Object */] extends StObject {
  
  var theme: js.UndefOr[T] = js.native
}
object `0` {
  
  @scala.inline
  def apply[T /* <: js.Object */](): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[T]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[_], T /* <: js.Object */] (val x: Self with `0`[T]) extends AnyVal {
    
    @scala.inline
    def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
