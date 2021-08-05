package typings.testingLibraryDom

import typings.testingLibraryDom.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitMod {
  
  @JSImport("@testing-library/dom/types/wait", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wait_(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")().asInstanceOf[js.Promise[Unit]]
  inline def wait_(callback: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def wait_(callback: js.Function0[Unit], options: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def wait_(callback: Unit, options: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
