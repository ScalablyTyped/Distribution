package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import typings.std.File
import typings.std.HTMLElement
import typings.testingLibraryUserEvent.anon.Shift
import typings.testingLibraryUserEvent.distTypesPointerMod.PointerInput
import typings.testingLibraryUserEvent.distTypesUtilityTypeMod.typeOptions
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetupApiMod {
  
  @JSImport("@testing-library/user-event/dist/types/setup/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def click(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def copy(): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")().asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
  
  inline def cut(): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")().asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
  
  inline def dblClick(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deselectOptions(select: Element, values: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def deselectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def deselectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def hover(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def keyboard(text: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboard")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def paste(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")().asInstanceOf[js.Promise[Unit]]
  inline def paste(clipboardData: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def paste(clipboardData: DataTransfer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def pointer(input: PointerInput): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointer")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def selectOptions(select: Element, values: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def selectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def selectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def tab(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")().asInstanceOf[js.Promise[Unit]]
  inline def tab(hasShift: Shift): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")(hasShift.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def tripleClick(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tripleClick")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def `type`(element: Element, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def `type`(
    element: Element,
    text: String,
    hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd: typeOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def unhover(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unhover")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def upload(element: HTMLElement, fileOrFiles: js.Array[File]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def upload(element: HTMLElement, fileOrFiles: File): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
