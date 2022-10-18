package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClipboardPasteMod {
  
  @JSImport("@testing-library/user-event/dist/types/clipboard/paste", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paste(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")().asInstanceOf[js.Promise[Unit]]
  inline def paste(clipboardData: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def paste(clipboardData: DataTransfer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
