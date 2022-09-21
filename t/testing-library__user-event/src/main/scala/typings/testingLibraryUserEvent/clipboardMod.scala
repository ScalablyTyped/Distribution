package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  @JSImport("@testing-library/user-event/dist/types/clipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy(): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")().asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
  
  inline def cut(): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")().asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
  
  inline def paste(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")().asInstanceOf[js.Promise[Unit]]
  inline def paste(clipboardData: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def paste(clipboardData: DataTransfer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
