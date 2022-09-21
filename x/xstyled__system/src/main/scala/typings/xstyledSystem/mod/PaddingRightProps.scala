package typings.xstyledSystem.mod

import typings.csstype.mod.Property.PaddingRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingRightProps[TLength] extends StObject {
  
  val paddingRight: js.UndefOr[ResponsiveValue[PaddingRight[TLength]]] = js.undefined
  
  val pr: js.UndefOr[ResponsiveValue[PaddingRight[TLength]]] = js.undefined
}
object PaddingRightProps {
  
  inline def apply[TLength](): PaddingRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingRightProps[TLength]]
  }
  
  extension [Self <: PaddingRightProps[?], TLength](x: Self & PaddingRightProps[TLength]) {
    
    inline def setPaddingRight(value: ResponsiveValue[PaddingRight[TLength]]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingRightVarargs(value: PaddingRight[TLength]*): Self = StObject.set(x, "paddingRight", js.Array(value*))
    
    inline def setPr(value: ResponsiveValue[PaddingRight[TLength]]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setPrVarargs(value: PaddingRight[TLength]*): Self = StObject.set(x, "pr", js.Array(value*))
  }
}
