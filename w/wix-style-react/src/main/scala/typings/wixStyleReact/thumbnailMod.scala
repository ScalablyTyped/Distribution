package typings.wixStyleReact

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbnailMod {
  
  @JSImport("wix-style-react/dist/es/src/Thumbnail", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ThumbnailProps, js.Object, js.Any]
  
  type Thumbnail = PureComponent[ThumbnailProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.top
    - typings.wixStyleReact.wixStyleReactStrings.center
  */
  trait ThumbnailContentAlignment extends StObject
  object ThumbnailContentAlignment {
    
    @scala.inline
    def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    @scala.inline
    def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
  
  trait ThumbnailProps extends StObject {
    
    var backgroundImage: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentAlignment: js.UndefOr[ThumbnailContentAlignment] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var hideSelectedIcon: js.UndefOr[Boolean] = js.undefined
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[
          /* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[ThumbnailSize] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object ThumbnailProps {
    
    @scala.inline
    def apply(): ThumbnailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbnailProps]
    }
    
    @scala.inline
    implicit class ThumbnailPropsMutableBuilder[Self <: ThumbnailProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundImage(value: ReactNode): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentAlignment(value: ThumbnailContentAlignment): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideSelectedIcon(value: Boolean): Self = StObject.set(x, "hideSelectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideSelectedIconUndefined: Self = StObject.set(x, "hideSelectedIcon", js.undefined)
      
      @scala.inline
      def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: /* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement] => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSize(value: ThumbnailSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait ThumbnailSize extends StObject
  object ThumbnailSize {
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    @scala.inline
    def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
}
