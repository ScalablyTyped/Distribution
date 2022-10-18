package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventWrapEventMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/wrapEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapEvent[R](cb: js.Function0[R], _element: Element): R = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEvent")(cb.asInstanceOf[js.Any], _element.asInstanceOf[js.Any])).asInstanceOf[R]
}
