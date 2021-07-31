package typings.wixStyleReact

import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaOverlayMod {
  
  @JSImport("wix-style-react/dist/es/src/MediaOverlay", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[MediaOverlayProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/MediaOverlay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/MediaOverlay", "default.Content")
    @js.native
    def Content: FC[MediaOverlayContentProps] = js.native
    @scala.inline
    def Content_=(x: FC[MediaOverlayContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/MediaOverlay", "default.DragHandle")
    @js.native
    def DragHandle: FC[js.Object] = js.native
    @scala.inline
    def DragHandle_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DragHandle")(x.asInstanceOf[js.Any])
  }
  
  type MediaOverlay = PureComponent[MediaOverlayProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.`top-start`
    - typings.wixStyleReact.wixStyleReactStrings.`top-end`
    - typings.wixStyleReact.wixStyleReactStrings.middle
    - typings.wixStyleReact.wixStyleReactStrings.`bottom-end`
    - typings.wixStyleReact.wixStyleReactStrings.`bottom-start`
  */
  trait MediaOverlayContentPlacement extends StObject
  object MediaOverlayContentPlacement {
    
    @scala.inline
    def `bottom-end`: typings.wixStyleReact.wixStyleReactStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`bottom-end`]
    
    @scala.inline
    def `bottom-start`: typings.wixStyleReact.wixStyleReactStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`bottom-start`]
    
    @scala.inline
    def middle: typings.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.middle]
    
    @scala.inline
    def `top-end`: typings.wixStyleReact.wixStyleReactStrings.`top-end` = "top-end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`top-end`]
    
    @scala.inline
    def `top-start`: typings.wixStyleReact.wixStyleReactStrings.`top-start` = "top-start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`top-start`]
  }
  
  trait MediaOverlayContentProps extends StObject {
    
    var placement: js.UndefOr[MediaOverlayContentPlacement] = js.undefined
    
    var visible: js.UndefOr[MediaOverlayContentVisible] = js.undefined
  }
  object MediaOverlayContentProps {
    
    @scala.inline
    def apply(): MediaOverlayContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOverlayContentProps]
    }
    
    @scala.inline
    implicit class MediaOverlayContentPropsMutableBuilder[Self <: MediaOverlayContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlacement(value: MediaOverlayContentPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setVisible(value: MediaOverlayContentVisible): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.default
    - typings.wixStyleReact.wixStyleReactStrings.hover
    - typings.wixStyleReact.wixStyleReactStrings.always
  */
  trait MediaOverlayContentVisible extends StObject
  object MediaOverlayContentVisible {
    
    @scala.inline
    def default: typings.wixStyleReact.wixStyleReactStrings.default = "default".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.default]
    
    @scala.inline
    def always: typings.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.always]
    
    @scala.inline
    def hover: typings.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.hover]
  }
  
  trait MediaOverlayProps extends StObject {
    
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
    
    @scala.inline
    def apply(): MediaOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOverlayProps]
    }
    
    @scala.inline
    implicit class MediaOverlayPropsMutableBuilder[Self <: MediaOverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setHoverSkin(value: MediaOverlaySkin): Self = StObject.set(x, "hoverSkin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverSkinUndefined: Self = StObject.set(x, "hoverSkin", js.undefined)
      
      @scala.inline
      def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
      
      @scala.inline
      def setMedia(value: ReactNode): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRemoveRoundedBorders(value: Boolean): Self = StObject.set(x, "removeRoundedBorders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveRoundedBordersUndefined: Self = StObject.set(x, "removeRoundedBorders", js.undefined)
      
      @scala.inline
      def setSkin(value: MediaOverlaySkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.none_
    - typings.wixStyleReact.wixStyleReactStrings.gradient
    - typings.wixStyleReact.wixStyleReactStrings.dark
  */
  trait MediaOverlaySkin extends StObject
  object MediaOverlaySkin {
    
    @scala.inline
    def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    @scala.inline
    def gradient: typings.wixStyleReact.wixStyleReactStrings.gradient = "gradient".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.gradient]
    
    @scala.inline
    def none: none_ = "none".asInstanceOf[none_]
  }
}
