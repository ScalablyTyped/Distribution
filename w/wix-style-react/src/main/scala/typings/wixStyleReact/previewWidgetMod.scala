package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewWidgetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/es/src/PreviewWidget", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[PreviewWidgetProps, ComponentState, js.Any] {
    def this(props: PreviewWidgetProps) = this()
    def this(props: PreviewWidgetProps, context: js.Any) = this()
  }
  @JSImport("wix-style-react/dist/es/src/PreviewWidget", JSImport.Default)
  @js.native
  val default: ComponentClass[PreviewWidgetProps, ComponentState] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.shadow
    - typings.wixStyleReact.wixStyleReactStrings.border
  */
  trait PreviewWidgetContentOutline extends StObject
  object PreviewWidgetContentOutline {
    
    @scala.inline
    def border: typings.wixStyleReact.wixStyleReactStrings.border = "border".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.border]
    
    @scala.inline
    def shadow: typings.wixStyleReact.wixStyleReactStrings.shadow = "shadow".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.shadow]
  }
  
  trait PreviewWidgetProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentOutline: js.UndefOr[PreviewWidgetContentOutline] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[PreviewWidgetSkin] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object PreviewWidgetProps {
    
    @scala.inline
    def apply(): PreviewWidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewWidgetProps]
    }
    
    @scala.inline
    implicit class PreviewWidgetPropsMutableBuilder[Self <: PreviewWidgetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentOutline(value: PreviewWidgetContentOutline): Self = StObject.set(x, "contentOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentOutlineUndefined: Self = StObject.set(x, "contentOutline", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      @scala.inline
      def setSkin(value: PreviewWidgetSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.neutral
    - typings.wixStyleReact.wixStyleReactStrings.gradient
    - typings.wixStyleReact.wixStyleReactStrings.custom
  */
  trait PreviewWidgetSkin extends StObject
  object PreviewWidgetSkin {
    
    @scala.inline
    def custom: typings.wixStyleReact.wixStyleReactStrings.custom = "custom".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.custom]
    
    @scala.inline
    def gradient: typings.wixStyleReact.wixStyleReactStrings.gradient = "gradient".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.gradient]
    
    @scala.inline
    def neutral: typings.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutral]
  }
  
  type _To = ComponentClass[PreviewWidgetProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `previewWidgetMod.foo` */
  override def _to: ComponentClass[PreviewWidgetProps, ComponentState] = default
}
