package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setSelectionRangeMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection/setSelectionRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSelectionRange(element: Element, anchorOffset: Double, focusOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSelectionRange")(element.asInstanceOf[js.Any], anchorOffset.asInstanceOf[js.Any], focusOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
