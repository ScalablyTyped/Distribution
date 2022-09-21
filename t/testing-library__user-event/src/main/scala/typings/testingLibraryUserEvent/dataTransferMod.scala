package typings.testingLibraryUserEvent

import typings.std.Blob
import typings.std.DataTransfer
import typings.std.DataTransferItem
import typings.std.File
import typings.testingLibraryUserEvent.trackValueMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTransferMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/dataTransfer/DataTransfer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDataTransfer(window: Window & (/* globalThis */ Any)): DataTransfer = ^.asInstanceOf[js.Dynamic].applyDynamic("createDataTransfer")(window.asInstanceOf[js.Any]).asInstanceOf[DataTransfer]
  inline def createDataTransfer(window: Window & (/* globalThis */ Any), files: js.Array[File]): DataTransfer = (^.asInstanceOf[js.Dynamic].applyDynamic("createDataTransfer")(window.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[DataTransfer]
  
  inline def getBlobFromDataTransferItem(window: Window & (/* globalThis */ Any), item: DataTransferItem): Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlobFromDataTransferItem")(window.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Blob]
}
