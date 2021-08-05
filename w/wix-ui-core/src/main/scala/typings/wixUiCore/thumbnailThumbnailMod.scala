package typings.wixUiCore

import typings.react.mod.EventHandler
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbnailThumbnailMod {
  
  @JSImport("wix-ui-core/dist/src/components/thumbnail/Thumbnail", "Thumbnail")
  @js.native
  val Thumbnail: FunctionComponent[ThumbnailProps] = js.native
  
  trait ThumbnailProps extends StObject {
    
    /** Item to sit inside the Thumbnail */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Is the thumbnail disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Callback when the element is clicked */
    var onClick: js.UndefOr[EventHandler[MouseEvent[HTMLElement, NativeMouseEvent]]] = js.undefined
    
    /** Is the thumbnail selected */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** Icon to display in when thumbnail is selected */
    var selectedIcon: js.UndefOr[ReactNode] = js.undefined
  }
  object ThumbnailProps {
    
    inline def apply(): ThumbnailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbnailProps]
    }
    
    extension [Self <: ThumbnailProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedIcon(value: ReactNode): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
      
      inline def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
