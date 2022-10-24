package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.`0`
import typings.wixStyleReact.distTypesAccordionAccordionItemMod.AccordionItemCommonProps
import typings.wixStyleReact.distTypesAccordionAccordionItemMod.AccordionItemProps
import typings.wixStyleReact.distTypesAccordionAccordionSectionItemMod.AccordionSectionItemCommonProps
import typings.wixStyleReact.distTypesAccordionAccordionSectionItemMod.AccordionSectionItemProps
import typings.wixStyleReact.wixStyleReactStrings.fast
import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.light
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.neutral
import typings.wixStyleReact.wixStyleReactStrings.none_
import typings.wixStyleReact.wixStyleReactStrings.slow
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.standard
import typings.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAccordionMod {
  
  @JSImport("wix-style-react/dist/types/Accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/Accordion", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AccordionProps, js.Object, Any]
  
  inline def accordionItemBuilder(props: AccordionItemCommonProps): js.Function1[/* options */ js.UndefOr[AccordionItemProps], `0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("accordionItemBuilder")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[AccordionItemProps], `0`]]
  
  inline def accordionSectionItemBuilder(props: AccordionSectionItemCommonProps): js.Function1[/* options */ js.UndefOr[AccordionSectionItemProps], `0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("accordionSectionItemBuilder")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[AccordionSectionItemProps], `0`]]
  
  type Accordion = Component[AccordionProps, js.Object, Any]
  
  trait AccordionProps extends StObject {
    
    /** Applied as data-hook HTML attribute that can be used to create driver in testing */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** Hide Accordion shadow effect */
    var hideShadow: js.UndefOr[Boolean] = js.undefined
    
    /** Controls horizontal padding of Accordion items */
    var horizontalPadding: js.UndefOr[none_ | tiny | small | medium | large] = js.undefined
    
    /** accordion items nodes */
    var items: js.UndefOr[js.Array[AccordionItemCommonProps | AccordionRenderOptionFn]] = js.undefined
    
    /** allow multiple rows to be opened simultaneously */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Callback fired immediately after the animation is started */
    var onAnimationEnter: js.UndefOr[Unit] = js.undefined
    
    /** Callback fired immediately after the animation is ended */
    var onAnimationExit: js.UndefOr[Unit] = js.undefined
    
    /** Change items size */
    var size: js.UndefOr[tiny | small | medium | large] = js.undefined
    
    /** Accordion skin color */
    var skin: js.UndefOr[light | standard | neutral] = js.undefined
    
    /** Change expand and collapse animation speed */
    var transitionSpeed: js.UndefOr[slow | medium | fast] = js.undefined
  }
  object AccordionProps {
    
    inline def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
    
    extension [Self <: AccordionProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
      
      inline def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
      
      inline def setHorizontalPadding(value: none_ | tiny | small | medium | large): Self = StObject.set(x, "horizontalPadding", value.asInstanceOf[js.Any])
      
      inline def setHorizontalPaddingUndefined: Self = StObject.set(x, "horizontalPadding", js.undefined)
      
      inline def setItems(value: js.Array[AccordionItemCommonProps | AccordionRenderOptionFn]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (AccordionItemCommonProps | AccordionRenderOptionFn)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnAnimationEnter(value: Unit): Self = StObject.set(x, "onAnimationEnter", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEnterUndefined: Self = StObject.set(x, "onAnimationEnter", js.undefined)
      
      inline def setOnAnimationExit(value: Unit): Self = StObject.set(x, "onAnimationExit", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationExitUndefined: Self = StObject.set(x, "onAnimationExit", js.undefined)
      
      inline def setSize(value: tiny | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: light | standard | neutral): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTransitionSpeed(value: slow | medium | fast): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  type AccordionRenderOptionFn = js.Function1[/* options */ AccordionItemProps & AccordionSectionItemProps, `0`]
}
