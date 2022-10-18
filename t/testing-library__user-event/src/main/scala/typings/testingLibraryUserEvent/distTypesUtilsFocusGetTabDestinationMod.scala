package typings.testingLibraryUserEvent

import typings.std.HTMLElement
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsFocusGetTabDestinationMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/focus/getTabDestination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTabDestination(activeElement: Element, shift: Boolean): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabDestination")(activeElement.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
