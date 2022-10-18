package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityTypeMod {
  
  @JSImport("@testing-library/user-event/dist/types/utility/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `type`(element: Element, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def `type`(
    element: Element,
    text: String,
    hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd: typeOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait typeOptions extends StObject {
    
    var initialSelectionEnd: js.UndefOr[Double] = js.undefined
    
    var initialSelectionStart: js.UndefOr[Double] = js.undefined
    
    var skipAutoClose: js.UndefOr[Boolean] = js.undefined
    
    var skipClick: js.UndefOr[Boolean] = js.undefined
  }
  object typeOptions {
    
    inline def apply(): typeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typeOptions]
    }
    
    extension [Self <: typeOptions](x: Self) {
      
      inline def setInitialSelectionEnd(value: Double): Self = StObject.set(x, "initialSelectionEnd", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectionEndUndefined: Self = StObject.set(x, "initialSelectionEnd", js.undefined)
      
      inline def setInitialSelectionStart(value: Double): Self = StObject.set(x, "initialSelectionStart", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectionStartUndefined: Self = StObject.set(x, "initialSelectionStart", js.undefined)
      
      inline def setSkipAutoClose(value: Boolean): Self = StObject.set(x, "skipAutoClose", value.asInstanceOf[js.Any])
      
      inline def setSkipAutoCloseUndefined: Self = StObject.set(x, "skipAutoClose", js.undefined)
      
      inline def setSkipClick(value: Boolean): Self = StObject.set(x, "skipClick", value.asInstanceOf[js.Any])
      
      inline def setSkipClickUndefined: Self = StObject.set(x, "skipClick", js.undefined)
    }
  }
}
