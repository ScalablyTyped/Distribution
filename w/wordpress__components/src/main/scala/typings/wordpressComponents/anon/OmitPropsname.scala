package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@wordpress/components.@wordpress/components/slot-fill/fill.default.Props, 'name'> */
trait OmitPropsname extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
}
object OmitPropsname {
  
  @scala.inline
  def apply(): OmitPropsname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPropsname]
  }
  
  @scala.inline
  implicit class OmitPropsnameMutableBuilder[Self <: OmitPropsname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
