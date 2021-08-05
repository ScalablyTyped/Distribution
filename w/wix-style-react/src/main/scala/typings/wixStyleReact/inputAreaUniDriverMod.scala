package typings.wixStyleReact

import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.unidriverCore.mod.UniDriver
import typings.wixStyleReact.commonMod.StatusIndications
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAreaUniDriverMod {
  
  trait InputAreaUniDriver
    extends StObject
       with BaseUniDriver {
    
    def enterText(text: String): js.Promise[String]
    
    def focus(): js.Promise[Unit]
    
    def getAriaControls(): js.Promise[String | Null]
    
    def getAriaDescribedby(): js.Promise[String | Null]
    
    def getAriaLabel(): js.Promise[String | Null]
    
    def getCounterValue(): js.Promise[String]
    
    def getDefaultValue(): js.Promise[js.Any]
    
    def getDisabled(): js.Promise[Boolean]
    
    def getHasCounter(): js.Promise[Boolean]
    
    def getMaxLength(): js.Promise[js.Any]
    
    def getName(): js.Promise[String | Null]
    
    def getPlaceholder(): js.Promise[js.Any]
    
    def getReadOnly(): js.Promise[js.Any]
    
    def getRequired(): js.Promise[Boolean]
    
    def getResizable(): js.Promise[Boolean]
    
    def getRowsCount(): js.Promise[js.Any]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getStyle(): js.Promise[js.Any]
    
    def getTabIndex(): js.Promise[js.Any]
    
    def getTooltipDataHook(): String
    
    def getTooltipElement(): UniDriver[js.Any]
    
    def getValue(): js.Promise[String]
    
    def hasExclamation(): js.Promise[Boolean]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isFocus(): js.Promise[Boolean]
    
    def isFocusedStyle(): js.Promise[Boolean]
    
    def isHoveredStyle(): js.Promise[Boolean]
    
    def isSizeSmall(): js.Promise[Boolean]
    
    def trigger(
      trigger: /* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68 */ js.Any,
      event: SyntheticEventData
    ): js.Promise[Unit]
  }
  object InputAreaUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      enterText: String => js.Promise[String],
      exists: () => js.Promise[Boolean],
      focus: () => js.Promise[Unit],
      getAriaControls: () => js.Promise[String | Null],
      getAriaDescribedby: () => js.Promise[String | Null],
      getAriaLabel: () => js.Promise[String | Null],
      getCounterValue: () => js.Promise[String],
      getDefaultValue: () => js.Promise[js.Any],
      getDisabled: () => js.Promise[Boolean],
      getHasCounter: () => js.Promise[Boolean],
      getMaxLength: () => js.Promise[js.Any],
      getName: () => js.Promise[String | Null],
      getPlaceholder: () => js.Promise[js.Any],
      getReadOnly: () => js.Promise[js.Any],
      getRequired: () => js.Promise[Boolean],
      getResizable: () => js.Promise[Boolean],
      getRowsCount: () => js.Promise[js.Any],
      getStatusMessage: () => js.Promise[String | Null],
      getStyle: () => js.Promise[js.Any],
      getTabIndex: () => js.Promise[js.Any],
      getTooltipDataHook: () => String,
      getTooltipElement: () => UniDriver[js.Any],
      getValue: () => js.Promise[String],
      hasExclamation: () => js.Promise[Boolean],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isFocus: () => js.Promise[Boolean],
      isFocusedStyle: () => js.Promise[Boolean],
      isHoveredStyle: () => js.Promise[Boolean],
      isSizeSmall: () => js.Promise[Boolean],
      trigger: (/* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68 */ js.Any, SyntheticEventData) => js.Promise[Unit]
    ): InputAreaUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getAriaControls = js.Any.fromFunction0(getAriaControls), getAriaDescribedby = js.Any.fromFunction0(getAriaDescribedby), getAriaLabel = js.Any.fromFunction0(getAriaLabel), getCounterValue = js.Any.fromFunction0(getCounterValue), getDefaultValue = js.Any.fromFunction0(getDefaultValue), getDisabled = js.Any.fromFunction0(getDisabled), getHasCounter = js.Any.fromFunction0(getHasCounter), getMaxLength = js.Any.fromFunction0(getMaxLength), getName = js.Any.fromFunction0(getName), getPlaceholder = js.Any.fromFunction0(getPlaceholder), getReadOnly = js.Any.fromFunction0(getReadOnly), getRequired = js.Any.fromFunction0(getRequired), getResizable = js.Any.fromFunction0(getResizable), getRowsCount = js.Any.fromFunction0(getRowsCount), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getStyle = js.Any.fromFunction0(getStyle), getTabIndex = js.Any.fromFunction0(getTabIndex), getTooltipDataHook = js.Any.fromFunction0(getTooltipDataHook), getTooltipElement = js.Any.fromFunction0(getTooltipElement), getValue = js.Any.fromFunction0(getValue), hasExclamation = js.Any.fromFunction0(hasExclamation), hasStatus = js.Any.fromFunction1(hasStatus), isFocus = js.Any.fromFunction0(isFocus), isFocusedStyle = js.Any.fromFunction0(isFocusedStyle), isHoveredStyle = js.Any.fromFunction0(isHoveredStyle), isSizeSmall = js.Any.fromFunction0(isSizeSmall), trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[InputAreaUniDriver]
    }
    
    extension [Self <: InputAreaUniDriver](x: Self) {
      
      inline def setEnterText(value: String => js.Promise[String]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetAriaControls(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getAriaControls", js.Any.fromFunction0(value))
      
      inline def setGetAriaDescribedby(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getAriaDescribedby", js.Any.fromFunction0(value))
      
      inline def setGetAriaLabel(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction0(value))
      
      inline def setGetCounterValue(value: () => js.Promise[String]): Self = StObject.set(x, "getCounterValue", js.Any.fromFunction0(value))
      
      inline def setGetDefaultValue(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getDefaultValue", js.Any.fromFunction0(value))
      
      inline def setGetDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "getDisabled", js.Any.fromFunction0(value))
      
      inline def setGetHasCounter(value: () => js.Promise[Boolean]): Self = StObject.set(x, "getHasCounter", js.Any.fromFunction0(value))
      
      inline def setGetMaxLength(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getMaxLength", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetPlaceholder(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getPlaceholder", js.Any.fromFunction0(value))
      
      inline def setGetReadOnly(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
      
      inline def setGetRequired(value: () => js.Promise[Boolean]): Self = StObject.set(x, "getRequired", js.Any.fromFunction0(value))
      
      inline def setGetResizable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "getResizable", js.Any.fromFunction0(value))
      
      inline def setGetRowsCount(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getRowsCount", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetStyle(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
      
      inline def setGetTabIndex(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
      
      inline def setGetTooltipDataHook(value: () => String): Self = StObject.set(x, "getTooltipDataHook", js.Any.fromFunction0(value))
      
      inline def setGetTooltipElement(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getTooltipElement", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setHasExclamation(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasExclamation", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsFocus(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocus", js.Any.fromFunction0(value))
      
      inline def setIsFocusedStyle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocusedStyle", js.Any.fromFunction0(value))
      
      inline def setIsHoveredStyle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isHoveredStyle", js.Any.fromFunction0(value))
      
      inline def setIsSizeSmall(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSizeSmall", js.Any.fromFunction0(value))
      
      inline def setTrigger(
        value: (/* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68 */ js.Any, SyntheticEventData) => js.Promise[Unit]
      ): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
    }
  }
}
