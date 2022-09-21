package typings.xstyledSystem.mod

import typings.csstype.mod.Property.ZIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndexProps extends StObject {
  
  val zIndex: js.UndefOr[ResponsiveValue[ZIndex | AliasKey]] = js.undefined
}
object ZIndexProps {
  
  inline def apply(): ZIndexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexProps]
  }
  
  extension [Self <: ZIndexProps](x: Self) {
    
    inline def setZIndex(value: ResponsiveValue[ZIndex | AliasKey]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    inline def setZIndexVarargs(value: (ZIndex | AliasKey)*): Self = StObject.set(x, "zIndex", js.Array(value*))
  }
}
