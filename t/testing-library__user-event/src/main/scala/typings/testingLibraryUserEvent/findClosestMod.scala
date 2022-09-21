package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findClosestMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/misc/findClosest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findClosest[T /* <: Element */](element: Element, callback: js.Function1[/* e */ Element, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosest")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
}
