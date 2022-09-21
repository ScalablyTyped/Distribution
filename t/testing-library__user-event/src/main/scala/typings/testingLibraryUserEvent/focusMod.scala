package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blurElement(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blurElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def focusElement(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
