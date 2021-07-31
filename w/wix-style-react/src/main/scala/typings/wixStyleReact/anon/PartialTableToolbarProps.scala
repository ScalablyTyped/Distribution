package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/es/src/TableToolbar.TableToolbarProps> */
trait PartialTableToolbarProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
}
object PartialTableToolbarProps {
  
  @scala.inline
  def apply(): PartialTableToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableToolbarProps]
  }
  
  @scala.inline
  implicit class PartialTableToolbarPropsMutableBuilder[Self <: PartialTableToolbarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
