package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingProps[TLength] extends StObject {
  
  val p: js.UndefOr[ResponsiveValue[Padding[TLength]]] = js.undefined
  
  val padding: js.UndefOr[ResponsiveValue[Padding[TLength]]] = js.undefined
}
object PaddingProps {
  
  inline def apply[TLength](): PaddingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingProps[?], TLength] (val x: Self & PaddingProps[TLength]) extends AnyVal {
    
    inline def setP(value: ResponsiveValue[Padding[TLength]]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setPVarargs(value: Padding[TLength]*): Self = StObject.set(x, "p", js.Array(value*))
    
    inline def setPadding(value: ResponsiveValue[Padding[TLength]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Padding[TLength]*): Self = StObject.set(x, "padding", js.Array(value*))
  }
}
