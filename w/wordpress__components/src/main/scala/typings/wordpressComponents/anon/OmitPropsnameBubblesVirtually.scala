package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@wordpress/components.@wordpress/components/slot-fill/slot.default.Props, 'name'> */
@js.native
trait OmitPropsnameBubblesVirtually extends StObject {
  
  var bubblesVirtually: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[Element]], Element | Null]] = js.native
  
  var fillProps: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object OmitPropsnameBubblesVirtually {
  
  @scala.inline
  def apply(): OmitPropsnameBubblesVirtually = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPropsnameBubblesVirtually]
  }
  
  @scala.inline
  implicit class OmitPropsnameBubblesVirtuallyMutableBuilder[Self <: OmitPropsnameBubblesVirtually] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubblesVirtually(value: Boolean): Self = StObject.set(x, "bubblesVirtually", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblesVirtuallyUndefined: Self = StObject.set(x, "bubblesVirtually", js.undefined)
    
    @scala.inline
    def setChildren(value: /* fills */ js.Array[js.Array[Element]] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setFillProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "fillProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillPropsUndefined: Self = StObject.set(x, "fillProps", js.undefined)
  }
}
