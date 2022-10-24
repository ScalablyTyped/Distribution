package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.Shift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConvenienceTabMod {
  
  @JSImport("@testing-library/user-event/dist/types/convenience/tab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tab(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")().asInstanceOf[js.Promise[Unit]]
  inline def tab(param1: Shift): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
