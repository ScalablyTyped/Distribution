package typings.xstyledSystem.mod

import typings.csstype.mod.Property.PaddingLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingXProps[TLength] extends StObject {
  
  val px: js.UndefOr[ResponsiveValue[PaddingLeft[TLength]]] = js.undefined
}
object PaddingXProps {
  
  inline def apply[TLength](): PaddingXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingXProps[TLength]]
  }
  
  extension [Self <: PaddingXProps[?], TLength](x: Self & PaddingXProps[TLength]) {
    
    inline def setPx(value: ResponsiveValue[PaddingLeft[TLength]]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
    
    inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
    
    inline def setPxVarargs(value: PaddingLeft[TLength]*): Self = StObject.set(x, "px", js.Array(value*))
  }
}
