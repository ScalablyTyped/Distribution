package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cutMod {
  
  @JSImport("@testing-library/user-event/dist/types/clipboard/cut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cut(): js.Promise[js.UndefOr[DataTransfer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")().asInstanceOf[js.Promise[js.UndefOr[DataTransfer]]]
}
