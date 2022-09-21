package typings.testingLibraryUserEvent

import typings.std.HTMLElement
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectOptionsMod {
  
  @JSImport("@testing-library/user-event/dist/types/utility/selectOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deselectOptions(select: Element, values: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def deselectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def deselectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def selectOptions(select: Element, values: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def selectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def selectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
