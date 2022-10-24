package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import typings.std.HTMLTextAreaElement
import typings.testingLibraryUserEvent.anon.AnchorOffset
import typings.testingLibraryUserEvent.distTypesDocumentUIMod.UISelectionRange
import typings.testingLibraryUserEvent.distTypesUtilsEditSetFilesMod.global.HTMLInputElement
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.modify
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDocumentMod {
  
  @JSImport("@testing-library/user-event/dist/types/document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearInitialValue(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInitialValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearInitialValue(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInitialValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def commitValueAfterInput(element: HTMLTextAreaElement, cursorOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitValueAfterInput")(element.asInstanceOf[js.Any], cursorOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commitValueAfterInput(element: HTMLInputElement, cursorOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitValueAfterInput")(element.asInstanceOf[js.Any], cursorOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copySelection(target: Element): DataTransfer = ^.asInstanceOf[js.Dynamic].applyDynamic("copySelection")(target.asInstanceOf[js.Any]).asInstanceOf[DataTransfer]
  
  inline def getUISelection(element: HTMLTextAreaElement): UISelectionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getUISelection")(element.asInstanceOf[js.Any]).asInstanceOf[UISelectionRange]
  inline def getUISelection(element: HTMLInputElement): UISelectionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getUISelection")(element.asInstanceOf[js.Any]).asInstanceOf[UISelectionRange]
  
  inline def getUIValue(element: HTMLTextAreaElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUIValue")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getUIValue(element: HTMLInputElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUIValue")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getValueOrTextContent[T /* <: Element | Null */](element: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends @testing-library/user-event.@testing-library/user-event/dist/types/utils/edit/setFiles.<global>.HTMLInputElement | std.HTMLTextAreaElement ? string : string | null */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueOrTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @testing-library/user-event.@testing-library/user-event/dist/types/utils/edit/setFiles.<global>.HTMLInputElement | std.HTMLTextAreaElement ? string : string | null */ js.Any]
  
  inline def setUISelection(element: HTMLTextAreaElement, param1: AnchorOffset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelection")(element.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUISelection(element: HTMLTextAreaElement, param1: AnchorOffset, mode: replace | modify): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelection")(element.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUISelection(element: HTMLInputElement, param1: AnchorOffset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelection")(element.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUISelection(element: HTMLInputElement, param1: AnchorOffset, mode: replace | modify): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUISelection")(element.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUIValue(element: HTMLTextAreaElement, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUIValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUIValue(element: HTMLInputElement, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUIValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
