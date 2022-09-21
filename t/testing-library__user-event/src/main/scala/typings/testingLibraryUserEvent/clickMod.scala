package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickMod {
  
  @JSImport("@testing-library/user-event/dist/types/convenience/click", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def click(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def dblClick(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def tripleClick(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tripleClick")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
