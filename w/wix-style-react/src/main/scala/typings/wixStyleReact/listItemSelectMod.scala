package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.anon.Checkbox
import typings.wixStyleReact.anon.DisabledIdOverrideOptionStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemSelectMod {
  
  @JSImport("wix-style-react/dist/es/src/ListItemSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/es/src/ListItemSelect", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ListItemSelectProps, ComponentState, js.Any] {
    def this(props: ListItemSelectProps) = this()
    def this(props: ListItemSelectProps, context: js.Any) = this()
  }
  @JSImport("wix-style-react/dist/es/src/ListItemSelect", JSImport.Default)
  @js.native
  val default: ComponentClass[ListItemSelectProps, ComponentState] = js.native
  
  @scala.inline
  def listItemSelectBuilder(data: Checkbox): DisabledIdOverrideOptionStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemSelectBuilder")(data.asInstanceOf[js.Any]).asInstanceOf[DisabledIdOverrideOptionStyle]
  
  trait ListItemSelectProps extends StObject {
    
    var checkbox: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var highlighted: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[ListItemSelectSizes] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ListItemSelectProps {
    
    @scala.inline
    def apply(): ListItemSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemSelectProps]
    }
    
    @scala.inline
    implicit class ListItemSelectPropsMutableBuilder[Self <: ListItemSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSize(value: ListItemSelectSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait ListItemSelectSizes extends StObject
  object ListItemSelectSizes {
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
}
