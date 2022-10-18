package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClipboardCopyMod {
  
  @JSImport("@testing-library/user-event/dist/types/clipboard/copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy(): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")().asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
}
