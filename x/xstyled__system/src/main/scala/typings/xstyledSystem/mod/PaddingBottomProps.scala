package typings.xstyledSystem.mod

import typings.csstype.mod.Property.PaddingBottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingBottomProps[TLength] extends StObject {
  
  val paddingBottom: js.UndefOr[ResponsiveValue[PaddingBottom[TLength]]] = js.undefined
  
  val pb: js.UndefOr[ResponsiveValue[PaddingBottom[TLength]]] = js.undefined
}
object PaddingBottomProps {
  
  inline def apply[TLength](): PaddingBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[TLength]]
  }
  
  extension [Self <: PaddingBottomProps[?], TLength](x: Self & PaddingBottomProps[TLength]) {
    
    inline def setPaddingBottom(value: ResponsiveValue[PaddingBottom[TLength]]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingBottomVarargs(value: PaddingBottom[TLength]*): Self = StObject.set(x, "paddingBottom", js.Array(value*))
    
    inline def setPb(value: ResponsiveValue[PaddingBottom[TLength]]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
    
    inline def setPbVarargs(value: PaddingBottom[TLength]*): Self = StObject.set(x, "pb", js.Array(value*))
  }
}
