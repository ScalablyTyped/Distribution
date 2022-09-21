package typings.xstyledSystem.mod

import typings.csstype.mod.Property.PaddingTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingTopProps[TLength] extends StObject {
  
  val paddingTop: js.UndefOr[ResponsiveValue[PaddingTop[TLength]]] = js.undefined
  
  val pt: js.UndefOr[ResponsiveValue[PaddingTop[TLength]]] = js.undefined
}
object PaddingTopProps {
  
  inline def apply[TLength](): PaddingTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingTopProps[TLength]]
  }
  
  extension [Self <: PaddingTopProps[?], TLength](x: Self & PaddingTopProps[TLength]) {
    
    inline def setPaddingTop(value: ResponsiveValue[PaddingTop[TLength]]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setPaddingTopVarargs(value: PaddingTop[TLength]*): Self = StObject.set(x, "paddingTop", js.Array(value*))
    
    inline def setPt(value: ResponsiveValue[PaddingTop[TLength]]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
    
    inline def setPtVarargs(value: PaddingTop[TLength]*): Self = StObject.set(x, "pt", js.Array(value*))
  }
}
