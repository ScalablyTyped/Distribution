package typings.xstyledSystem.mod

import typings.csstype.mod.Property.AlignItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsProps extends StObject {
  
  val alignItems: js.UndefOr[ResponsiveValue[AlignItems]] = js.undefined
}
object AlignItemsProps {
  
  inline def apply(): AlignItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemsProps]
  }
  
  extension [Self <: AlignItemsProps](x: Self) {
    
    inline def setAlignItems(value: ResponsiveValue[AlignItems]): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setAlignItemsVarargs(value: AlignItems*): Self = StObject.set(x, "alignItems", js.Array(value*))
  }
}
