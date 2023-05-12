package typings.stubbornFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRetryifyMod {
  
  @JSImport("stubborn-fs/dist/retryify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retryifyAsync[FN /* <: js.Function */](fn: FN, isRetriableError: js.Function1[/* error */ Any, Boolean | Unit]): js.Function1[/* timeout */ Double, FN] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryifyAsync")(fn.asInstanceOf[js.Any], isRetriableError.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* timeout */ Double, FN]]
  
  inline def retryifySync[FN /* <: js.Function */](fn: FN, isRetriableError: js.Function1[/* error */ Any, Boolean | Unit]): js.Function1[/* timeout */ Double, FN] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryifySync")(fn.asInstanceOf[js.Any], isRetriableError.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* timeout */ Double, FN]]
}
