package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isFocusableMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/focus/isFocusable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFocusable(element: Element): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
}
