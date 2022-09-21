package typings.tryToCatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[PromiseData, FnArgs /* <: js.Array[Any] */](
    fn: js.Function1[/* args */ FnArgs, js.Promise[PromiseData]],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fnArgs because its type FnArgs is not an array type */ fnArgs: FnArgs
  ): js.Promise[js.Array[js.Error] | (js.Tuple2[Null, PromiseData])] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], fnArgs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error] | (js.Tuple2[Null, PromiseData])]]
  
  @JSImport("try-to-catch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
