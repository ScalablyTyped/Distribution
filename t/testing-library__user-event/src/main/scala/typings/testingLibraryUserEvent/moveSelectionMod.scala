package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.testingLibraryUserEventNumbers.`-1`
import typings.testingLibraryUserEvent.testingLibraryUserEventNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveSelectionMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection/moveSelection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def moveSelection(node: Element, direction: `-1` | `1`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSelection")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
