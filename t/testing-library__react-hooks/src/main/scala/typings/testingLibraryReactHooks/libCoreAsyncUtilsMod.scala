package typings.testingLibraryReactHooks

import typings.testingLibraryReactHooks.libTypesMod.Act
import typings.testingLibraryReactHooks.libTypesMod.AsyncUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreAsyncUtilsMod {
  
  @JSImport("@testing-library/react-hooks/lib/core/asyncUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncUtils(act: Act, addResolver: js.Function1[/* callback */ js.Function0[Unit], Unit]): AsyncUtils = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncUtils")(act.asInstanceOf[js.Any], addResolver.asInstanceOf[js.Any])).asInstanceOf[AsyncUtils]
}
