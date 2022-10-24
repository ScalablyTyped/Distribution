package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.OmitPolyfillTagPropssizeo
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagListMod {
  
  @JSImport("wix-style-react/dist/types/TagList", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[TagListProps, js.Object, Any]
  
  type TagList = PureComponent[TagListProps, js.Object, Any]
  
  /* Inlined std.Pick<wix-style-react.wix-style-react/dist/types/Button.ButtonProps, 'onClick'> & {  label :string | undefined} */
  trait TagListActionButtonProps extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[Any] = js.undefined
  }
  object TagListActionButtonProps {
    
    inline def apply(): TagListActionButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagListActionButtonProps]
    }
    
    extension [Self <: TagListActionButtonProps](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
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
    
    inline def apply(tags: js.Array[OmitPolyfillTagPropssizeo]): TagListProps = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagListProps]
    }
    
    extension [Self <: TagListProps](x: Self) {
      
      inline def setActionButton(value: TagListActionButtonProps): Self = StObject.set(x, "actionButton", value.asInstanceOf[js.Any])
      
      inline def setActionButtonUndefined: Self = StObject.set(x, "actionButton", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setInitiallyExpanded(value: Boolean): Self = StObject.set(x, "initiallyExpanded", value.asInstanceOf[js.Any])
      
      inline def setInitiallyExpandedUndefined: Self = StObject.set(x, "initiallyExpanded", js.undefined)
      
      inline def setMaxVisibleTags(value: Double): Self = StObject.set(x, "maxVisibleTags", value.asInstanceOf[js.Any])
      
      inline def setMaxVisibleTagsUndefined: Self = StObject.set(x, "maxVisibleTags", js.undefined)
      
      inline def setOnTagRemove(value: /* id */ String => Unit): Self = StObject.set(x, "onTagRemove", js.Any.fromFunction1(value))
      
      inline def setOnTagRemoveUndefined: Self = StObject.set(x, "onTagRemove", js.undefined)
      
      inline def setSize(value: TagListSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTags(value: js.Array[OmitPolyfillTagPropssizeo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: OmitPolyfillTagPropssizeo*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setToggleMoreButton(value: (/* amountOfHiddenTags */ Double, /* isExpanded */ Boolean) => ToggleMoreButtonProps): Self = StObject.set(x, "toggleMoreButton", js.Any.fromFunction2(value))
      
      inline def setToggleMoreButtonUndefined: Self = StObject.set(x, "toggleMoreButton", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait TagListSize extends StObject
  object TagListSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  trait ToggleMoreButtonProps extends StObject {
    
    var label: String
    
    var tooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object ToggleMoreButtonProps {
    
    inline def apply(label: String): ToggleMoreButtonProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleMoreButtonProps]
    }
    
    extension [Self <: ToggleMoreButtonProps](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTooltipContent(value: ReactNode): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      inline def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
}
