package typings.stubbornFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAttemptifyMod {
  
  @JSImport("stubborn-fs/dist/attemptify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attemptifyAsync[FN /* <: js.Function */](fn: FN, onError: js.Function1[/* error */ Any, Unit]): FN = (^.asInstanceOf[js.Dynamic].applyDynamic("attemptifyAsync")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[FN]
  
  inline def attemptifySync[FN /* <: js.Function */](fn: FN, onError: js.Function1[/* error */ Any, Unit]): FN = (^.asInstanceOf[js.Dynamic].applyDynamic("attemptifySync")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[FN]
}
