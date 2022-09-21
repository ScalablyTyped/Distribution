package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverMod {
  
  @JSImport("@testing-library/user-event/dist/types/convenience/hover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hover(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def unhover(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unhover")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
