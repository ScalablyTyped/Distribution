package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftProps[TLength] extends StObject {
  
  val left: js.UndefOr[ResponsiveValue[Left[TLength]]] = js.undefined
}
object LeftProps {
  
  inline def apply[TLength](): LeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LeftProps[?], TLength] (val x: Self & LeftProps[TLength]) extends AnyVal {
    
    inline def setLeft(value: ResponsiveValue[Left[TLength]]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLeftVarargs(value: Left[TLength]*): Self = StObject.set(x, "left", js.Array(value*))
  }
}
