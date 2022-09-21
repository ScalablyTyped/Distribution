package typings.testingLibraryUserEvent

import typings.std.Blob
import typings.std.ClipboardItem
import typings.std.DataTransfer
import typings.std.Document
import typings.testingLibraryUserEvent.trackValueMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTransferClipboardMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/dataTransfer/Clipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachClipboardStubToView(window: Window & (/* globalThis */ Any)): ClipboardStubControlInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("attachClipboardStubToView")(window.asInstanceOf[js.Any]).asInstanceOf[ClipboardStubControlInstance]
  
  inline def createClipboardItem(window: Window & (/* globalThis */ Any), blobs: (Blob | String)*): ClipboardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createClipboardItem")(List(window.asInstanceOf[js.Any]).`++`(blobs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ClipboardItem]
  
  inline def detachClipboardStubFromView(window: Window & (/* globalThis */ Any)): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachClipboardStubFromView")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def readDataTransferFromClipboard(document: Document): js.Promise[DataTransfer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDataTransferFromClipboard")(document.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataTransfer]]
  
  inline def resetClipboardStubOnView(window: Window & (/* globalThis */ Any)): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetClipboardStubOnView")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def writeDataTransferToClipboard(document: Document, clipboardData: DataTransfer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDataTransferToClipboard")(document.asInstanceOf[js.Any], clipboardData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ClipboardStubControlInstance extends StObject {
    
    def detachClipboardStub(): Unit
    
    def resetClipboardStub(): Unit
  }
  object ClipboardStubControlInstance {
    
    inline def apply(detachClipboardStub: () => Unit, resetClipboardStub: () => Unit): ClipboardStubControlInstance = {
      val __obj = js.Dynamic.literal(detachClipboardStub = js.Any.fromFunction0(detachClipboardStub), resetClipboardStub = js.Any.fromFunction0(resetClipboardStub))
      __obj.asInstanceOf[ClipboardStubControlInstance]
    }
    
    extension [Self <: ClipboardStubControlInstance](x: Self) {
      
      inline def setDetachClipboardStub(value: () => Unit): Self = StObject.set(x, "detachClipboardStub", js.Any.fromFunction0(value))
      
      inline def setResetClipboardStub(value: () => Unit): Self = StObject.set(x, "resetClipboardStub", js.Any.fromFunction0(value))
    }
  }
}
