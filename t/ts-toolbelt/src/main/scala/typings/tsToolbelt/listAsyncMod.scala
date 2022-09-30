package typings.tsToolbelt

import typings.tsToolbelt.awaitMod.Await
import typings.tsToolbelt.curryMod.Curry
import typings.tsToolbelt.functionMod.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listAsyncMod {
  
  @js.native
  trait PipeListAsync extends StObject {
    
    def apply[R0, P /* <: js.Array[Any] */](fns: js.Array[(Function[P, R0]) | (Curry[Function[P, R0]])]): Function[P, js.Promise[Await[R0]]] = js.native
    def apply[R0, R1, P /* <: js.Array[Any] */](
      fns: js.Tuple2[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]])
        ]
    ): Function[P, js.Promise[Await[R1]]] = js.native
    def apply[R0, R1, R2, P /* <: js.Array[Any] */](
      fns: js.Tuple3[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
          (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]])
        ]
    ): Function[P, js.Promise[Await[R2]]] = js.native
    def apply[R0, R1, R2, R3, P /* <: js.Array[Any] */](
      fns: js.Tuple4[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
          (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
          (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]])
        ]
    ): Function[P, js.Promise[Await[R3]]] = js.native
    def apply[R0, R1, R2, R3, R4, P /* <: js.Array[Any] */](
      fns: js.Tuple5[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
          (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
          (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
          (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]])
        ]
    ): Function[P, js.Promise[Await[R4]]] = js.native
    def apply[R0, R1, R2, R3, R4, R5, P /* <: js.Array[Any] */](
      fns: js.Tuple6[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
          (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
          (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
          (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
          (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]])
        ]
    ): Function[P, js.Promise[Await[R5]]] = js.native
    def apply[R0, R1, R2, R3, R4, R5, R6, P /* <: js.Array[Any] */](
      fns: js.Tuple7[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
          (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
          (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
          (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
          (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
          (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]])
        ]
    ): Function[P, js.Promise[Await[R6]]] = js.native
    def apply[R0, R1, R2, R3, R4, R5, R6, R7, P /* <: js.Array[Any] */](
      fns: js.Tuple8[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
          (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
          (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
          (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
          (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
          (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
          (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]])
        ]
    ): Function[P, js.Promise[Await[R7]]] = js.native
    def apply[R0, R1, R2, R3, R4, R5, R6, R7, R8, P /* <: js.Array[Any] */](
      fns: js.Tuple9[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
          (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
          (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
          (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
          (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
          (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
          (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]]), 
          (Function[js.Array[Await[R7]], R8]) | (Curry[Function[js.Array[Await[R7]], R8]])
        ]
    ): Function[P, js.Promise[Await[R8]]] = js.native
    def apply[R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, P /* <: js.Array[Any] */](
      fns: js.Tuple10[
          (Function[P, R0]) | (Curry[Function[P, R0]]), 
          (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
          (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
          (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
          (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
          (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
          (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
          (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]]), 
          (Function[js.Array[Await[R7]], R8]) | (Curry[Function[js.Array[Await[R7]], R8]]), 
          (Function[js.Array[Await[R8]], R9]) | (Curry[Function[js.Array[Await[R8]], R9]])
        ]
    ): Function[P, js.Promise[Await[R9]]] = js.native
  }
}
