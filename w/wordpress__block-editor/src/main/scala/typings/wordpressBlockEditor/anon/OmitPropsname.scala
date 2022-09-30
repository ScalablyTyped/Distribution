package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@wordpress/components.@wordpress/components.Slot.Props, 'name'> */
trait OmitPropsname extends StObject {
  
  var bubblesVirtually: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[Element]], Element | Null]] = js.undefined
  
  var fillProps: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object OmitPropsname {
  
  inline def apply(): OmitPropsname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPropsname]
  }
  
  extension [Self <: OmitPropsname](x: Self) {
    
    inline def setBubblesVirtually(value: Boolean): Self = StObject.set(x, "bubblesVirtually", value.asInstanceOf[js.Any])
    
    inline def setBubblesVirtuallyUndefined: Self = StObject.set(x, "bubblesVirtually", js.undefined)
    
    inline def setChildren(value: /* fills */ js.Array[js.Array[Element]] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFillProps(value: StringDictionary[Any]): Self = StObject.set(x, "fillProps", value.asInstanceOf[js.Any])
    
    inline def setFillPropsUndefined: Self = StObject.set(x, "fillProps", js.undefined)
  }
}
