package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightProps[TLength] extends StObject {
  
  val right: js.UndefOr[ResponsiveValue[Right[TLength]]] = js.undefined
}
object RightProps {
  
  inline def apply[TLength](): RightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RightProps[?], TLength] (val x: Self & RightProps[TLength]) extends AnyVal {
    
    inline def setRight(value: ResponsiveValue[Right[TLength]]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRightVarargs(value: Right[TLength]*): Self = StObject.set(x, "right", js.Array(value*))
  }
}
