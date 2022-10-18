package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesKeyboardMod {
  
  @JSImport("@testing-library/user-event/dist/types/keyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keyboard(text: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboard")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def releaseAllKeys(instance: Instance): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseAllKeys")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
