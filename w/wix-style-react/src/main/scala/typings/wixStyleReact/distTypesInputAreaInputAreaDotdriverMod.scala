package typings.wixStyleReact

import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.std.CSSStyleDeclaration
import typings.wixStyleReact.distTypesCommonMod.StatusIndications
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputAreaInputAreaDotdriverMod {
  
  trait InputAreaDriver[T]
    extends StObject
       with BaseDriver {
    
    def enterText(text: String): Unit
    
    def focus(): Unit
    
    def getAriaControls(): String
    
    def getAriaDescribedby(): String
    
    def getAriaLabel(): String
    
    def getCounterValue(): String
    
    def getCursorLocation(): Double
    
    def getDefaultValue(): String
    
    def getDisabled(): Boolean
    
    def getHasCounter(): Boolean
    
    def getMaxLength(): Double
    
    def getName(): String
    
    def getPlaceholder(): String
    
    def getReadOnly(): Boolean
    
    def getRequired(): Boolean
    
    def getResizable(): Boolean
    
    def getRowsCount(): Double
    
    def getStatusMessage(): String | Null
    
    def getStyle(): CSSStyleDeclaration
    
    def getTabIndex(): Double
    
    def getTooltipDataHook(): String
    
    def getTooltipElement(): T
    
    def getValue(): String
    
    def hasExclamation(): Boolean
    
    // Status
    def hasStatus(status: StatusIndications): Boolean
    
    def isFocus(): Boolean
    
    def isFocusedStyle(): Boolean
    
    def isHoveredStyle(): Boolean
    
    def isSizeSmall(): Boolean
    
    def trigger(
      trigger: /* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typings.wixStyleReact.wixStyleReactStrings.compositionStart, typings.wixStyleReact.wixStyleReactStrings.encrypted, typings.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any,
      event: SyntheticEventData
    ): Unit
  }
  object InputAreaDriver {
    
    inline def apply[T](
      enterText: String => Unit,
      exists: () => Boolean,
      focus: () => Unit,
      getAriaControls: () => String,
      getAriaDescribedby: () => String,
      getAriaLabel: () => String,
      getCounterValue: () => String,
      getCursorLocation: () => Double,
      getDefaultValue: () => String,
      getDisabled: () => Boolean,
      getHasCounter: () => Boolean,
      getMaxLength: () => Double,
      getName: () => String,
      getPlaceholder: () => String,
      getReadOnly: () => Boolean,
      getRequired: () => Boolean,
      getResizable: () => Boolean,
      getRowsCount: () => Double,
      getStatusMessage: () => String | Null,
      getStyle: () => CSSStyleDeclaration,
      getTabIndex: () => Double,
      getTooltipDataHook: () => String,
      getTooltipElement: () => T,
      getValue: () => String,
      hasExclamation: () => Boolean,
      hasStatus: StatusIndications => Boolean,
      isFocus: () => Boolean,
      isFocusedStyle: () => Boolean,
      isHoveredStyle: () => Boolean,
      isSizeSmall: () => Boolean,
      trigger: (/* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typings.wixStyleReact.wixStyleReactStrings.compositionStart, typings.wixStyleReact.wixStyleReactStrings.encrypted, typings.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any, SyntheticEventData) => Unit
    ): InputAreaDriver[T] = {
      val __obj = js.Dynamic.literal(enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getAriaControls = js.Any.fromFunction0(getAriaControls), getAriaDescribedby = js.Any.fromFunction0(getAriaDescribedby), getAriaLabel = js.Any.fromFunction0(getAriaLabel), getCounterValue = js.Any.fromFunction0(getCounterValue), getCursorLocation = js.Any.fromFunction0(getCursorLocation), getDefaultValue = js.Any.fromFunction0(getDefaultValue), getDisabled = js.Any.fromFunction0(getDisabled), getHasCounter = js.Any.fromFunction0(getHasCounter), getMaxLength = js.Any.fromFunction0(getMaxLength), getName = js.Any.fromFunction0(getName), getPlaceholder = js.Any.fromFunction0(getPlaceholder), getReadOnly = js.Any.fromFunction0(getReadOnly), getRequired = js.Any.fromFunction0(getRequired), getResizable = js.Any.fromFunction0(getResizable), getRowsCount = js.Any.fromFunction0(getRowsCount), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getStyle = js.Any.fromFunction0(getStyle), getTabIndex = js.Any.fromFunction0(getTabIndex), getTooltipDataHook = js.Any.fromFunction0(getTooltipDataHook), getTooltipElement = js.Any.fromFunction0(getTooltipElement), getValue = js.Any.fromFunction0(getValue), hasExclamation = js.Any.fromFunction0(hasExclamation), hasStatus = js.Any.fromFunction1(hasStatus), isFocus = js.Any.fromFunction0(isFocus), isFocusedStyle = js.Any.fromFunction0(isFocusedStyle), isHoveredStyle = js.Any.fromFunction0(isHoveredStyle), isSizeSmall = js.Any.fromFunction0(isSizeSmall), trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[InputAreaDriver[T]]
    }
    
    extension [Self <: InputAreaDriver[?], T](x: Self & InputAreaDriver[T]) {
      
      inline def setEnterText(value: String => Unit): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetAriaControls(value: () => String): Self = StObject.set(x, "getAriaControls", js.Any.fromFunction0(value))
      
      inline def setGetAriaDescribedby(value: () => String): Self = StObject.set(x, "getAriaDescribedby", js.Any.fromFunction0(value))
      
      inline def setGetAriaLabel(value: () => String): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction0(value))
      
      inline def setGetCounterValue(value: () => String): Self = StObject.set(x, "getCounterValue", js.Any.fromFunction0(value))
      
      inline def setGetCursorLocation(value: () => Double): Self = StObject.set(x, "getCursorLocation", js.Any.fromFunction0(value))
      
      inline def setGetDefaultValue(value: () => String): Self = StObject.set(x, "getDefaultValue", js.Any.fromFunction0(value))
      
      inline def setGetDisabled(value: () => Boolean): Self = StObject.set(x, "getDisabled", js.Any.fromFunction0(value))
      
      inline def setGetHasCounter(value: () => Boolean): Self = StObject.set(x, "getHasCounter", js.Any.fromFunction0(value))
      
      inline def setGetMaxLength(value: () => Double): Self = StObject.set(x, "getMaxLength", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetPlaceholder(value: () => String): Self = StObject.set(x, "getPlaceholder", js.Any.fromFunction0(value))
      
      inline def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
      
      inline def setGetRequired(value: () => Boolean): Self = StObject.set(x, "getRequired", js.Any.fromFunction0(value))
      
      inline def setGetResizable(value: () => Boolean): Self = StObject.set(x, "getResizable", js.Any.fromFunction0(value))
      
      inline def setGetRowsCount(value: () => Double): Self = StObject.set(x, "getRowsCount", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => String | Null): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetStyle(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
      
      inline def setGetTabIndex(value: () => Double): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
      
      inline def setGetTooltipDataHook(value: () => String): Self = StObject.set(x, "getTooltipDataHook", js.Any.fromFunction0(value))
      
      inline def setGetTooltipElement(value: () => T): Self = StObject.set(x, "getTooltipElement", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setHasExclamation(value: () => Boolean): Self = StObject.set(x, "hasExclamation", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => Boolean): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsFocus(value: () => Boolean): Self = StObject.set(x, "isFocus", js.Any.fromFunction0(value))
      
      inline def setIsFocusedStyle(value: () => Boolean): Self = StObject.set(x, "isFocusedStyle", js.Any.fromFunction0(value))
      
      inline def setIsHoveredStyle(value: () => Boolean): Self = StObject.set(x, "isHoveredStyle", js.Any.fromFunction0(value))
      
      inline def setIsSizeSmall(value: () => Boolean): Self = StObject.set(x, "isSizeSmall", js.Any.fromFunction0(value))
      
      inline def setTrigger(
        value: (/* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typings.wixStyleReact.wixStyleReactStrings.compositionStart, typings.wixStyleReact.wixStyleReactStrings.encrypted, typings.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any, SyntheticEventData) => Unit
      ): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
    }
  }
}
