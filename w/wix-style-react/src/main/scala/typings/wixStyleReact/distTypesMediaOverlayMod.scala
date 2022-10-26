package typings.wixStyleReact

import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMediaOverlayMod {
  
  @JSImport("wix-style-react/dist/types/MediaOverlay", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[MediaOverlayProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/MediaOverlay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/MediaOverlay", "default.Content")
    @js.native
    def Content: FC[MediaOverlayContentProps] = js.native
    inline def Content_=(x: FC[MediaOverlayContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/MediaOverlay", "default.DragHandle")
    @js.native
    def DragHandle: FC[js.Object] = js.native
    inline def DragHandle_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DragHandle")(x.asInstanceOf[js.Any])
  }
  
  type MediaOverlay = PureComponent[MediaOverlayProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.`top-start`
    - typings.wixStyleReact.wixStyleReactStrings.`top-end`
    - typings.wixStyleReact.wixStyleReactStrings.middle
    - typings.wixStyleReact.wixStyleReactStrings.`bottom-end`
    - typings.wixStyleReact.wixStyleReactStrings.`bottom-start`
  */
  trait MediaOverlayContentPlacement extends StObject
  object MediaOverlayContentPlacement {
    
    inline def `bottom-end`: typings.wixStyleReact.wixStyleReactStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`bottom-end`]
    
    inline def `bottom-start`: typings.wixStyleReact.wixStyleReactStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`bottom-start`]
    
    inline def middle: typings.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.middle]
    
    inline def `top-end`: typings.wixStyleReact.wixStyleReactStrings.`top-end` = "top-end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`top-end`]
    
    inline def `top-start`: typings.wixStyleReact.wixStyleReactStrings.`top-start` = "top-start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`top-start`]
  }
  
  trait MediaOverlayContentProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var placement: js.UndefOr[MediaOverlayContentPlacement] = js.undefined
    
    var visible: js.UndefOr[MediaOverlayContentVisible] = js.undefined
  }
  object MediaOverlayContentProps {
    
    inline def apply(): MediaOverlayContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOverlayContentProps]
    }
    
    extension [Self <: MediaOverlayContentProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPlacement(value: MediaOverlayContentPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setVisible(value: MediaOverlayContentVisible): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.default
    - typings.wixStyleReact.wixStyleReactStrings.hover
    - typings.wixStyleReact.wixStyleReactStrings.always
  */
  trait MediaOverlayContentVisible extends StObject
  object MediaOverlayContentVisible {
    
    inline def default: typings.wixStyleReact.wixStyleReactStrings.default = "default".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.default]
    
    inline def always: typings.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.always]
    
    inline def hover: typings.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.hover]
  }
  
  trait MediaOverlayProps extends StObject {
    
    var borderRadius: js.UndefOr[String | Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hoverSkin: js.UndefOr[MediaOverlaySkin] = js.undefined
    
    var hovered: js.UndefOr[Boolean] = js.undefined
    
    var media: ReactNode
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeRoundedBorders: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[MediaOverlaySkin] = js.undefined
  }
  object MediaOverlayProps {
    
    inline def apply(): MediaOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOverlayProps]
    }
    
    extension [Self <: MediaOverlayProps](x: Self) {
      
      inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHoverSkin(value: MediaOverlaySkin): Self = StObject.set(x, "hoverSkin", value.asInstanceOf[js.Any])
      
      inline def setHoverSkinUndefined: Self = StObject.set(x, "hoverSkin", js.undefined)
      
      inline def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
      
      inline def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
      
      inline def setMedia(value: ReactNode): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRemoveRoundedBorders(value: Boolean): Self = StObject.set(x, "removeRoundedBorders", value.asInstanceOf[js.Any])
      
      inline def setRemoveRoundedBordersUndefined: Self = StObject.set(x, "removeRoundedBorders", js.undefined)
      
      inline def setSkin(value: MediaOverlaySkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.none_
    - typings.wixStyleReact.wixStyleReactStrings.gradient
    - typings.wixStyleReact.wixStyleReactStrings.dark
  */
  trait MediaOverlaySkin extends StObject
  object MediaOverlaySkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def gradient: typings.wixStyleReact.wixStyleReactStrings.gradient = "gradient".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.gradient]
    
    inline def none: none_ = "none".asInstanceOf[none_]
  }
}
