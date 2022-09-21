package typings.testingLibraryUserEvent

import typings.std.HTMLButtonElement
import typings.testingLibraryUserEvent.anon.HTMLInputElementtypeclick
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isClickableInputMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/click/isClickableInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait clickableInputTypes extends StObject
  @JSImport("@testing-library/user-event/dist/types/utils/click/isClickableInput", "clickableInputTypes")
  @js.native
  object clickableInputTypes extends StObject {
    
    @js.native
    sealed trait button
      extends StObject
         with clickableInputTypes
    
    @js.native
    sealed trait checkbox
      extends StObject
         with clickableInputTypes
    
    @js.native
    sealed trait color
      extends StObject
         with clickableInputTypes
    
    @js.native
    sealed trait file
      extends StObject
         with clickableInputTypes
    
    @js.native
    sealed trait image
      extends StObject
         with clickableInputTypes
    
    @js.native
    sealed trait radio
      extends StObject
         with clickableInputTypes
    
    @js.native
    sealed trait reset
      extends StObject
         with clickableInputTypes
    
    @js.native
    sealed trait submit
      extends StObject
         with clickableInputTypes
  }
  
  inline def isClickableInput(element: Element): /* is @testing-library/user-event.@testing-library/user-event/dist/types/utils/click/isClickableInput.ClickableInputOrButton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClickableInput")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @testing-library/user-event.@testing-library/user-event/dist/types/utils/click/isClickableInput.ClickableInputOrButton */ Boolean]
  
  type ClickableInputOrButton = HTMLButtonElement | HTMLInputElementtypeclick
}
