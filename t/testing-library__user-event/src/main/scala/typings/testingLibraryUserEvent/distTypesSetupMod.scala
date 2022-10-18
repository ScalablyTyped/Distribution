package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import typings.std.File
import typings.std.HTMLElement
import typings.testingLibraryUserEvent.distTypesOptionsMod.Options
import typings.testingLibraryUserEvent.distTypesPointerMod.PointerInput
import typings.testingLibraryUserEvent.distTypesSetupDirectApiMod.DirectOptions
import typings.testingLibraryUserEvent.distTypesSetupSetupMod.UserEvent
import typings.testingLibraryUserEvent.distTypesSystemMod.System
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetupMod {
  
  object userEvent {
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def click(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def click(element: Element, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def copy(): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")().asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
    inline def copy(options: DirectOptions): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
    
    inline def cut(): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")().asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
    inline def cut(options: DirectOptions): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
    
    inline def dblClick(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def dblClick(element: Element, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def deselectOptions(select: Element, values: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def deselectOptions(select: Element, values: String, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def deselectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def deselectOptions(select: Element, values: js.Array[HTMLElement | String], options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def deselectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def deselectOptions(select: Element, values: HTMLElement, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def hover(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def hover(element: Element, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hover")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def keyboard(text: String): js.Promise[System] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboard")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[System]]
    inline def keyboard(text: String, options: DirectOptions): js.Promise[System] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyboard")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[System]]
    
    inline def paste(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")().asInstanceOf[js.Promise[Unit]]
    inline def paste(clipboardData: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def paste(clipboardData: String, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def paste(clipboardData: Unit, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def paste(clipboardData: DataTransfer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def paste(clipboardData: DataTransfer, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def pointer(input: PointerInput): js.Promise[System] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointer")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[System]]
    inline def pointer(input: PointerInput, options: DirectOptions): js.Promise[System] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[System]]
    
    inline def selectOptions(select: Element, values: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def selectOptions(select: Element, values: String, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def selectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def selectOptions(select: Element, values: js.Array[HTMLElement | String], options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def selectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def selectOptions(select: Element, values: HTMLElement, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(select.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def setup(): UserEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[UserEvent]
    inline def setup(options: Options): UserEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(options.asInstanceOf[js.Any]).asInstanceOf[UserEvent]
    
    inline def tab(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")().asInstanceOf[js.Promise[Unit]]
    
    inline def tab_0(
      options: DirectOptions & (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(this : @testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.Instance, hasShift : @testing-library/user-event.anon.Shift | undefined): std.Promise<void>>[0] */ js.Any)
    ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def tripleClick(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tripleClick")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def tripleClick(element: Element, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tripleClick")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def `type`(element: Element, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def type_2(
      element: Element,
      text: String,
      options: DirectOptions & (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(this : @testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.Instance, element : @testing-library/user-event.@testing-library/user-event/dist/types/utils/pointer/cssPointerEvents.<global>.Element, text : string, hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd : @testing-library/user-event.@testing-library/user-event/dist/types/utility/type.typeOptions | undefined): std.Promise<void>>[2] */ js.Any)
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def unhover(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unhover")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def unhover(element: Element, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unhover")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def upload(element: HTMLElement, fileOrFiles: js.Array[File]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def upload(element: HTMLElement, fileOrFiles: js.Array[File], options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def upload(element: HTMLElement, fileOrFiles: File): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def upload(element: HTMLElement, fileOrFiles: File, options: DirectOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
}
