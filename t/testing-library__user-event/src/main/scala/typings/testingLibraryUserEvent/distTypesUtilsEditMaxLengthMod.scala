package typings.testingLibraryUserEvent

import typings.std.HTMLTextAreaElement
import typings.testingLibraryUserEvent.anon.HTMLInputElementtypemaxLe
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEditMaxLengthMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/edit/maxLength", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaxLength(element: ElementWithMaxLengthSupport): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxLength")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @js.native
  sealed trait maxLengthSupportedTypes extends StObject
  @JSImport("@testing-library/user-event/dist/types/utils/edit/maxLength", "maxLengthSupportedTypes")
  @js.native
  object maxLengthSupportedTypes extends StObject {
    
    @js.native
    sealed trait email
      extends StObject
         with maxLengthSupportedTypes
    
    @js.native
    sealed trait password
      extends StObject
         with maxLengthSupportedTypes
    
    @js.native
    sealed trait search
      extends StObject
         with maxLengthSupportedTypes
    
    @js.native
    sealed trait telephone
      extends StObject
         with maxLengthSupportedTypes
    
    @js.native
    sealed trait text
      extends StObject
         with maxLengthSupportedTypes
    
    @js.native
    sealed trait url
      extends StObject
         with maxLengthSupportedTypes
  }
  
  inline def supportsMaxLength(element: Element): /* is @testing-library/user-event.@testing-library/user-event/dist/types/utils/edit/maxLength.ElementWithMaxLengthSupport */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMaxLength")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @testing-library/user-event.@testing-library/user-event/dist/types/utils/edit/maxLength.ElementWithMaxLengthSupport */ Boolean]
  
  type ElementWithMaxLengthSupport = HTMLTextAreaElement | HTMLInputElementtypemaxLe
}
