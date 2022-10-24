package typings.wixStyleReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Dispatch
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.react.mod.TransitionEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUseCollapseTypesMod {
  
  type AriaBoolean = Boolean
  
  type AssignableRef[ValueType] = (js.Function1[/* instance */ ValueType | Null, Unit]) | (MutableRefObject[ValueType | Null])
  
  trait GetCollapsePropsInput
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var onTransitionEnd: js.UndefOr[js.Function1[/* e */ TransitionEvent[Element], Unit]] = js.undefined
    
    var ref: js.UndefOr[js.Function1[/* node */ ReactNode, js.UndefOr[Unit | Null]]] = js.undefined
    
    var refKey: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GetCollapsePropsInput {
    
    inline def apply(): GetCollapsePropsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCollapsePropsInput]
    }
    
    extension [Self <: GetCollapsePropsInput](x: Self) {
      
      inline def setOnTransitionEnd(value: /* e */ TransitionEvent[Element] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setRef(value: /* node */ ReactNode => js.UndefOr[Unit | Null]): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
      
      inline def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait GetCollapsePropsOutput extends StObject {
    
    var `aria-hidden`: AriaBoolean
    
    var id: String
    
    def onTransitionEnd(e: TransitionEvent[Element]): Unit
    
    var style: CSSProperties
  }
  object GetCollapsePropsOutput {
    
    inline def apply(
      `aria-hidden`: AriaBoolean,
      id: String,
      onTransitionEnd: TransitionEvent[Element] => Unit,
      style: CSSProperties
    ): GetCollapsePropsOutput = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onTransitionEnd = js.Any.fromFunction1(onTransitionEnd), style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCollapsePropsOutput]
    }
    
    extension [Self <: GetCollapsePropsOutput](x: Self) {
      
      inline def `setAria-hidden`(value: AriaBoolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnTransitionEnd(value: TransitionEvent[Element] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseCollapseInput extends StObject {
    
    var collapseStyles: js.UndefOr[js.Object] = js.undefined
    
    var collapsedHeight: js.UndefOr[Double] = js.undefined
    
    var defaultExpanded: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var expandStyles: js.UndefOr[js.Object] = js.undefined
    
    var hasDisabledAnimation: js.UndefOr[Boolean] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var onCollapseEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCollapseStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpandEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpandStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object UseCollapseInput {
    
    inline def apply(): UseCollapseInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseCollapseInput]
    }
    
    extension [Self <: UseCollapseInput](x: Self) {
      
      inline def setCollapseStyles(value: js.Object): Self = StObject.set(x, "collapseStyles", value.asInstanceOf[js.Any])
      
      inline def setCollapseStylesUndefined: Self = StObject.set(x, "collapseStyles", js.undefined)
      
      inline def setCollapsedHeight(value: Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
      
      inline def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
      
      inline def setDefaultExpanded(value: Boolean): Self = StObject.set(x, "defaultExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedUndefined: Self = StObject.set(x, "defaultExpanded", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setExpandStyles(value: js.Object): Self = StObject.set(x, "expandStyles", value.asInstanceOf[js.Any])
      
      inline def setExpandStylesUndefined: Self = StObject.set(x, "expandStyles", js.undefined)
      
      inline def setHasDisabledAnimation(value: Boolean): Self = StObject.set(x, "hasDisabledAnimation", value.asInstanceOf[js.Any])
      
      inline def setHasDisabledAnimationUndefined: Self = StObject.set(x, "hasDisabledAnimation", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setOnCollapseEnd(value: () => Unit): Self = StObject.set(x, "onCollapseEnd", js.Any.fromFunction0(value))
      
      inline def setOnCollapseEndUndefined: Self = StObject.set(x, "onCollapseEnd", js.undefined)
      
      inline def setOnCollapseStart(value: () => Unit): Self = StObject.set(x, "onCollapseStart", js.Any.fromFunction0(value))
      
      inline def setOnCollapseStartUndefined: Self = StObject.set(x, "onCollapseStart", js.undefined)
      
      inline def setOnExpandEnd(value: () => Unit): Self = StObject.set(x, "onExpandEnd", js.Any.fromFunction0(value))
      
      inline def setOnExpandEndUndefined: Self = StObject.set(x, "onExpandEnd", js.undefined)
      
      inline def setOnExpandStart(value: () => Unit): Self = StObject.set(x, "onExpandStart", js.Any.fromFunction0(value))
      
      inline def setOnExpandStartUndefined: Self = StObject.set(x, "onExpandStart", js.undefined)
    }
  }
  
  @js.native
  trait UseCollapseOutput extends StObject {
    
    var exitAnimationEnded: Boolean = js.native
    
    def getCollapseProps(): GetCollapsePropsOutput = js.native
    def getCollapseProps(config: GetCollapsePropsInput): GetCollapsePropsOutput = js.native
    
    var isExpanded: Boolean = js.native
    
    var setExpanded: Dispatch[SetStateAction[Boolean]] = js.native
  }
}
