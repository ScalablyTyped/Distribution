package typings.wixStyleReact

import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.wixStyleReact.commonMod.FocusOptionsPolyfill
import typings.wixStyleReact.commonMod.StatusIndications
import typings.wixStyleReact.inputMod.InputSize
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputDriverMod {
  
  @js.native
  trait InputDriver
    extends StObject
       with BaseDriver {
    
    def blur(): Unit = js.native
    
    def clearText(): Unit = js.native
    
    def click(): Unit = js.native
    
    def clickClear(): Unit = js.native
    
    def clickCustomAffix(): Unit = js.native
    
    def clickIconAffix(): Unit = js.native
    
    def clickMagnifyingGlass(): Unit = js.native
    
    def clickMenuArrow(): Unit = js.native
    
    def clickUnit(): Unit = js.native
    
    def endComposing(): Unit = js.native
    
    def enterText(text: String): Unit = js.native
    
    def focus(): FocusOptionsPolyfill = js.native
    def focus(options: FocusOptionsPolyfill): FocusOptionsPolyfill = js.native
    
    def getAriaControls(): String | Null = js.native
    
    def getAriaDescribedby(): String | Null = js.native
    
    def getAriaLabel(): String | Null = js.native
    
    def getAutocomplete(): String | Null = js.native
    
    def getCursorLocation(): Double = js.native
    
    def getCustomAffix(): String = js.native
    
    def getDataHook(): String | Null = js.native
    
    def getDefaultValue(): String = js.native
    
    def getDisabled(): Boolean = js.native
    
    def getInputElementClasses(): String = js.native
    
    def getMaxLength(): String | Null = js.native
    
    def getName(): String | Null = js.native
    
    def getPlaceholder(): String = js.native
    
    def getReadOnly(): Boolean = js.native
    
    def getRequired(): Boolean = js.native
    
    def getRootElementClasses(): String = js.native
    
    def getSize(): String | Null = js.native
    
    def getStatusMessage(): String | Null = js.native
    
    def getTabIndex(): Double = js.native
    
    def getText(): String = js.native
    
    def getTextOverflow(): String = js.native
    
    def getType(): String | Null = js.native
    
    def getUnit(): String = js.native
    
    def getValue(): String = js.native
    
    def hasClearButton(): Boolean = js.native
    
    def hasLeftBorderRadius(): Boolean = js.native
    
    def hasMagnifyingGlass(): Boolean = js.native
    
    def hasMenuArrow(): Boolean = js.native
    
    def hasPrefix(): Boolean = js.native
    
    def hasRightBorderRadius(): Boolean = js.native
    
    // Status
    def hasStatus(status: StatusIndications): Boolean = js.native
    
    def hasSuffix(): Boolean = js.native
    
    def isCustomInput(): Boolean = js.native
    
    def isDisabled(): Boolean = js.native
    
    def isFocus(): Boolean = js.native
    
    def isFocusedStyle(): Boolean = js.native
    
    def isHoveredStyle(): Boolean = js.native
    
    def isOfSize(size: InputSize): Boolean = js.native
    
    def isRTL(): Boolean = js.native
    
    def keyDown(): Unit = js.native
    def keyDown(key: String): Unit = js.native
    
    def mouseOut(): Unit = js.native
    
    def mouseOver(): Unit = js.native
    
    def prefixComponentExists(style: String): Boolean = js.native
    
    def startComposing(): Unit = js.native
    
    def suffixComponentExists(style: String): Boolean = js.native
    
    def trigger(trigger: String, event: SyntheticEventData): Unit = js.native
  }
}
