package typings.testingLibraryUserEvent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapAsyncMod {
  
  @JSImport("@testing-library/user-event/dist/types/setup/wrapAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapAsync[R, P /* <: js.Function0[js.Promise[R] | R] */](implementation: P): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(implementation.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
}
