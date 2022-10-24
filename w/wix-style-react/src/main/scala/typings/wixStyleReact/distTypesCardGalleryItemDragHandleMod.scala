package typings.wixStyleReact

import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardGalleryItemDragHandleMod {
  
  @JSImport("wix-style-react/dist/types/CardGalleryItem/DragHandle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DragHandle(props: DragHandleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DragHandle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait DragHandleProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var domRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var dragDisabled: js.UndefOr[Boolean] = js.undefined
    
    var dragging: js.UndefOr[Boolean] = js.undefined
  }
  object DragHandleProps {
    
    inline def apply(): DragHandleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragHandleProps]
    }
    
    extension [Self <: DragHandleProps](x: Self) {
      
      inline def setDomRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "domRef", js.Any.fromFunction1(value))
      
      inline def setDomRefNull: Self = StObject.set(x, "domRef", null)
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
      
      inline def setDragDisabled(value: Boolean): Self = StObject.set(x, "dragDisabled", value.asInstanceOf[js.Any])
      
      inline def setDragDisabledUndefined: Self = StObject.set(x, "dragDisabled", js.undefined)
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    }
  }
}
