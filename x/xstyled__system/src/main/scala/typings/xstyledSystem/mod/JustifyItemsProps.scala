package typings.xstyledSystem.mod

import typings.csstype.mod.Property.JustifyItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifyItemsProps extends StObject {
  
  val justifyItems: js.UndefOr[ResponsiveValue[JustifyItems]] = js.undefined
}
object JustifyItemsProps {
  
  inline def apply(): JustifyItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JustifyItemsProps] (val x: Self) extends AnyVal {
    
    inline def setJustifyItems(value: ResponsiveValue[JustifyItems]): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
    
    inline def setJustifyItemsVarargs(value: JustifyItems*): Self = StObject.set(x, "justifyItems", js.Array(value*))
  }
}
