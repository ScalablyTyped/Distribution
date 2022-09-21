package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.Shift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("@testing-library/user-event/dist/types/convenience/tab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tab(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")().asInstanceOf[js.Promise[Unit]]
  inline def tab(hasShift: Shift): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")(hasShift.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
