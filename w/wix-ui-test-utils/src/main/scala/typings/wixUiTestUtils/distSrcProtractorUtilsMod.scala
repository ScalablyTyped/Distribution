package typings.wixUiTestUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtractorUtilsMod {
  
  @JSImport("wix-ui-test-utils/dist/src/protractor/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventually(callback: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Double, lastError: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Unit, lastError: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Double, lastError: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Unit, lastError: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Double, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Unit, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Double, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Unit, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
