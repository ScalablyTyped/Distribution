package typings.wixStyleReact

import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.wixStyleReact.commonMod.StatusIndications
import typings.wixStyleReact.inputMod.InputSize
import typings.wixStyleReact.wixStyleReactStrings.blur
import typings.wixStyleReact.wixStyleReactStrings.change
import typings.wixStyleReact.wixStyleReactStrings.focus
import typings.wixStyleReact.wixStyleReactStrings.keyDown
import typings.wixStyleReact.wixStyleReactStrings.keyUp
import typings.wixStyleReact.wixStyleReactStrings.paste
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputUniDriverMod {
  
  @js.native
  trait InputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def blur(): js.Promise[Unit] = js.native
    
    def clearText(): js.Promise[Unit] = js.native
    
    def clickClear(): js.Promise[Unit] = js.native
    
    def clickCustomAffix(): js.Promise[Unit] = js.native
    
    def clickIconAffix(): js.Promise[Unit] = js.native
    
    def clickMagnifyingGlass(): js.Promise[Unit] = js.native
    
    def clickMenuArrow(): js.Promise[Unit] = js.native
    
    def clickOutside(): Boolean = js.native
    
    def clickUnit(): js.Promise[Unit] = js.native
    
    def enterText(value: String): js.Promise[Unit] = js.native
    
    def focus(): js.Promise[Unit] = js.native
    
    def getAriaControls(): js.Promise[String | Null] = js.native
    
    def getAriaDescribedby(): js.Promise[String | Null] = js.native
    
    def getAriaLabel(): js.Promise[String | Null] = js.native
    
    def getAutocomplete(): js.Promise[String | Null] = js.native
    
    def getCursorLocation(): js.Promise[js.Any] = js.native
    
    def getDefaultValue(): js.Promise[js.Any] = js.native
    
    def getDisabled(): js.Promise[js.Any] = js.native
    
    def getInputElementClasses(): js.Promise[String] = js.native
    
    def getMaxLength(): js.Promise[String | Null] = js.native
    
    def getName(): js.Promise[String | Null] = js.native
    
    def getPlaceholder(): js.Promise[String | Null] = js.native
    
    def getReadOnly(): js.Promise[js.Any] = js.native
    
    def getRequired(): js.Promise[js.Any] = js.native
    
    def getRootElementClasses(): js.Promise[String] = js.native
    
    def getSize(): js.Promise[InputSize | Null] = js.native
    
    def getStatusMessage(): js.Promise[String | Null] = js.native
    
    def getTabIndex(): js.Promise[js.Any] = js.native
    
    def getText(): js.Promise[String] = js.native
    
    def getTextOverflow(): js.Promise[String] = js.native
    
    def getType(): js.Promise[String | Null] = js.native
    
    def getUnit(): js.Promise[String] = js.native
    
    def getValue(): js.Promise[String] = js.native
    
    def hasClearButton(): js.Promise[Boolean] = js.native
    
    def hasHelp(): js.Promise[Boolean] = js.native
    
    def hasMagnifyingGlass(): js.Promise[Boolean] = js.native
    
    def hasMenuArrow(): js.Promise[Boolean] = js.native
    
    def hasPrefix(): js.Promise[Boolean] = js.native
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean] = js.native
    
    def hasSuffix(): js.Promise[Boolean] = js.native
    
    def isCustomInput(): js.Promise[Boolean] = js.native
    
    def isDisabled(): js.Promise[Boolean] = js.native
    
    def isFocus(): js.Promise[Boolean] = js.native
    
    def isFocusedStyle(): js.Promise[Boolean] = js.native
    
    def isHoveredStyle(): js.Promise[Boolean] = js.native
    
    def isOfSize(size: InputSize): js.Promise[Boolean] = js.native
    
    def isRTL(): js.Promise[Boolean] = js.native
    
    def keyDown(eventData: SyntheticEventData): js.Promise[Unit] = js.native
    
    def keyUp(): js.Promise[Unit] = js.native
    
    def paste(): js.Promise[Unit] = js.native
    
    def prefixComponentExists(style: String): js.Promise[Boolean] = js.native
    
    def suffixComponentExists(style: String): js.Promise[Boolean] = js.native
    
    @JSName("trigger")
    def trigger_blur(value: blur): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_change(value: change): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_focus(value: focus): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_keyDown(value: keyDown, event: SyntheticEventData): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_keyUp(value: keyUp): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_paste(value: paste): js.Promise[Unit] = js.native
  }
}
