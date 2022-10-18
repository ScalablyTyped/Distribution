package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.Shift
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConvenienceMod {
  
  @JSImport("@testing-library/user-event/dist/types/convenience", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def click(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def dblClick(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def hover(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def tab(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")().asInstanceOf[js.Promise[Unit]]
  inline def tab(hasShift: Shift): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")(hasShift.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def tripleClick(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tripleClick")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def unhover(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unhover")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
