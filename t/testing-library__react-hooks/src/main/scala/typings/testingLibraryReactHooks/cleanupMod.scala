package typings.testingLibraryReactHooks

import typings.testingLibraryReactHooks.typesMod.CleanupCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanupMod {
  
  @JSImport("@testing-library/react-hooks/lib/core/cleanup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCleanup(callback: CleanupCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def autoRegisterCleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("autoRegisterCleanup")().asInstanceOf[Unit]
  
  inline def cleanup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[js.Promise[Unit]]
  
  inline def removeCleanup(callback: CleanupCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
