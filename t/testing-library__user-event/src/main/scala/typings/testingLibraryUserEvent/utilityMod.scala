package typings.testingLibraryUserEvent

import typings.std.File
import typings.std.HTMLElement
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.typeMod.typeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityMod {
  
  @JSImport("@testing-library/user-event/dist/types/utility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deselectOptions(select: Element, values: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def deselectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def deselectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def selectOptions(select: Element, values: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def selectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def selectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def `type`(element: Element, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def `type`(
    element: Element,
    text: String,
    hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd: typeOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def upload(element: HTMLElement, fileOrFiles: js.Array[File]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def upload(element: HTMLElement, fileOrFiles: File): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
