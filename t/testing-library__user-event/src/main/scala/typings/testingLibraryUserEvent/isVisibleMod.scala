package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isVisibleMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/misc/isVisible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isVisible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
