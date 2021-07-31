package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.OmitPolyfillTagPropssizeo
import typings.wixStyleReact.commonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagListMod {
  
  @JSImport("wix-style-react/dist/es/src/TagList", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[TagListProps, js.Object, js.Any]
  
  type TagList = PureComponent[TagListProps, js.Object, js.Any]
  
  /* Inlined std.Pick<wix-style-react.wix-style-react/dist/es/src/Button.ButtonProps, 'onClick'> & {  label :string | undefined} */
  trait TagListActionButtonProps extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Any] = js.undefined
  }
  object TagListActionButtonProps {
    
    @scala.inline
    def apply(): TagListActionButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagListActionButtonProps]
    }
    
    @scala.inline
    implicit class TagListActionButtonPropsMutableBuilder[Self <: TagListActionButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnClick(value: js.Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait TagListProps extends StObject {
    
    var actionButton: js.UndefOr[TagListActionButtonProps] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var initiallyExpanded: js.UndefOr[Boolean] = js.undefined
    
    var maxVisibleTags: js.UndefOr[Double] = js.undefined
    
    var onTagRemove: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var size: js.UndefOr[TagListSize] = js.undefined
    
    var tags: js.Array[OmitPolyfillTagPropssizeo]
    
    var toggleMoreButton: js.UndefOr[
        js.Function2[/* amountOfHiddenTags */ Double, /* isExpanded */ Boolean, ToggleMoreButtonProps]
      ] = js.undefined
  }
  object TagListProps {
    
    @scala.inline
    def apply(tags: js.Array[OmitPolyfillTagPropssizeo]): TagListProps = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagListProps]
    }
    
    @scala.inline
    implicit class TagListPropsMutableBuilder[Self <: TagListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionButton(value: TagListActionButtonProps): Self = StObject.set(x, "actionButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionButtonUndefined: Self = StObject.set(x, "actionButton", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setInitiallyExpanded(value: Boolean): Self = StObject.set(x, "initiallyExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyExpandedUndefined: Self = StObject.set(x, "initiallyExpanded", js.undefined)
      
      @scala.inline
      def setMaxVisibleTags(value: Double): Self = StObject.set(x, "maxVisibleTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVisibleTagsUndefined: Self = StObject.set(x, "maxVisibleTags", js.undefined)
      
      @scala.inline
      def setOnTagRemove(value: /* id */ String => Unit): Self = StObject.set(x, "onTagRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTagRemoveUndefined: Self = StObject.set(x, "onTagRemove", js.undefined)
      
      @scala.inline
      def setSize(value: TagListSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[OmitPolyfillTagPropssizeo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: OmitPolyfillTagPropssizeo*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setToggleMoreButton(value: (/* amountOfHiddenTags */ Double, /* isExpanded */ Boolean) => ToggleMoreButtonProps): Self = StObject.set(x, "toggleMoreButton", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToggleMoreButtonUndefined: Self = StObject.set(x, "toggleMoreButton", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait TagListSize extends StObject
  object TagListSize {
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  trait ToggleMoreButtonProps extends StObject {
    
    var label: String
    
    var tooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object ToggleMoreButtonProps {
    
    @scala.inline
    def apply(label: String): ToggleMoreButtonProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleMoreButtonProps]
    }
    
    @scala.inline
    implicit class ToggleMoreButtonPropsMutableBuilder[Self <: ToggleMoreButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipContent(value: ReactNode): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      @scala.inline
      def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
}
