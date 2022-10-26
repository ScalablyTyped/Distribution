package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/types/TableToolbar.TableToolbarProps> */
trait PartialTableToolbarProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var removeVerticalPadding: js.UndefOr[Boolean] = js.undefined
}
object PartialTableToolbarProps {
  
  inline def apply(): PartialTableToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableToolbarProps]
  }
  
  extension [Self <: PartialTableToolbarProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setRemoveVerticalPadding(value: Boolean): Self = StObject.set(x, "removeVerticalPadding", value.asInstanceOf[js.Any])
    
    inline def setRemoveVerticalPaddingUndefined: Self = StObject.set(x, "removeVerticalPadding", js.undefined)
  }
}
